package fitnesse.ldap.slim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.unboundid.ldap.sdk.AddRequest;
import com.unboundid.ldap.sdk.Attribute;
import com.unboundid.ldap.sdk.BindRequest;
import com.unboundid.ldap.sdk.DeleteRequest;
import com.unboundid.ldap.sdk.Entry;
import com.unboundid.ldap.sdk.Filter;
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.LDAPInterface;
import com.unboundid.ldap.sdk.Modification;
import com.unboundid.ldap.sdk.ModificationType;
import com.unboundid.ldap.sdk.ModifyDNRequest;
import com.unboundid.ldap.sdk.ModifyRequest;
import com.unboundid.ldap.sdk.ResultCode;
import com.unboundid.ldap.sdk.SearchRequest;
import com.unboundid.ldap.sdk.SearchResult;
import com.unboundid.ldap.sdk.SearchResultEntry;
import com.unboundid.ldap.sdk.SearchScope;

import fitnesse.StringPreparator;
import fitnesse.ldap.services.LdapConnectionFactory;
import fitnesse.slim.SlimException;
import fitnesse.slim.StopTestSlimException;

public class LdapOperations {

	static private LDAPInterface connection;
	static private String alias;
	private boolean result;

	public LdapOperations(String alias) throws StopTestSlimException {
		this.alias = alias;
		connection = LdapConnectionFactory.getLdapConnection(alias);
	}

