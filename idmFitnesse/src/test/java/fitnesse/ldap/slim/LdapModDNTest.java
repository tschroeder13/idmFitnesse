package fitnesse.ldap.slim;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fitnesse.slim.SlimException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LdapModDNTest {
	static String rdn = "cn=T99991";
	static String sup1 = "ou=intranet,o=base,c=DE";
	static String sup2 = "o=Inactives,c=DE";
	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
	static String alias = "idmtest";
	static String host = "149.216.14.183";
	static String admin = "cn=AT0320,ou=Special,ou=Applications,o=base,c=DE";
	static String password = "ENC(yJoorVyvjH_QoCQsfeXmLQ)";
	static Date now = new Date();
	static HashMap<String, String> attributeMap;

	static LdapOperations op;
	
	@Before
	public void setUp() throws SlimException {
		cal.add(Calendar.YEAR, -1);
		attributeMap= new HashMap<String, String>(){{
			put("sn","testuser");
			put("cn", "T99991");
			put("sn", "Schroeder_Test");
			put("givenName", "Tobias_Test");
			put("degDeletedTimestamp", new SimpleDateFormat("yyyyMMddHHmmss").format(cal.getTime())+"Z");
			put("co", "Germany");
			put("company", "Evonik Business Services (Legal siehe 810004)");
			put("costCenter", "12345");
			put("degAccountType", "primary");
			put("degAdsOfficeString", "- // Marl // - / -");
			put("degAutoGroupMembershipStatus", "FALSE");
			put("degBusinessArea", "Other");
			put("degBusinessAreaID", "6");
			put("degChargeIDM", "FALSE");
			put("degChargeSEC", "FALSE");
			put("degChargeWAN", "FALSE");
			put("degCompanyCode", "583");
			put("degCompanyNumber", "800045");
			put("degCountryCode", "11");
			put("degCountryISOcodeCompany", "DE");
			put("degCountryISOcodeLocation", "DE");
			put("degDeleted", "1");
			put("degExternalEmployee", "0");
			put("degHRStatus", "3");
			put("degImportSecret", "819363");
			put("degIntPhoneBook", "FALSE");
			put("degITCostcenter", "12345");
			put("degKontArtID", "KST");
			put("degLocationCode", "330");
			put("degPwdSyncDirection", "3");
			put("degRegion", "Europe");
			put("degServiceLDAP", "TRUE");
			put("degServiceRASrescueMode", "FALSE");
			put("degTochterID", "1");
			put("degWANCode", "156");
			put("displayName", "Tobias_Test Schroeder_Test"); 
			put("fullName", "Tobias_Test Schroeder_Test"); 
			put("l", "Marl");
			put("postalCode", "45772");
		}};
		new LdapSlimSetup(alias, host, 636, true,admin, password);
		op = new LdapOperations(alias);
	}
	
	@Test
	public void _01create() throws Exception {
		assertTrue(op.createObjectWithAttributesAndObjectclasses(rdn+","+sup1, attributeMap, "top", "person", "inetOrgPerson", "degUser"));
	}
	
	@Test
	public void _02modDn() throws Exception {
		assertTrue(op.moveEntryTo(rdn+","+sup1, rdn, sup2));
	}
	@Test
	public void _03modDn() throws Exception {
		assertTrue(op.moveEntryTo(rdn+","+sup2,sup1));
	}
//	
//	@Test
//	public void _99delete() throws Exception {
//		assertTrue(op.deleteObjectIfExists(rdn+","+sup2));
//	}

}
