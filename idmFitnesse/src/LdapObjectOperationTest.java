package fitnesse.ldap.slim;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.unboundid.ldap.sdk.LDAPException;

import fitnesse.slim.SlimException;

public class LdapObjectOperationTest {
	static String testuser = "cn=Michael Pomoroi,ou=people,o=sevenSeas";
	static String testuser2 = "cn=Michael Pomoroi-Smith,ou=people,o=sevenSeas";
	static String testgroup = "cn=HMS Bounty,ou=crews,ou=groups,o=sevenSeas";
	static String alias = "sevenSeas";
	static String host = "127.0.0.1";
	static String admin = "uid=admin,ou=system";
	static String password = "ENC(YQ7VeC-c7eLiKrTtkxoo9Q)";
	static HashMap<String, String> attributeMap = new HashMap<String, String>(){{
		put("sn","testuser");
		put("givenName","Henry");
		put("description","FitNesse Test User");
	}};

	static LdapOperations op;
	
	@Before
	public void setUp() throws Exception {
		new LdapSlimSetup(alias, host, 10636, true,admin, password);
		op = new LdapOperations(alias);
		if(op.objectExists(testuser)){
			op.deleteObject(testuser);
		}
	}

	@Test
	public void createTest() throws SlimException{
		assertTrue(op.createObjectWithAttributesAndObjectclasses(
				testuser
				, new HashMap<String, String>(){{
					put("sn","Test-ser");
					put("givenName","Fit Nesse");
					}}
				, "top", "person", "organizationalPerson", "inetOrgPerson"));
		assertTrue(op.objectExists(testuser));
		assertTrue(op.renameEntryTo(testuser, "cn=Michael Pomoroi-Smith"));
		assertTrue(op.objectExists(testuser2));
		assertTrue(op.renameEntryTo(testuser2, "cn=Michael Pomoroi"));
		assertTrue(op.moveEntryTo(testuser, "ou=others,o=sevenSeas"));
		assertTrue(op.objectExists("cn=Michael Pomoroi,ou=others,o=sevenSeas"));
		assertTrue(op.moveEntryTo("cn=Michael Pomoroi,ou=others,o=sevenSeas",testuser));
		assertTrue(op.objectExists(testuser));
		assertTrue(op.deleteObject(testuser));
	}
}
