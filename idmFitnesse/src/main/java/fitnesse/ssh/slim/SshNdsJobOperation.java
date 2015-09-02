package fitnesse.ssh.slim;

import java.io.IOException;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;
import fitnesse.slim.SlimException;
import fitnesse.slim.StopTestSlimException;
import fitnesse.ssh.services.SshConnectionFactory;

public class SshNdsJobOperation extends SshNdsOperationBase{
	
/*
-getjobnextruntime <job dn>
Returns the specified job’s next run time.
 */
	
	public SshNdsJobOperation(String ldapAdminDn, String password, String alias) {
		super(ldapAdminDn, password, alias);
	}
	public boolean startJob(String ldapJobDn) throws StopTestSlimException, IOException {
		initBaseOptions();
		sb.append("-startjob ");
		sb.append(ldapJobDn);
		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
		System.out.println(result);
		return result.trim().equals("0");
	}
	public boolean abortJob(String ldapJobDn) throws StopTestSlimException, IOException {
		initBaseOptions();
		sb.append("-abortjob ");
		sb.append(ldapJobDn);
		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
		System.out.println(result);
		return result.trim().equals("0");
	}
//	public boolean updateJob(String ldapJobDn) throws StopTestSlimException, IOException {
//		initBaseOptions();
//		sb.append("-updatejob ");
//		sb.append(ldapJobDn);
//		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
//		System.out.println(result);
//		return result.trim().equals("0");
//	}

	public boolean jobIsRunning(String ldapJobDn) throws StopTestSlimException, IOException {
		initBaseOptions();
		sb.append("-getjobrunningstate ");
		sb.append(ldapJobDn);
		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
		System.out.println(result);
		return result.trim().equals("1");
	}
	public String jobEnabledStateIs(String ldapJobDn) throws IOException, SlimException {
		initBaseOptions();
		sb.append("-getjobenabledstate ");
		sb.append(ldapJobDn);
		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
		System.out.println(result);
		switch (result.trim()) {
		case "0": return "disabled";
		case "1": return "enabled";
		case "2": return "configuration error";
		default:
			throw new SlimException("Unresolvable job enabled state: " + result, true);
		}
	}
}
