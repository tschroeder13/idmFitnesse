package fitnesse.ws.services;

import org.sonatype.aether.repository.RemoteRepository;

import com.novell.www.resource.service.IRemoteResource;
import com.novell.www.resource.service.ResourceService;

public class NrfResourceServiceDetail {
	public String serviceAccountDn;
	public String serviceAccountPw;
	public String serviceUrl ;
	public IRemoteResource resourceService;
	
	public NrfResourceServiceDetail(String serviceAccountDn, String serviceAccountPw, String serviceUrl,
			IRemoteResource resourceService) {
		super();
		this.serviceAccountDn = serviceAccountDn;
		this.serviceAccountPw = serviceAccountPw;
		this.serviceUrl = serviceUrl;
		this.resourceService = resourceService;
	}
}
