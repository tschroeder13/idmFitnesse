package fitnesse.ssh.slim;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import fitnesse.slim.SlimException;

public class SshNdsJobOperationTest {
	private static final String ADMIN_DN = "admin.sa.system";
	protected static final String TST_JOB = "TestJob.AD2k3_Script-Drv.driverset1.system";
	String alias = "guhdemo";
	String password = "ENC(nHgy_NBECxliK78756zISw)";

	@Before
	public void setUp() throws Exception {
		new SshSlimSetup(alias, "172.16.66.210", "root", password);
	}

	@Test
	public void test() throws IOException, SlimException {
		SshNdsJobOperation op = new SshNdsJobOperation(ADMIN_DN, password, alias);
		assertEquals(op.jobEnabledStateIs(TST_JOB), "enabled");
		assertTrue(op.startJob(TST_JOB));
		assertTrue(op.jobIsRunning(TST_JOB));
	}

}
