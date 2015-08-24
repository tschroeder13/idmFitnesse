package fitnesse.ssh.services;

public class SshConnectionDetail {
	public String host = null;
	public int port = 0;
	public String user = null; 
	public String password = null;
	public SshConnectionDetail(String host, int port, String user, String password) {
		super();
		this.host = host;
		this.port = port;
		this.user = user;
		this.password = password;
	}
}
