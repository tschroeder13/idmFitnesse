package fitnesse.ldap.slim;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fitnesse.slim.SlimException;
@org.junit.FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LdapAttributeOperationsTest {
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

	@After
	public void teardown() throws SlimException{
//		op.deleteObject(testuser);
	}

	@Test
	public void _01addSingleAttribute() throws SlimException {
		assertTrue(op.addAttributeWithValueToObject("description", "Smutje", testuser));
	}
	
	@SuppressWarnings("serial")
	@Test
	public void _02addMultiAttribute() throws Exception {
		assertTrue(op.addAttributeValueMapToObject(new HashMap<String,String>(){{
														put("l","Port Royal");
														put("st","Baker Street");
													}}
													, testuser));
	}
	
	@Test
	public void _03replaceAttributeValue() throws Exception {
		assertTrue(op.replaceAttributesOldValueWithNewValueOnObject("st", "Baker Street", "Backstreet East", testuser));
	}
	
	@Test
	public void _04attributeExists() throws Exception {
		assertTrue(op.attributeExistsForObject("l", testuser));
	}

	@Test
	public void _05attributeValueExists() throws Exception {
		assertTrue(op.attributeContainsValueForObject("description", "Smutje", testuser));
	}
	@Test
	public void _06deleteSingleAttribute() throws Exception {
		assertTrue(op.deleteAttributeOnObject("description", testuser));
	}
	@SuppressWarnings("serial")
	@Test
	public void _07deleteMultipleAttributeValues() throws Exception {
		assertTrue(op.deleteAttributeValueMapFromObject(new HashMap<String,String>(){{
															put("l","Port Royal");
															put("st","Backstreet East");
														}}
														, testuser));
	}	//	deleteAttributeValueMapFromObject(Map<String, String>, String)

	
	@Test
	public void _99lastCheck() throws Exception {
		assertFalse(op.attributeExistsForObject("st", testuser));
		assertFalse(op.attributeExistsForObject("l", testuser));
	}
}
