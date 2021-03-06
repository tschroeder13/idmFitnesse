package fitnesse.ldap.slim;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.unboundid.ldap.sdk.LDAPException;

import fitnesse.slim.SlimException;

public class LdapOperationsTest {
	static String rdn = "cn=T99992";
	static String sup1 = "ou=t13699tst,ou=intranet,o=base,c=DE";
	static String sup2 = "o=Inactives,c=DE";
	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
	static String alias = "idmtest";
	static String host = "149.216.14.183";
	static String admin = "cn=AT0320,ou=Special,ou=Applications,o=base,c=DE";
	static String password = "ENC(yJoorVyvjH_QoCQsfeXmLQ)";
	static Date now = new Date();
	static HashMap<String, String> attributeMap;
	String testuser = rdn+","+sup1;
//	String testuser = "cn=T99991,ou=t13699tst,ou=intranet,o=base,c=DE";
	static LdapOperations op;
	
	@Before
	public void setUp() throws SlimException {
		new LdapSlimSetup(alias, host, 636, true,admin, password);
		op = new LdapOperations(alias);
		if(op.objectExists(testuser)){
			op.deleteObject(testuser);
		}
	}

	@Test
	public void _01createObject() throws SlimException {
		boolean result = false;
		result = op.createObjectWithAttributesAndObjectclasses(
				testuser
				, new HashMap<String, Object>(){{
					put("sn","Test-User");
					put("givenName","Fit Nesse");
					put("description",Arrays.asList("some text","abcdefg"));
				}}
				, "top", "person", "organizationalPerson", "inetOrgPerson");
	}

}
