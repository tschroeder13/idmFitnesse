package fitnesse.ldap.services;

import com.unboundid.ldap.sdk.LDAPConnectionPool;

public class LdapConnectionDetail {
	
	public LDAPConnectionPool ldapConnectionPool = null;
	
	public String host = null;
	public int port = 0;
	public boolean ssl = false;
	public String bindDn = null;
	public String bindPw = null;

	public LdapConnectionDetail() {
	}
}
