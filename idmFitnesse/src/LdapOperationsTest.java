package fitnesse.ldap.slim;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.unboundid.ldap.sdk.LDAPException;

import fitnesse.slim.SlimException;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LdapOperationsTest {
	private static final String testgroup = "cn=testGroup,ou=groups,o=data";
	private static final String testuser2 = "cn=testuser2,ou=users,o=data";
	static String alias = "guhdemo";
	static String host = "172.16.66.210";
	static String admin = "cn=admin,ou=sa,o=system";
	static String password = "ENC(nHgy_NBECxliK78756zISw)";
	static String testuser = "cn=testuser,ou=users,o=data";
	static HashMap<String, String> attributeMap = new HashMap<String, String>(){{
		put("sn","testuser");
		put("givenName","Henry");
		put("description","FitNesse Test User");
	}};
	
	static LdapOperations op;
	
	@Before
	public void setUp() throws Exception {
		new LdapSlimSetup(alias, host, 636, true,admin, password);
		op = new LdapOperations(alias);
	}

	@Test
	public void test01ObjectExists() throws LDAPException, AssertionError, SlimException {
		assertTrue(op.objectExists(admin));
	}

	@Test
	public void test02CreateObjectWithAttributesAndObjectclasses() throws LDAPException, AssertionError, SlimException {
		assertTrue(op.createObjectWithAttributesAndObjectclasses(testuser, attributeMap, "top", "person","inetOrgPerson"));
	}

	@Test
	public void test03ObjectExists2() throws LDAPException, AssertionError, SlimException {
		assertTrue(op.objectExists(testuser));
	}

	@Test
	public void test04AddAttributeWithValueToObject() throws SlimException {
		assertTrue(op.addAttributeWithValueToObject("l", "hinterm deich", testuser));
	}


	@Test
	public void test05AddAttributeValueMapToObject() {
		Map<String, String> moreAttrs = new HashMap<String, String>(){{
			put("description","more stuff");
			put("st","Elmstreet");
		}};
	}

	@Test
	public void test06AttributeExistsForObject() throws LDAPException, AssertionError, SlimException {
		assertTrue(op.attributeExistsForObject("st", testuser));
	}

	@Test
	public void test07ReplaceAttributesOldValueWithNewValueOnObject() throws LDAPException, SlimException {
		assertTrue(op.replaceAttributesOldValueWithNewValueOnObject("st", "Elmstreet", "Broadway", testuser));
	}

	@Test
	public void test08DeleteAttributeOnObject() throws SlimException {
		assertTrue(op.deleteAttributeOnObject("st", testuser));
	}

	
	@Test
	public void test09AttributeContainsValueForObject() throws LDAPException, AssertionError, SlimException {
		assertTrue(op.attributeContainsValueForObject("description", "more stuff", testuser));
	}
	@Test
	public void test10DeleteAttributeValueMapFromObject() throws SlimException {
		assertTrue(op.deleteAttributeValueMapFromObject(new HashMap<String, String>(){{
			put("description","more stuff");
			put("st","Broadway");
		}}, testuser));
	}

	@Test
	public void test11CreateTestGroup() throws LDAPException, AssertionError, SlimException {
		assertTrue(op.createObjectWithAttributesAndObjectclasses(
				testgroup, null, "top", "groupOfNamesS"));
	}

	@Test
	public void test12AddUserToGroup() throws SlimException {
		assertTrue(op.addUserToGroup(testuser, testgroup));
	}

	@Test
	public void test13UserIsGroupMember() throws LDAPException, AssertionError, SlimException {
		assertTrue(op.attributeContainsValueForObject("member", testuser, testgroup));
	}
	
	
	@Test
	public void test14RemoveUserFromGroup() throws SlimException {
		assertTrue(op.removeUserFromGroup(testuser, testgroup));
	}

	@Test
	public void test15SetPasswordFor() throws SlimException {
		assertTrue(op.setPasswordFor("p4ssWord", testuser));
	}

	@Test
	public void test16UserCanConnectToServerWithPassword() throws LDAPException {
		assertTrue(op.userCanConnectToServerWithPassword(testuser, host, "p4ssWord"));;
	}

	@Test
	public void test17RenameEntryTo() throws SlimException {
		assertTrue(op.renameEntryTo(testuser, testuser2));
	}
	
	@Test
	public void test18renameSuccess() throws LDAPException, AssertionError, SlimException{
		assertTrue(op.objectExists(testuser2));
	}
	
	@Test
	public void test19MoveEntryTo() throws SlimException {
		assertTrue(op.moveEntryTo(testuser2, testuser));
	}

	@Test
	public void test20DeleteObject() throws Exception {
		assertTrue(op.deleteObject(testuser));
	}
}
