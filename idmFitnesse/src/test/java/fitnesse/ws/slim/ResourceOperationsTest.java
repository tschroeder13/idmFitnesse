package fitnesse.ws.slim;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fitnesse.ws.services.NrfResourceServiceFactory;

@org.junit.FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResourceOperationsTest {

	String alias = "nuatest";
	String url = "https://nuatest.server.dom/IDMProv/resource/service";
	// String admin = "GA1633";
	String admin = "cn=GA1633,ou=Services,ou=Applications,o=base,c=DE";
	String pwd = "ENC(deef9vjg5kKdqGr6YXt7Ke_DKOvYGaPEcmxf0hRco3g)";
	String resourc = "cn=test-entitlement-name_AD2k12,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=User Application Driver,cn=driverset1,o=system";
	String user = "cn=T99991,ou=t13699tst,ou=intranet,o=base,c=DE";
	// String alias = "demo";
	// String url = "http://172.16.66.211:8180/IDMProv/resource/service";
	// String admin = "cn=uaadmin,ou=sa,o=data";
	// String pwd = "master";
	String[] resource = {"cn=GMS_F0561_T13699_AD_Test,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=UserApplication,cn=DriverSet1,ou=IDM,o=SYSTEM,c=DE"
			,"cn=GMS_F0561_T13699_EDS_Test,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=UserApplication,cn=DriverSet1,ou=IDM,o=SYSTEM,c=DE"
//			"cn=99,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=UserApplication,cn=DriverSet1,ou=IDM,o=SYSTEM,c=DE"
//			,"cn=2210,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=UserApplication,cn=DriverSet1,ou=IDM,o=SYSTEM,c=DE"
//			,"cn=2209,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=UserApplication,cn=DriverSet1,ou=IDM,o=SYSTEM,c=DE"
			};
	// String user = "cn=081547114,ou=employee,ou=users,o=data";
	ResourceOperations op = null;

	@Before
	public void setUp() throws Exception {
//		NrfResourceServiceFactory.registerService(alias, url, admin, pwd);
		op = new ResourceOperations(alias, url, admin, pwd);
	}

//	@Test
//	public void _01addResource() {
//		System.out.println(op.addResourceToUserOnServerWithParameter(resource[0], user, alias, new HashMap<String, String>() {{put("EntitlementParamKey", "some value");}}));
//	}
	
	@Test
	public void _01getResources() throws Exception {
		List<List> resources = op.getResourcesForUserOnServer(user, alias);
		resources.forEach((row) -> {
			row.forEach((entry) -> {
				System.out.println(entry.toString());
			});
		});
//		for (List row : resources) {
//			System.out.println(row);
//		}
	}

	@Test
	public void _02hasResources() throws Exception {
		boolean res0 = op.resourceIsAssignedToUserOnServer(resource[0], user, alias);
		boolean res1 = op.resourceIsAssignedToUserOnServer(resource[1], user, alias);
		assertTrue(res0 && res1);
	}
	
	@Test
	public void _02removeResources() throws Exception {
		System.out.println(op.removeResourceFromUserOnServer(resource[0], user, alias));
//		System.out.println(op.removeResourceFromUserOnServer(resource[1], user, alias));
//		System.out.println(op.removeResourceFromUserOnServer(resource[2], user, alias));
		
	}
	@Test
	public void _04getResources() throws Exception {
		List<List> resources = op.getResourcesForUserOnServer(user, alias);
		resources.forEach((row) -> {
			row.forEach((entry) -> {
				System.out.println(entry.toString());
			});
		});
	}
	
	@Test
	public void _05hosNoRes() throws Exception {
		boolean res0 = op.resourceIsAssignedToUserOnServer(resource[1], user, alias);
		boolean res1 = op.resourceIsNotAssignedToUserOnServer(resource[0], user, alias);
		assertTrue(res0 && res1);
	}
}
