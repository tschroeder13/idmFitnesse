package fitnesse.ssh.slim;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;
import fitnesse.ssh.services.SshConnectionFactory;

public abstract class SshNdsOperationBase {

	protected String dottedAdminDn;
	protected String password;
	protected String alias;
	protected static StringBuilder sb = new StringBuilder();
	private static CryptoService cs = CryptoFactories.getCryptoServiceFactory()
				.getCryptoService(CryptoFactories.getCryptoKeyStoreFactory().newInstance());


	public SshNdsOperationBase(String dottedAdminDn, String password, String alias) {
		super();
		this.dottedAdminDn = dottedAdminDn;
		this.password = password;
		this.alias = alias;
	}


	protected String initBaseOptions() {
		sb.delete(0, sb.length());
		sb.append("dxcmd -dnform ldap -host ");
		sb.append(SshConnectionFactory.getConnections().get(alias).host);
		sb.append(" -user ");
		sb.append(dottedAdminDn);
		sb.append(" -password ");
		sb.append(cs.decrypt(password.substring(4,password.length()-1)));
		sb.append(" -v -s ");
		
		return sb.toString();
	}

}