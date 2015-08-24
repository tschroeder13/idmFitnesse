package fitnesse.ldap.slim;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.unboundid.ldap.sdk.AddRequest;
import com.unboundid.ldap.sdk.Attribute;
import com.unboundid.ldap.sdk.DeleteRequest;
import com.unboundid.ldap.sdk.Entry;
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.LDAPInterface;
import com.unboundid.ldap.sdk.Modification;
import com.unboundid.ldap.sdk.ModificationType;
import com.unboundid.ldap.sdk.ModifyRequest;
import com.unboundid.ldap.sdk.ResultCode;
import com.unboundid.ldap.sdk.SearchRequest;
import com.unboundid.ldap.sdk.SearchResult;
import com.unboundid.ldap.sdk.SearchResultEntry;
import com.unboundid.ldap.sdk.SearchScope;
import com.unboundid.ldap.sdk.extensions.PasswordModifyExtendedRequest;
import com.unboundid.ldap.sdk.extensions.PasswordModifyExtendedResult;
import com.unboundid.util.LDAPTestUtils;

import fitnesse.ldap.services.LdapConnectionFactory;
import fitnesse.slim.StopTestSlimException;

public class LdapOperations {
	
	static private LDAPInterface connection;
	static private String alias;
	
	
	public LdapOperations(String alias) throws StopTestSlimException, LDAPException {
		this.alias = alias;
		connection = LdapConnectionFactory.getLdapConnection(alias);
	}
	
	public boolean createObjectWithAttributesAndObjectclasses(String fqdn, Map<String, String> attributes, String... objectClass) throws LDAPException {
		Attribute attrs[] = null;
		for(Map.Entry<String, String> entry : attributes.entrySet()){
			attributes.put(entry.getKey(), entry.getValue());
		}
		for (String clazz : objectClass) {
			attributes.put("objectClass", clazz);
		}
		return connection.add(new AddRequest(fqdn, attrs)).getResultCode().getName().equals("SUCCESS");
	}
	public boolean deleteObject(String fqdn) throws LDAPException{
		return connection.delete(new DeleteRequest(fqdn)).getResultCode().equals("SUCCESS");
	}

//	public String getEntryDnForRdnInSearchBase(String rdn,
//			String searchbase) throws LDAPException{
//		return LDAPTestUtils.getMissingEntryDNs(connection, rdn).get(0);
//	}

	public boolean objectExists(String fqdn) throws LDAPException, AssertionError{
			LDAPTestUtils.assertEntriesExist(connection, Arrays.asList(fqdn));
			return true;
	}

//	public boolean addAttributeValueMapToObject(Map attributes, String fqdn){
//		connection.mo
//		return false;
//	}

	public boolean addAttributeWithValueToObject(String attrName,
			String attrValue, String fqdn) throws LDAPException{
		return connection.modify(
				new ModifyRequest(fqdn, new Modification(ModificationType.ADD, attrName, attrValue))
				).getResultCode().equals("SUCCESS");
	}

	public boolean replaceAttributesOldValueWithNewValueOnObject(
			String attrName, String oldValue, String newValue, String fqdn) throws LDAPException{
		SearchResult sr = connection.search(new SearchRequest(fqdn, SearchScope.BASE, "objectClass=*", attrName));
		Entry entry = (Entry) sr.getSearchEntries().toArray()[0];
		List<String> values = Arrays.asList(entry.getAttribute(attrName).getValues());
		values.remove(oldValue);
		values.add(newValue);
		return connection.modify(
				new ModifyRequest(fqdn, new Modification(ModificationType.REPLACE, attrName, values.toString()))
				).getResultCode().equals(ResultCode.SUCCESS);
	}

	public boolean deleteAttributeValueMapFromObject(Map<String, String> attr,
			String fqdn){return false;}

	public boolean deleteAttributeOnObject(String attrName, String fqdn){return false;}

//	public String getAttributeForObject(String attrName, String fqdn) throws LDAPSearchException, LDAPException{
//		SearchResult sr = connection.search(new SearchRequest(fqdn, SearchScope.BASE, "objectClass=*", attrName));
//		Entry entry = (Entry) sr.getSearchEntries().toArray()[0];
//		List<String> values = Arrays.asList(entry.getAttribute(attrName).getValues());
//		return false;
//	}

	public boolean attributeExistsForObject(String attrName, String fqdn) throws LDAPException, AssertionError{
		LDAPTestUtils.assertAttributeExists(connection, fqdn, attrName);
		return true;
	}

	public boolean attributeContainsValueForObject(String attrName,
			String containingValue, String fqdn) throws LDAPException, AssertionError{
		LDAPTestUtils.assertValueExists(connection, fqdn, attrName, containingValue);
		return true;
	}

//	public boolean valueOfAttributeIsEqualForObject(String equalValue,
//			String attrName, String fqdn){return false;}

	private boolean user2group(ModificationType type, String user_fqdn, String group_fqdn) throws LDAPException{
		ResultCode userRC = connection.modify(user_fqdn, new Modification(type, "groupmembership", group_fqdn)).getResultCode();
		ResultCode groupRC = connection.modify(group_fqdn, new Modification(type, "member", user_fqdn)).getResultCode();
		return (userRC.equals(ResultCode.SUCCESS) && groupRC.equals(ResultCode.SUCCESS));
		
	}
	
	public boolean addUserToGroup(String user_fqdn, String group_fqdn) throws LDAPException{
		return user2group(ModificationType.ADD, user_fqdn, group_fqdn);
	}

	public boolean removeUserFromGroup(String user_fqdn, String group_fqdn) throws LDAPException{
		return user2group(ModificationType.DELETE, user_fqdn, group_fqdn);
	}

	public boolean setPasswordFor(String pwd, String fqdn) throws LDAPException{
		
		return setPassword(fqdn, pwd);
	}
	public boolean setPassword(String fqdn, String pwd) throws LDAPException{
		this.addAttributeWithValueToObject("userPassword", pwd, fqdn);
		return false;
	}

	public boolean userCanConnectToServerWithPassword(String fqdn,
			String server, String pwd) throws LDAPException{
		return ((LDAPConnection)connection).bind(fqdn, pwd).getResultCode().equals(ResultCode.SUCCESS);
	}

	public boolean userAccountIsEnabled(String fqdn){return false;}

	public boolean renameEntryTo(String old_fqdn, String new_fqdn){return false;}

	public boolean moveEntryTo(String old_fqdn, String new_fqdn){return false;}

	public boolean renameUserTo(String old_fqdn, String new_fqdn){return false;}

	public boolean moveUserTo(String old_fqdn, String new_fqdn){return false;}

	
	public static void main(String[] args) {
		try {
			String alias = "idmtest";
			String bindDn = "cn=AT0320,ou=Special,ou=Applications,o=base,c=DE";
			String bindPw= "ENC(5SXkG-r8dei9CID-M-qLxw)";
			String server = "is2181.ds.server.dom"; 
			int port = 636;
			LdapSlimSetup ldap = new LdapSlimSetup(alias,server,port,true, bindDn, bindPw);
			LdapOperations idmtest = new LdapOperations("idmtest");
			System.out.println(idmtest.objectExists("cn=ATxx0320,ou=Special,ou=Applications,o=base,c=DE"));
			ldap.closeAll();
		} catch (StopTestSlimException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LDAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AssertionError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


