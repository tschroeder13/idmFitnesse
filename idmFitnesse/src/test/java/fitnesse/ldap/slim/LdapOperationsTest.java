package fitnesse.ldap.slim;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import com.unboundid.ldap.sdk.LDAPException;

import fitnesse.slim.SlimException;

public class LdapOperationsTest {
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
	public void setUp() throws SlimException {
		new LdapSlimSetup(alias, host, 10636, true,admin, password);
		op = new LdapOperations(alias);
		if(!op.objectExists(testuser)){
			op.createObjectWithAttributesAndObjectclasses(
					testuser
					, new HashMap<String, String>(){{
						put("sn","Test-ser");
						put("givenName","Fit Nesse");
						}}
					, "top", "person", "organizationalPerson", "inetOrgPerson");
		}
	}

	@Test
	public void test() throws SlimException {
		assertFalse(op.attributeContainsValueForObject("st", "Baker Street", testuser));
	}

}
