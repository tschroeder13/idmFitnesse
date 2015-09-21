package fitnesse.ws.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;

import com.novell.www.resource.service.IRemoteResource;
import com.novell.www.resource.service.ResourceServiceLocator;

public class NrfResourceServiceFactory {

	protected static Map<String, NrfResourceServiceDetail> resourceServices = new ConcurrentHashMap<>();
	
	public static boolean registerService(String alias,
			String serviceUrl,
			String resourceAdminDn,
			String resourceAdminPwd) {
		ResourceServiceLocator locater = new ResourceServiceLocator();
		IRemoteResource service = null;
		try {
			service =locater.getIRemoteResourcePort(new URL(serviceUrl));
			((Stub)service)._setProperty(Call.USERNAME_PROPERTY, resourceAdminDn);
			((Stub)service)._setProperty(Call.PASSWORD_PROPERTY, resourceAdminPwd);
			
		} catch (MalformedURLException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resourceServices.put(alias, new NrfResourceServiceDetail(resourceAdminPwd, resourceAdminPwd, serviceUrl, service));
		
		return true;
	}

	public static IRemoteResource getService(String alias) {
		// TODO Auto-generated method stub
		return resourceServices.get(alias).resourceService;
	}
}
