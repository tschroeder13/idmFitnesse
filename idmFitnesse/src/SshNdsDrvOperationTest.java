package fitnesse.ssh.slim;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import fitnesse.slim.SlimException;

public class SshNdsDrvOperationTest {
	private static final String ADMIN_DN = "admin.sa.system";
	protected static final String TST_DRV = "BusinessLogic.driverset1.system";
	String alias = "guhdemo";
	String password = "ENC(nHgy_NBECxliK78756zISw)";

	@Before
	public void setUp() throws Exception {
		new SshSlimSetup(alias, "172.16.66.210", "root", password);
	}

	@Test
	public void test() {
		try {
			SshNdsDrvOperation op = new SshNdsDrvOperation(alias, ADMIN_DN, password);
			assertEquals("running", op
					.driverIs(TST_DRV));
			assertTrue((op
					.driverIs(TST_DRV,"running")));
			assertTrue((op
					.stopDriver(TST_DRV)));
			assertFalse((op
					.driverIs(TST_DRV,"shutting down")));
			assertTrue((op
					.startDriver(TST_DRV)));
			assertFalse((op
					.driverIs(TST_DRV,"starting")));
		} catch (IOException | SlimException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
/*
!define guhdemo_adm_user {root}
!define guhdemo_adm_pwd {ENC(nHgy_NBECxliK78756zISw)}
*/