package fitnesse.ssh.slim;

import java.io.IOException;

import com.jcabi.ssh.Shell;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;
import fitnesse.slim.SlimException;
import fitnesse.slim.StopTestSlimException;
import fitnesse.ssh.services.SshConnectionFactory;

public class SshNdsDrvOperation {

	String dottedAdminDn;
	String password;
	String alias;
	private static StringBuilder sb = new StringBuilder(); 
	private static CryptoService cs= CryptoFactories.getCryptoServiceFactory()
			.getCryptoService(CryptoFactories.getCryptoKeyStoreFactory().newInstance());

	
	public SshNdsDrvOperation(String alias, String dottedAdminDn, String passsword) {
		super();
		this.dottedAdminDn = dottedAdminDn;
		this.password = passsword;
		this.alias = alias;
	}

	public String driverIs(String dottedDriverDn, String expectedState) throws IOException, SlimException {
		initBaseOptions();
		sb.append("-getstate ");
		sb.append(dottedDriverDn);
		String result = new Shell.Plain(SshConnectionFactory.getSshConnection(alias)).exec(sb.toString());
		switch (result) {
		case "0": return "stopped";
		case "1": return "starting";
		case "2": return "running";
		case "3": return "shutting down";
		case "11": return "get schema";
		default:
			throw new SlimException("Unresolvable driver state: " + result, true);
		}
	}
	
	public boolean startDriver() {
		return false;
	}
	public boolean stopDriver() {
		return false;
	}
	
	private String initBaseOptions(){
		sb.delete(0, sb.length());
		sb.append("dxcmd -host ");
		sb.append(SshConnectionFactory.getConnections().get(alias).host);
		sb.append(" -user ");
		sb.append(dottedAdminDn);
		sb.append(" -password ");
		sb.append(cs.decrypt(password.substring(4,password.length()-1)));
		sb.append(" --v -s  ");
		
		return sb.toString();
	}
	
}
