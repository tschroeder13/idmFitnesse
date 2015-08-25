package fitnesse.ssh.services;

import com.jcabi.ssh.Shell;
import com.jcabi.ssh.Shell.Plain;

public class SshConnectionDetail {
	public String host = null;
	public int port = 0;
	public String user = null; 
	public String password = null;
	private Shell.Plain shell = null;
	public SshConnectionDetail(String host, int port, String user, String password) {
		super();
		this.host = host;
		this.port = port;
		this.user = user;
		this.password = password;
	}
	public Shell.Plain getShell() {
		return shell;
	}
	public void setShell(Shell.Plain shell) {
		this.shell = shell;
	}
	
}
