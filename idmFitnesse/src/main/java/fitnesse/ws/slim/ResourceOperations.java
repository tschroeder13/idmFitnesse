package fitnesse.ws.slim;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.experimental.theories.internal.Assignments;

import com.novell.www.resource.service.GetResourceAssignmentsForUserRequest;
import com.novell.www.resource.service.GetResourceAssignmentsForUserResponse;
import com.novell.www.resource.service.IRemoteResource;
import com.novell.www.resource.service.RequestResourceGrantRequest;
import com.novell.www.resource.service.RequestResourceGrantResponse;
import com.novell.www.resource.service.RequestResourceRevokeRequest;
import com.novell.www.resource.service.RequestResourceRevokeResponse;
import com.novell.www.resource.service.ResourceAssignment;
import com.novell.www.resource.service.ResourceAssignmentRequestStatus;
import com.novell.www.resource.service.ResourceRequestParam;

import fitnesse.StringPreparator;
import fitnesse.slim.SlimException;
import fitnesse.ws.services.NrfResourceServiceFactory;

public class ResourceOperations {
	private String alias ;
	private String url ;
	private String user;
	private String pwd;
	private IRemoteResource resourceService;
	
	public ResourceOperations(String alias, String url, String user, String pwd) {
		this.alias = alias;
		this.url = StringPreparator.prepareString(url);
		this.user = user;
		this.pwd = pwd;
		this.resourceService = NrfResourceServiceFactory.getService(alias);
		if(this.resourceService==null){
			NrfResourceServiceFactory.registerService(this.alias, this.url, this.user, this.pwd);
		}
	}

	public ResourceOperations(String alias) throws SlimException {
		this.resourceService = NrfResourceServiceFactory.getService(alias);
		if (this.resourceService==null) {
			throw new SlimException("There is no Resource service available for alias: "+alias, true);
		}
	}

	public static final Logger LOG = Logger.getLogger(ResourceOperations.class.getName());

	public List<List> getResourcesForUserOnServer(String userDn, String alias) {
		return getAssingmentList(userDn, alias);
	}

	public String addResourceToUserOnServer(String resourceDn, String userDn, String alias) {
		return addAssignment(userDn, resourceDn, alias, null, null);
	}

	public String addResourceToUserOnServerWithParameter(String resourceDn, String userDn, String alias,
			Map<String, String> params) {
		return addAssignment(userDn, resourceDn, alias, params, null);
	}

	public String addResourceToUserOnServerWithParameterAndRequester(String resourceDn, String userDn, String alias,
			Map<String, String> params, String requester) {
		return addAssignment(userDn, resourceDn, alias, params, requester);
	}

	public String removeResourceFromUserOnServer(String resourceDn, String userDn, String alias) {
		return revokeAssignment(userDn, resourceDn, alias);
	}

	public boolean resourceIsAssignedToUserOnServer(String resourceDn, String userDn, String alias) {
		ResourceAssignment[] assignments = getAssingments(userDn, alias);
		for (ResourceAssignment ass : assignments) {
			if (ass.getResourceDn().equals(resourceDn)) {
				return true;
			}
		}
		return false;
	}
	public boolean resourceIsNotAssignedToUserOnServer(String resourceDn, String userDn, String alias) {
		ResourceAssignment[] assignments = getAssingments(userDn, alias);
		for (ResourceAssignment ass : assignments) {
			if (ass.getResourceDn().equals(resourceDn)) {
				return false;
			}
		}
		return true;
	}

	private List<List> getAssingmentList(String userDn, String alias) {
		ResourceAssignment[] assignment = getAssingments(userDn, alias);
		final List<List> resultList = new ArrayList<List>(assignment.length);
		Arrays.asList(assignment).forEach((ResourceAssignment ass) -> {
			StringBuilder sb = new StringBuilder();
			Arrays.asList(ass.getRequestParams()).forEach((ResourceRequestParam par)->{
				sb.append(par.getName()+": "+par.getValue());
			});
			resultList.add(new ArrayList<List>(3) {
				{
					add(new ArrayList<String>(2) {
						{
							add("recipientDn");
							add(ass.getRecipientDn());
						}
					});
					add(new ArrayList<String>(2) {
						{
							add("resourceDn");
							add(ass.getResourceDn());
						}
					});
					add(new ArrayList<String>(2) {
						{
							add("reason");
							add(ass.getReason());
						}
					});
					add(new ArrayList<String>(2) {
						{
							add("requesterDn");
							add(ass.getRequesterDn());
						}
					});
					add(new ArrayList<String>(2) {
						{
							add("requestDate");
							add(ass.getRequestDate().toInstant().toString());
						}
					});
					add(new ArrayList<String>(2) {
						{
							add("requestParams");
							add(sb.toString());
						}
					});
					add(new ArrayList<String>(2) {
						{
							add("instanceGuid");
							add(ass.getInstanceGuid());
						}
					});
				}
			});
		});
		return resultList;
	}

	private ResourceAssignment[] getAssingments(String userDn, String alias) {
		ResourceAssignment[] assignment = null;
		try {
			GetResourceAssignmentsForUserRequest request = new GetResourceAssignmentsForUserRequest();
			request.setUserDn(userDn);
			IRemoteResource service = NrfResourceServiceFactory.getService(alias);
			GetResourceAssignmentsForUserResponse response = service.getResourceAssignmentsForUser(request);
			assignment = response.getResult();
			LOG.log(Level.INFO, "Found " + assignment.length + " resource assignments for user " + userDn);

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assignment;
	}

	private String addAssignment(String userDn, String resourceDn, String alias, Map<String, String> params,
			String requester) {
		String result = null;
		List<ResourceRequestParam> requestParams = new ArrayList<>();
		RequestResourceGrantRequest request = new RequestResourceGrantRequest();
		request.setResourceTarget(resourceDn);
		request.setUserTarget(userDn);
		if (params != null) {
			params.forEach((key, value) -> requestParams.add(new ResourceRequestParam(key, value)));
			request.setRequestParams(
					(ResourceRequestParam[]) requestParams.toArray(new ResourceRequestParam[requestParams.size()]));
		}
		if (requester != null) {
			request.setRequester(requester);
		} else {
			request.setRequester("FitNesse Testsystem");
		}
		RequestResourceGrantResponse response;
		try {
			response = NrfResourceServiceFactory.getService(alias).requestResourceGrant(request);
			result = response.getResult();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	private String revokeAssignment(String userDn, String resourceDn, String alias) {
		String result = null;
		RequestResourceRevokeRequest request = new RequestResourceRevokeRequest();
		request.setResourceTarget(resourceDn);
		request.setUserTarget(userDn);
		RequestResourceRevokeResponse response;
		try {
			response = NrfResourceServiceFactory.getService(alias).requestResourceRevoke(request);
			result = response.getResult();
			System.out.println(result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
