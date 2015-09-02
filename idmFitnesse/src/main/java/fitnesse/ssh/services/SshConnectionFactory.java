package fitnesse.ssh.services;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.jcabi.ssh.SSHByPassword;
import com.jcabi.ssh.Shell;
import com.jcabi.ssh.Shell.Plain;
import com.jcraft.jsch.JSchException;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;
import fitnesse.slim.SlimException;
import fitnesse.slim.StopTestSlimException;

public class SshConnectionFactory {
	
	public static String knownHostsFile = System.getProperty("user.home") + "/.ssh/known_hosts";

	private static CryptoService cs= CryptoFactories.getCryptoServiceFactory()
			.getCryptoService(CryptoFactories.getCryptoKeyStoreFactory().newInstance());

	protected static Map<String, SshConnectionDetail> connections = new ConcurrentHashMap<String, SshConnectionDetail>();

	public static synchronized Plain getSshConnection(String alias) throws StopTestSlimException{
		SshConnectionDetail connectionDetail = connections.get(alias);
		if(null == connectionDetail){
			throw new StopTestSlimException("There is no connection entry for the name: " + alias);
		}
		return connections.get(alias).getShell();
		
	}

	public static void registerConnetion(String alias, 
			String host, 
			int port, 
			String user, 
			String password) throws StopTestSlimException{
		SshConnectionDetail d = new SshConnectionDetail(host,port,user,password);
		connections.put(alias, d);
		connections.get(alias).setShell(new Shell.Plain(connect(d)));
	}
//	public static synchronized Shell getSshConnection(
//			String alias, 
//			String alias, 
//			int port, 
//			String user, 
//			String password) throws SlimException{
//		if(null == connections.get(alias)){
//			connections.put(alias, new SshConnectionDetail(alias,port,user,password));
//		}
//		return connect(connections.get(alias));
//		
//	}
	private static Shell connect(SshConnectionDetail d) throws StopTestSlimException {
		try {
			return new SSHByPassword(d.host, d.port, d.user, cs.decrypt(d.password.substring(4,d.password.length()-1)));
		} catch (UnknownHostException e) {
			throw new StopTestSlimException("Could not connect to " + d.host +"!", e);
		}
	}

	public static Map<String, SshConnectionDetail> getConnections() {
		return connections;
	}

}
