package fitnesse.ws.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;

import org.apache.axis.AxisProperties;

import com.novell.www.resource.service.IRemoteResource;
import com.novell.www.resource.service.ResourceServiceLocator;

import fitnesse.crypto.dbfit.util.crypto.CryptoFactories;
import fitnesse.crypto.dbfit.util.crypto.CryptoService;

public class NrfResourceServiceFactory {
	
	private static CryptoService cs= CryptoFactories.getCryptoServiceFactory()
			.getCryptoService(CryptoFactories.getCryptoKeyStoreFactory().newInstance());

	protected static Map<String, NrfResourceServiceDetail> resourceServices = new ConcurrentHashMap<>();
	
	public static boolean registerService(String alias,
			String serviceUrl,
			String resourceAdminDn,
			String resourceAdminPwd) {
		ResourceServiceLocator locater = new ResourceServiceLocator();
		IRemoteResource service = null;
		AxisProperties.setProperty("axis.socketSecureFactory","org.apache.axis.components.net.SunFakeTrustSocketFactory");
		try {
			service =locater.getIRemoteResourcePort(new URL(serviceUrl));
			((Stub)service)._setProperty(Call.USERNAME_PROPERTY, resourceAdminDn);
			((Stub)service)._setProperty(Call.PASSWORD_PROPERTY, cs.decrypt(resourceAdminPwd.substring(4,resourceAdminPwd.length()-1)));
			
		} catch (MalformedURLException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resourceServices.put(alias, new NrfResourceServiceDetail(resourceAdminDn, cs.decrypt(resourceAdminPwd.substring(4,resourceAdminPwd.length()-1)), serviceUrl, service));
		
		return true;
	}

	public static IRemoteResource getService(String alias) {
		NrfResourceServiceDetail detail = resourceServices.get(alias);
		if(null==detail) return null;
		return detail.resourceService;
	}
}
