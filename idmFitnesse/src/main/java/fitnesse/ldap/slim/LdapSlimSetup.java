package fitnesse.ldap.slim;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPException;

import fitnesse.ldap.services.LdapConnectionFactory;
import fitnesse.slim.StopTestSlimException;

public class LdapSlimSetup {

	
	public LdapSlimSetup() {
		super();
	}
	
	public LdapSlimSetup(String alias, 
			String host, 
			int port, 
			boolean ssl,
			String bindDn, 
			String bindPw 
			) throws StopTestSlimException {
		LdapConnectionFactory.getLdapConnection(alias, host, port, bindDn, bindPw, ssl);
	}
	
	public String info(){
		return "This class ";
	}
	
	public boolean isConnected(String alias) throws StopTestSlimException {
		return ((LDAPConnection)LdapConnectionFactory.getLdapConnection(alias)).isConnected();
	}

	public boolean close(String alias) throws StopTestSlimException {
		((LDAPConnection)LdapConnectionFactory.getLdapConnection(alias)).close();
		try {
		    TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		return !isConnected(alias);
	}

	public void closeAll() throws StopTestSlimException {
		Set<String> names = LdapConnectionFactory.getConnections().keySet();
		for (String name : names){
			close(name);
		}
	}
public static void main(String[] args) {
	System.out.println(new LdapSlimSetup().info());
}
}
