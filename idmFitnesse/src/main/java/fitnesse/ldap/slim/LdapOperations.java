package fitnesse.ldap.slim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.unboundid.ldap.protocol.BindRequestProtocolOp;
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

	public boolean createObjectWithAttributesAndObjectclasses(String fqdn, Map<String, String> attributes,
			String... objectClass) throws SlimException {
		List<Attribute> attrs = new ArrayList<Attribute>();
		for (Map.Entry<String, String> entry : attributes.entrySet()) {
			attrs.add(new Attribute(entry.getKey(), entry.getValue()));
		}
		for (String clazz : objectClass) {
			attrs.add(new Attribute("objectClass", clazz));
		}
		Attribute arr[] = attrs.toArray(new Attribute[attributes.size()]);
		try {
			boolean success = connection.add(new AddRequest(fqdn, arr)).getResultCode().equals(ResultCode.SUCCESS);
			return success;
		} catch (LDAPException e) {
			throw new SlimException("Object \""+fqdn+"\" could not be created for following reason", e, true);
		}
	}

	public boolean deleteObject(String fqdn) throws SlimException {
		try {
			return connection.delete(new DeleteRequest(fqdn)).getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException("Object \""+fqdn+"\" could not be deleted for following reason.",e,true);
		}
	}

	public boolean deleteObjectIfExists(String fqdn) throws SlimException {
		if(objectExists(fqdn)){
			return deleteObject(fqdn);
		}
		return true;
	}
	
	public boolean objectExists(String fqdn) throws SlimException {
		try {
			SearchResultEntry entry = connection.getEntry(fqdn);
			if (null != entry) {
				//			LDAPTestUtils.assertEntriesExist(connection, Arrays.asList(fqdn));
				return true;
			}
		} catch (LDAPException e) {
			throw new SlimException("The object \"" + fqdn + "\" does not exist", e, true);
		}
		return false;
	}

	public boolean addAttributeWithValueToObject(String attrName, String attrValue, String fqdn) throws SlimException {
		try {
			boolean res = connection
					.modify(new ModifyRequest(fqdn, new Modification(ModificationType.ADD, attrName, attrValue)))
					.getResultCode().equals(ResultCode.SUCCESS);
			return res;
		} catch (LDAPException e) {
			throw new SlimException("Can not add attribute \"" + attrName + "\" with value \"" + attrValue
					+ "\" to object \"" + fqdn + "\" for the following LDAP Error", e, true);
		}
	}

	public boolean addAttributeValueMapToObject(Map<String, String> attrMap, String fqdn) throws SlimException {
		SearchResult sr = null;
		boolean result = false;
		try {
			for (java.util.Map.Entry<String, String> entry : attrMap.entrySet()) {
				result = connection
						.modify(new ModifyRequest(fqdn,
								new Modification(ModificationType.ADD, entry.getKey(), entry.getValue())))
						.getResultCode().equals(ResultCode.SUCCESS);
			}
		} catch (LDAPException e) {
			throw new SlimException("Could not add attributes to object \"" + fqdn + "\"",e,true);
		}
		return result;
	}

	public boolean replaceAttributesOldValueWithNewValueOnObject(String attrName, String oldValue, String newValue,
			String fqdn) throws SlimException, LDAPException {
		SearchResult sr = connection.search(new SearchRequest(fqdn, SearchScope.BASE, "objectClass=*", attrName));
		Entry entry = (Entry) sr.getSearchEntry(fqdn);
		String values[] = entry.getAttribute(attrName).getValues();
		List<String> list = Arrays.asList(values);
		list.set(list.indexOf(oldValue), newValue);
//		List<String> values = Arrays.asList(entry.getAttribute(attrName).getValues());
//		values.remove(oldValue);
//		values.add(newValue);
		try {
			return connection
					.modify(new ModifyRequest(fqdn,
							new Modification(ModificationType.REPLACE, attrName, (String[]) list.toArray())))
					.getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException("Cannot replace value \"" + oldValue + "\" with \"" + newValue + "\" on object \""
					+ fqdn + "\" for the following reason.", e, true);
		}
	}

	public boolean deleteAttributeOnObject(String attrName, String fqdn) throws SlimException {
		try {
			return connection.modify(new ModifyRequest(fqdn, new Modification(ModificationType.DELETE, attrName)))
					.getResultCode().equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException(
					"Could not delete attribute \"" + attrName + "\" from \"" + fqdn + "\" for following reason");
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
			throw new SlimException("An error occured, when deleting attributes and values from object \"" + fqdn, e,
					true);
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
			throw new SlimException("Attribute \"" + attrName + "\" does not exist for \"" + fqdn, e, true);
		}
	}

	public boolean attributeContainsValueForObject(String attrName, String containingValue, String fqdn)
			throws SlimException {
		try {
			boolean res = (connection.search(fqdn,SearchScope.BASE,
					Filter.createEqualityFilter(attrName, containingValue)).getEntryCount() !=0 );
			return res;
		} catch (LDAPException e) {
			throw new SlimException("The attribute \"" + "\" does not contain the value \"" + containingValue
					+ " on object \"" + fqdn + "\"", e, true);
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
			throw new SlimException("Could not add user \"" + user_fqdn + "\" to group \"" + group_fqdn + "\"", e,
					true);
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
		this.addAttributeWithValueToObject("userPassword", pwd, fqdn);
		return false;
	}

	public boolean userCanConnectToServerWithPassword(String fqdn, String server, String pwd) throws SlimException  {
		try {
			BindRequest lastBind = ((LDAPConnection)connection).getLastBindRequest();
			boolean res = ((LDAPConnection) connection).bind(fqdn, pwd).getResultCode().equals(ResultCode.SUCCESS);
			((LDAPConnection) connection).bind(lastBind);
			return res;
		} catch (LDAPException e) {
			throw new SlimException("Cannot bind user \""+fqdn+"\" to server \""+server+"\"",e,true);
		}
	}

	// public boolean userAccountIsEnabled(String fqdn) {
	// boolean result = false;
	//
	// return result;
	// }

	public boolean renameEntryTo(String old_fqdn, String new_fqdn) throws SlimException {
		if(new_fqdn.contains(",")){
			new_fqdn=new_fqdn.split(",")[0];
		}
		try {
			return connection.modifyDN(new ModifyDNRequest(old_fqdn, new_fqdn, true)).getResultCode()
					.equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException(
					"Could not rename \"" + old_fqdn + "\" to \n" + new_fqdn + "\" for the following reason.",e,true);
		}
	}

	public boolean moveEntryTo(String old_fqdn, String new_fqdn) throws SlimException {
		String rdn = old_fqdn.split(",")[0];
		String newSuperiorDn = new_fqdn;
		if(new_fqdn.startsWith(rdn)){
			newSuperiorDn = new_fqdn.replaceFirst(rdn+",", "");
		}
//		else{
//			rdn=rdn+","+newSuperiorDn;
//		}
		try {
			return connection.modifyDN(new ModifyDNRequest(old_fqdn, rdn, true, newSuperiorDn)).getResultCode()
					.equals(ResultCode.SUCCESS);
		} catch (LDAPException e) {
			throw new SlimException(
					"Could not move \"" + old_fqdn + "\" to \n" + new_fqdn + "\" for the following reason.",e,true);
		}
	}

}
