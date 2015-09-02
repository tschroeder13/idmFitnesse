package fitnesse.ssh.slim;

import java.io.IOException;

import com.jcabi.ssh.Shell;

import fitnesse.slim.SlimException;
import fitnesse.slim.StopTestSlimException;
import fitnesse.ssh.services.SshConnectionFactory;

public class SshNdsDrvOperation extends SshNdsOperationBase {

	public SshNdsDrvOperation(String ldapAdminDn, String password, String alias) {
		super(ldapAdminDn, password, alias);
	}

	public boolean driverIs(String ldapDriverDn, String expectedState) throws IOException, SlimException{
		String actualState = driverIs(ldapDriverDn);
		return expectedState.equals(actualState);
	}

	public String driverIs(String ldapDriverDn) throws IOException, SlimException {
		initBaseOptions();
		sb.append("-getstate ");
		sb.append(ldapDriverDn);
		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
//		System.out.println(result.getClass().getName()+": "+result);
//		System.out.println(result);
		switch (result.trim()) {
		case "0": return "stopped";
		case "1": return "starting";
		case "2": return "running";
		case "3": return "shutting down";
		case "11": return "get schema";
		default:
			throw new SlimException("Unresolvable driver state: " + result, true);
		}
	}
	
	public boolean startDriver(String ldapDriverDn) throws StopTestSlimException, IOException {
		initBaseOptions();
		sb.append("-start ");
		sb.append(ldapDriverDn);
		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
		System.out.println(result);
		return result.trim().equals("0");
	}
	public boolean stopDriver(String ldapDriverDn) throws StopTestSlimException, IOException {
		initBaseOptions();
		sb.append("-stop ");
		sb.append(ldapDriverDn);
		String result = SshConnectionFactory.getSshConnection(alias).exec(sb.toString());
		System.out.println(result);
		return result.trim().equals("0");
	}
	
}
