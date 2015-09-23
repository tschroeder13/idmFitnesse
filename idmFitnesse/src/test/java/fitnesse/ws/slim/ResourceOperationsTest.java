package fitnesse.ws.slim;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import fitnesse.ws.services.NrfResourceServiceFactory;

public class ResourceOperationsTest {

	String alias = "nuatest";
	String url = "http://nuatest.server.dom/IDMProv/resource/service";
	String admin = "GA1633";
	String pwd = "ENC(deef9vjg5kKdqGr6YXt7Ke_DKOvYGaPEcmxf0hRco3g)";
	String resourc = "cn=test-entitlement-name_AD2k12,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=User Application Driver,cn=driverset1,o=system";
	String user = "cn=081547114,ou=employee,ou=users,o=data";
//	String alias = "demo";
//	String url = "http://172.16.66.211:8180/IDMProv/resource/service";
//	String admin = "cn=uaadmin,ou=sa,o=data";
//	String pwd = "master";
//	String resourc = "cn=test-entitlement-name_AD2k12,cn=ResourceDefs,cn=RoleConfig,cn=AppConfig,cn=User Application Driver,cn=driverset1,o=system";
//	String user = "cn=081547114,ou=employee,ou=users,o=data";
	ResourceOperations op = null;
	@Before
	public void setUp() throws Exception {
		NrfResourceServiceFactory.registerService(alias, url, admin, pwd);
		op = new ResourceOperations();
		
	}

	@Test
	public void test() {
		op.addResourceToUserOnServerWithParameter(resourc, user, alias, 
				new HashMap<String,String>(){{
					put("EntitlementParamKey","some value");
				}}
		);
		op.getResourcesForUserOnServer(user, alias).forEach((row) ->{
			row.forEach((entry)->{
				System.out.println(entry.toString());
			});
		});
	}

}