	public boolean createObjectWithAttributesAndObjectclasses(String fqdn, Map<String, Object> attributes,
			String... objectClass) throws SlimException {
		List<Attribute> attrs = new ArrayList<Attribute>();
		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			if ( entry.getValue() instanceof String) {
				String value = (String) entry.getValue();
				attrs.add(new Attribute(entry.getKey(), value));
			}
			if ( entry.getValue() instanceof List<?>) {
				@SuppressWarnings("unchecked")
				List<String> value = ((List<String>) entry.getValue());
				attrs.add(new Attribute(entry.getKey(), value));
			}
		}
		for (String clazz : objectClass) {
			attrs.add(new Attribute("objectClass", clazz));
		}
		Attribute arr[] = attrs.toArray(new Attribute[attributes.size()]);
		try {
			boolean success = connection.add(new AddRequest(fqdn, arr)).getResultCode().equals(ResultCode.SUCCESS);
			return success;
		} catch (LDAPException e) {
			e.printStackTrace();
			throw new SlimException("message:<<Object \""+fqdn+"\" could not be created for following reason: \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}

	public boolean deleteObject(String fqdn) throws SlimException {
		try {
			return connection.delete(new DeleteRequest(fqdn)).getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException("message:<<Object \""+fqdn+"\" could not be deleted for following reason.\n"+e.getDiagnosticMessage()+">>",true);
		}
	}

	public boolean deleteObjectIfExists(String fqdn) throws SlimException {
		if(objectExists(fqdn)){
			return deleteObject(fqdn);
		}
		return false;
	}
	
	public boolean objectExists(String fqdn) throws SlimException {
		try {
			SearchResultEntry entry = connection.getEntry(fqdn);
			if (null != entry) {
				//			LDAPTestUtils.assertEntriesExist(connection, Arrays.asList(fqdn));
				return true;
			}
		} catch (LDAPException e) {
			throw new SlimException("message:<<The object \"" + fqdn + "\" does not exist. \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
		return false;
	}

	public boolean addAttributeWithValueToObject(String attrName, Object attrValue, String fqdn) throws SlimException {
		try {
			boolean res = false;
			if (attrValue instanceof String) {
				String singleValue = StringPreparator.prepareString((String) attrValue);
				res  = connection
						.modify(new ModifyRequest(fqdn, new Modification(ModificationType.ADD, attrName, singleValue)))
						.getResultCode().equals(ResultCode.SUCCESS);
			}
			if (attrValue instanceof List<?>) {
				List<String> multiValue = (List<String>) attrValue;
				res = connection
						.modify(new ModifyRequest(fqdn, new Modification(ModificationType.ADD, attrName, multiValue.toArray(new String[multiValue.size()]))))
						.getResultCode().equals(ResultCode.SUCCESS);
			}
			return res;
		} catch (LDAPException e) {
			throw new SlimException("message:<<Can not add attribute \"" + attrName + "\" with value \"" + attrValue
					+ "\" to object \"" + fqdn + "\" for the following LDAP Error: \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}

	public boolean addAttributeValueMapToObject(Map<String, Object> attrMap, String fqdn) throws SlimException {
		SearchResult sr = null;
		boolean result = false;
		try {
			for (java.util.Map.Entry<String, Object> entry : attrMap.entrySet()) {
				Object value = entry.getValue();
				if (value instanceof String) {
					String singleValue = (String) value;
					result = connection
							.modify(new ModifyRequest(fqdn,
									new Modification(ModificationType.ADD, entry.getKey(), singleValue)))
							.getResultCode().equals(ResultCode.SUCCESS);
				}
				if (value instanceof List<?>) {
					List<String> multiValue = (List<String>) value;
					result = connection
							.modify(new ModifyRequest(fqdn,
									new Modification(ModificationType.ADD, entry.getKey(), multiValue.toArray(new String[multiValue.size()]))))
							.getResultCode().equals(ResultCode.SUCCESS);
				}
			}
		} catch (LDAPException e) {
			throw new SlimException("message:<<Could not add attributes to object \"" + fqdn + "\" for the following reason:\n"+e.getDiagnosticMessage()+"\n>>",true);
		}
		return result;
	}

	public boolean setAttributeValueOnObject(String attrName, Object value, String fqdn) throws SlimException {
		boolean res = false;
		try {
			if (value instanceof String) {
				String singleValue = (String) value;
				res = connection
						.modify(new ModifyRequest(fqdn,
								new Modification(ModificationType.REPLACE, attrName, singleValue)))
						.getResultCode().equals(ResultCode.SUCCESS);
			}
			if (value instanceof List<?>) {
				List<String> multiValue = (List<String>) value;
				res = connection
						.modify(new ModifyRequest(fqdn,
								new Modification(ModificationType.REPLACE, attrName, multiValue.toArray(new String[multiValue.size()]))))
						.getResultCode().equals(ResultCode.SUCCESS);
			}
			
			return res;
		} catch (LDAPException e) {
			throw new SlimException("message:<<Cannot set value \"" + value + "\" on object \""
					+ fqdn + "\" for the following reason. \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}
	
	public boolean replaceAttributesOldValueWithNewValueOnObject(String attrName, String oldValue, String newValue,
			String fqdn) throws SlimException {
		try {
			SearchResult sr = connection.search(new SearchRequest(fqdn, SearchScope.BASE, "objectClass=*", attrName));
			Entry entry = (Entry) sr.getSearchEntry(fqdn);
			String values[] = entry.getAttribute(attrName).getValues();
			List<String> list = Arrays.asList(values);
			list.set(list.indexOf(oldValue), newValue);
			return connection
					.modify(new ModifyRequest(fqdn,
							new Modification(ModificationType.REPLACE, attrName, (String[]) list.toArray())))
					.getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException("message:<<Cannot replace value \"" + oldValue + "\" with \"" + newValue + "\" on object \""
					+ fqdn + "\" for the following reason. \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}

	public boolean deleteAttributeOnObject(String attrName, String fqdn) throws SlimException {
		try {
			return connection.modify(new ModifyRequest(fqdn, new Modification(ModificationType.DELETE, attrName)))
					.getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException(
					"Could not delete attribute \"" + attrName + "\" from \"" + fqdn + "\" for following reason:\n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	
	}

	public boolean deleteAttributeValueMapFromObject(Map<String, String> attr, String fqdn) throws SlimException {
		boolean result = false;
		try {
			for (java.util.Map.Entry<String, String> entry : attr.entrySet()) {
				result = connection
						.modify(new ModifyRequest(fqdn,
								new Modification(ModificationType.DELETE, entry.getKey(), entry.getValue())))
						.getResultCode().equals(ResultCode.SUCCESS);

			}
		} catch (LDAPException e) {
			throw new SlimException("message:<<Could not delete attributes from Object \""+ fqdn + "\" for the following reason: \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
		return result;
	}

	public boolean attributeExistsForObject(String attrName, String fqdn)
			throws LDAPException, AssertionError, SlimException {
		try {
			boolean res = (connection.search(fqdn, SearchScope.BASE,
		             Filter.createPresenceFilter(attrName)).getEntryCount()!=0);
			return res;
		} catch (LDAPException e) {
			throw new SlimException("message:<<Attribute \"" + attrName + "\" does not exist for \"" + fqdn +" \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}

	public boolean attributeContainsValueForObject(String attrName, String containingValue, String fqdn)
			throws SlimException {
		String value = StringPreparator.prepareString(containingValue);
		try {
			boolean res = (connection.search(fqdn,SearchScope.BASE,
					Filter.createEqualityFilter(attrName, value)).getEntryCount() !=0 );
			return res;
		} catch (LDAPException e) {
			throw new SlimException("message:<<The attribute \"" + "\" does not contain the value \"" + value
					+ " on object \"" + fqdn + "\" \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}

	// public boolean valueOfAttributeIsEqualForObject(String equalValue,
	// String attrName, String fqdn){return false;}

	private boolean user2group(ModificationType type, String user_fqdn, String group_fqdn) throws SlimException {
		ResultCode userRC = null;
		ResultCode groupRC = null;
		try {
			userRC = connection.modify(user_fqdn, new Modification(type, "groupmembership", group_fqdn))
					.getResultCode();
			groupRC = connection.modify(group_fqdn, new Modification(type, "member", user_fqdn)).getResultCode();
		} catch (LDAPException e) {
			throw new SlimException("message:<<Could not add user \"" + user_fqdn + "\" to group \"" + group_fqdn + "\" \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
		return (userRC.equals(ResultCode.SUCCESS) && groupRC.equals(ResultCode.SUCCESS));

	}
	
	public boolean addUserToGroup(String user_fqdn, String group_fqdn) throws SlimException {
		return user2group(ModificationType.ADD, user_fqdn, group_fqdn);
	}

	public boolean removeUserFromGroup(String user_fqdn, String group_fqdn) throws SlimException {
		return user2group(ModificationType.DELETE, user_fqdn, group_fqdn);
	}

	public boolean setPasswordFor(String pwd, String fqdn) throws SlimException {

		return setPassword(fqdn, pwd);
	}

	public boolean setPassword(String fqdn, String pwd) throws SlimException {
		return addAttributeWithValueToObject("userPassword", pwd, fqdn);
	}

	public boolean userCanConnectToServerWithPassword(String fqdn, String server, String pwd) throws SlimException  {
		try {
			BindRequest lastBind = ((LDAPConnection)connection).getLastBindRequest();
			boolean res = ((LDAPConnection) connection).bind(fqdn, pwd).getResultCode().equals(ResultCode.SUCCESS);
			((LDAPConnection) connection).bind(lastBind);
			return res;
		} catch (LDAPException e) {
			throw new SlimException("message:<<Cannot bind user \""+fqdn+"\" to server \""+server+"\" for the following reason:   \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}

	public boolean renameEntryTo(String old_fqdn, String new_rdn) throws SlimException {
		if(new_rdn.contains(",")){
			new_rdn=new_rdn.split(",")[0];
		}
		try {
			return connection.modifyDN(new ModifyDNRequest(old_fqdn, new_rdn, true)).getResultCode()
					.equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException(
					"Could not rename \"" + old_fqdn + "\" to \n" + new_rdn + "\" for the following reason.",e,true);
		}
	}

	public boolean moveEntryTo(String old_dn, String new_rdn, String new_superior) throws SlimException {
		try {
			return connection.modifyDN(new ModifyDNRequest(old_dn, new_rdn, true, new_superior)).getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException(
					"Could not move \"" + old_dn + "\" to \n" + new_rdn +","+new_superior+ "\" for the following reason: \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
		
	}
	
	public boolean moveEntryTo(String old_fqdn, String new_superior) throws SlimException {
		String rdn = old_fqdn.split(",")[0];
		try {
			return connection.modifyDN(new ModifyDNRequest(old_fqdn, rdn, true, new_superior)).getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException(
					"Could not move \"" + old_fqdn + "\" to \n" + new_superior + "\" for the following reason: \n"+e.getDiagnosticMessage()+"\n>>",true);
		}
	}
}
