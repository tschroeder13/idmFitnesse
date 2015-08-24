package fitnesse.ssh.slim;

import java.io.IOException;
import java.util.Set;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import fitnesse.slim.SlimException;
import fitnesse.slim.StopTestSlimException;
import fitnesse.ssh.services.SshConnectionFactory;

public class SshSlimSetup {

	
	public String info() {
		return "This class provides Secure SHell connections";
	}
	
	public SshSlimSetup(String alias, 
			String host, 
			String user, 
			String password 
			){
		this(alias, host, 22, user, password);
	}
	
	public SshSlimSetup(String alias, 
			String host, 
			int port, 
			String user, 
			String password 
			){
		SshConnectionFactory.registerConnetion(alias, host, port, user, password);
	}
	
}
