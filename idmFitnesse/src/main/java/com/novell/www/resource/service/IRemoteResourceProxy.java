package com.novell.www.resource.service;

public class IRemoteResourceProxy implements com.novell.www.resource.service.IRemoteResource {
  private String _endpoint = null;
  private com.novell.www.resource.service.IRemoteResource iRemoteResource = null;
  
  public IRemoteResourceProxy() {
    _initIRemoteResourceProxy();
  }
  
  public IRemoteResourceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIRemoteResourceProxy();
  }
  
  private void _initIRemoteResourceProxy() {
    try {
      iRemoteResource = (new com.novell.www.resource.service.ResourceServiceLocator()).getIRemoteResourcePort();
      if (iRemoteResource != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iRemoteResource)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iRemoteResource)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iRemoteResource != null)
      ((javax.xml.rpc.Stub)iRemoteResource)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.novell.www.resource.service.IRemoteResource getIRemoteResource() {
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource;
  }
  
  public com.novell.www.resource.service.GetResourcessInfoByCategoryResponse getResourcessInfoByCategory(com.novell.www.resource.service.GetResourcessInfoByCategoryRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourcessInfoByCategory(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserResponse getResourceRequestStatusForCurrentUser(com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourceRequestStatusForCurrentUser(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourceResponse getResource(com.novell.www.resource.service.GetResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResource(bodyIn);
  }
  
  public com.novell.www.resource.service.SetResourceLocalizedStringsResponse setResourceLocalizedStrings(com.novell.www.resource.service.SetResourceLocalizedStringsRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.setResourceLocalizedStrings(bodyIn);
  }
  
  public com.novell.www.resource.service.SetResourceLocalizedStringsAidResponse setResourceLocalizedStringsAid(com.novell.www.resource.service.SetResourceLocalizedStringsAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.setResourceLocalizedStringsAid(bodyIn);
  }
  
  public com.novell.www.resource.service.FlushDriverCacheResponse flushDriverCache(com.novell.www.resource.service.FlushDriverCacheRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.flushDriverCache(bodyIn);
  }
  
  public com.novell.www.resource.service.SetAllResourceLocalizedStringsResponse setAllResourceLocalizedStrings(com.novell.www.resource.service.SetAllResourceLocalizedStringsRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.setAllResourceLocalizedStrings(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourcessInfoResponse getResourcessInfo(com.novell.www.resource.service.GetResourcessInfoRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourcessInfo(bodyIn);
  }
  
  public com.novell.www.resource.service.CreateResourceAidResponse createResourceAid(com.novell.www.resource.service.CreateResourceAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.createResourceAid(bodyIn);
  }
  
  public com.novell.www.resource.service.ModifyResourceResponse modifyResource(com.novell.www.resource.service.ModifyResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.modifyResource(bodyIn);
  }
  
  public com.novell.www.resource.service.RequestResourceGrantResponse requestResourceGrant(com.novell.www.resource.service.RequestResourceGrantRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.requestResourceGrant(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourceAssignmentsForUserResponse getResourceAssignmentsForUser(com.novell.www.resource.service.GetResourceAssignmentsForUserRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourceAssignmentsForUser(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserResponse getResourceAssignmentsForCurrentUser(com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourceAssignmentsForCurrentUser(bodyIn);
  }
  
  public com.novell.www.resource.service.RefreshCodeMapResponse refreshCodeMap(com.novell.www.resource.service.RefreshCodeMapRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.refreshCodeMap(bodyIn);
  }
  
  public com.novell.www.resource.service.RemoveResourceResponse removeResource(com.novell.www.resource.service.RemoveResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.removeResource(bodyIn);
  }
  
  public com.novell.www.resource.service.CreateResourceResponse createResource(com.novell.www.resource.service.CreateResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.createResource(bodyIn);
  }
  
  public com.novell.www.resource.service.FindResourceByExampleWithOperatorResponse findResourceByExampleWithOperator(com.novell.www.resource.service.FindResourceByExampleWithOperatorRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.findResourceByExampleWithOperator(bodyIn);
  }
  
  public com.novell.www.resource.service.GetEntitlementCodeMapResponse getEntitlementCodeMap(com.novell.www.resource.service.GetEntitlementCodeMapRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getEntitlementCodeMap(bodyIn);
  }
  
  public com.novell.www.resource.service.GetRefreshStatusResponse getRefreshStatus(com.novell.www.resource.service.GetRefreshStatusRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getRefreshStatus(bodyIn);
  }
  
  public com.novell.www.resource.service.CheckCodeMapValueStatusResponse checkCodeMapValueStatus(com.novell.www.resource.service.CheckCodeMapValueStatusRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.checkCodeMapValueStatus(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourceRequestStatusByIdentityResponse getResourceRequestStatusByIdentity(com.novell.www.resource.service.GetResourceRequestStatusByIdentityRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourceRequestStatusByIdentity(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdResponse getResourceRequestStatusByCorrelationId(com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourceRequestStatusByCorrelationId(bodyIn);
  }
  
  public com.novell.www.resource.service.RemoveResourceAidResponse removeResourceAid(com.novell.www.resource.service.RemoveResourceAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.removeResourceAid(bodyIn);
  }
  
  public com.novell.www.resource.service.ModifyResourceAidResponse modifyResourceAid(com.novell.www.resource.service.ModifyResourceAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.modifyResourceAid(bodyIn);
  }
  
  public com.novell.www.resource.service.GetAssignmentsForResourceResponse getAssignmentsForResource(com.novell.www.resource.service.GetAssignmentsForResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getAssignmentsForResource(bodyIn);
  }
  
  public com.novell.www.resource.service.GetCodeMapValuesResponse getCodeMapValues(com.novell.www.resource.service.GetCodeMapValuesRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getCodeMapValues(bodyIn);
  }
  
  public com.novell.www.resource.service.RequestResourceRevokeResponse requestResourceRevoke(com.novell.www.resource.service.RequestResourceRevokeRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.requestResourceRevoke(bodyIn);
  }
  
  public com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdResponse setAllResourceLocalizedStringsWithCorrelationId(com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.setAllResourceLocalizedStringsWithCorrelationId(bodyIn);
  }
  
  public com.novell.www.resource.service.GetResourceLocalizedStringsResponse getResourceLocalizedStrings(com.novell.www.resource.service.GetResourceLocalizedStringsRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException{
    if (iRemoteResource == null)
      _initIRemoteResourceProxy();
    return iRemoteResource.getResourceLocalizedStrings(bodyIn);
  }
  
  
}