package fitnesse.ldap.services;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.unboundid.ldap.sdk.BindRequest;
import com.unboundid.ldap.sdk.BindResult;
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPConnectionPool;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldap.sdk.LDAPInterface;
import com.unboundid.ldap.sdk.SimpleBindRequest;
import com.unboundid.util.ssl.SSLUtil;
import com.unboundid.util.ssl.TrustAllTrustManager;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;
import fitnesse.slim.StopTestSlimException;

public class LdapConnectionFactory {
	
	public String info() {
		return "This factory class provides LDAP connections";
	}

	private static CryptoService cs= CryptoFactories.getCryptoServiceFactory()
			.getCryptoService(CryptoFactories.getCryptoKeyStoreFactory().newInstance());

	public LdapConnectionFactory() {
	}

	protected static Map<String, LdapConnectionDetail> connections = new ConcurrentHashMap<String, LdapConnectionDetail>();

	public static synchronized LDAPInterface getLdapConnection(String alias) throws LDAPException {
		return (LDAPInterface) connections.get(alias).ldapConnectionPool.getConnection();
	}

	public static synchronized LDAPInterface getLdapConnection(
			String alias, 
			String host, 
			int port, 
			String bindDn, 
			String bindPw, 
			boolean ssl) throws StopTestSlimException, LDAPException{
		if(null == connections.get(alias)){
			connections.put(alias, new LdapConnectionDetail());
		}
		
		LdapConnectionDetail connectionDetails = connections.get(alias);
		if(null != connectionDetails.ldapConnectionPool
				&& String.valueOf(host).equals(connectionDetails.host)
				&& String.valueOf(port).equals(connectionDetails.port)
				&& String.valueOf(bindDn).equals(connectionDetails.bindDn)
				&& String.valueOf(bindPw).equals(connectionDetails.bindPw)
				&& String.valueOf(ssl).equals(connectionDetails.ssl)){
			return connectionDetails.ldapConnectionPool;
		}
		connectionDetails.ldapConnectionPool = (LDAPConnectionPool) connect(host, port, bindDn, bindPw, ssl);
		return connectionDetails.ldapConnectionPool.getConnection();
	}
	
	private static LDAPInterface connect(String host, int port, String bindDN, String bindPw, boolean ssl)
			throws StopTestSlimException {
		LDAPConnectionPool connection;
		LDAPConnection con;
		SSLUtil sslUtil = new SSLUtil(new TrustAllTrustManager());
		BindRequest bindRequest;
		BindResult bindResult;
		try {
			if (ssl) {
				con = new LDAPConnection(sslUtil.createSSLSocketFactory(), host, port);
			} else {
				con = new LDAPConnection(host, port);
			}
			String encpw = bindPw.substring(4,bindPw.length()-1);
			bindRequest = new SimpleBindRequest(bindDN, cs.decrypt(encpw));
			bindResult = con.bind(bindRequest);
			connection = new LDAPConnectionPool(con, 10);
		} catch (LDAPException e) {
			throw new StopTestSlimException(
					"LDAP Error (" + e.getResultCode().intValue() + "): \"" + e.getResultCode().getName() + "\"", e);

		} catch (GeneralSecurityException e) {
			throw new StopTestSlimException("SSL Socket Factory could not be initialized!", e);
		}
		return connection;
	}

	public static Map<String, LdapConnectionDetail> getConnections() {
		return connections;
	}

}
