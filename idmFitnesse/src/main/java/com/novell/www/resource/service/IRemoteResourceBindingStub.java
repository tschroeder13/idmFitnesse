/**
 * IRemoteResourceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class IRemoteResourceBindingStub extends org.apache.axis.client.Stub implements com.novell.www.resource.service.IRemoteResource {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[29];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourcessInfoByCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoByCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoByCategoryRequest"), com.novell.www.resource.service.GetResourcessInfoByCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoByCategoryResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourcessInfoByCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoByCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceRequestStatusForCurrentUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusForCurrentUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusForCurrentUserRequest"), com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusForCurrentUserResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusForCurrentUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequest"), com.novell.www.resource.service.GetResourceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setResourceLocalizedStrings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsRequest"), com.novell.www.resource.service.SetResourceLocalizedStringsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsResponse"));
        oper.setReturnClass(com.novell.www.resource.service.SetResourceLocalizedStringsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setResourceLocalizedStringsAid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsAidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsAidRequest"), com.novell.www.resource.service.SetResourceLocalizedStringsAidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsAidResponse"));
        oper.setReturnClass(com.novell.www.resource.service.SetResourceLocalizedStringsAidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsAidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("flushDriverCache");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "flushDriverCacheRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "flushDriverCacheRequest"), com.novell.www.resource.service.FlushDriverCacheRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "flushDriverCacheResponse"));
        oper.setReturnClass(com.novell.www.resource.service.FlushDriverCacheResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "flushDriverCacheResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAllResourceLocalizedStrings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsRequest"), com.novell.www.resource.service.SetAllResourceLocalizedStringsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsResponse"));
        oper.setReturnClass(com.novell.www.resource.service.SetAllResourceLocalizedStringsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourcessInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoRequest"), com.novell.www.resource.service.GetResourcessInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourcessInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createResourceAid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceAidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceAidRequest"), com.novell.www.resource.service.CreateResourceAidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceAidResponse"));
        oper.setReturnClass(com.novell.www.resource.service.CreateResourceAidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceAidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceRequest"), com.novell.www.resource.service.ModifyResourceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceResponse"));
        oper.setReturnClass(com.novell.www.resource.service.ModifyResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestResourceGrant");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceGrantRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceGrantRequest"), com.novell.www.resource.service.RequestResourceGrantRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceGrantResponse"));
        oper.setReturnClass(com.novell.www.resource.service.RequestResourceGrantResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceGrantResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceAssignmentsForUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForUserRequest"), com.novell.www.resource.service.GetResourceAssignmentsForUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForUserResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourceAssignmentsForUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceAssignmentsForCurrentUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForCurrentUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForCurrentUserRequest"), com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForCurrentUserResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForCurrentUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("refreshCodeMap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "refreshCodeMapRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "refreshCodeMapRequest"), com.novell.www.resource.service.RefreshCodeMapRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "refreshCodeMapResponse"));
        oper.setReturnClass(com.novell.www.resource.service.RefreshCodeMapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "refreshCodeMapResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceRequest"), com.novell.www.resource.service.RemoveResourceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceResponse"));
        oper.setReturnClass(com.novell.www.resource.service.RemoveResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceRequest"), com.novell.www.resource.service.CreateResourceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceResponse"));
        oper.setReturnClass(com.novell.www.resource.service.CreateResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findResourceByExampleWithOperator");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "findResourceByExampleWithOperatorRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "findResourceByExampleWithOperatorRequest"), com.novell.www.resource.service.FindResourceByExampleWithOperatorRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "findResourceByExampleWithOperatorResponse"));
        oper.setReturnClass(com.novell.www.resource.service.FindResourceByExampleWithOperatorResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "findResourceByExampleWithOperatorResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEntitlementCodeMap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getEntitlementCodeMapRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getEntitlementCodeMapRequest"), com.novell.www.resource.service.GetEntitlementCodeMapRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getEntitlementCodeMapResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetEntitlementCodeMapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getEntitlementCodeMapResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRefreshStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getRefreshStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getRefreshStatusRequest"), com.novell.www.resource.service.GetRefreshStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getRefreshStatusResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetRefreshStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getRefreshStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkCodeMapValueStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "checkCodeMapValueStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "checkCodeMapValueStatusRequest"), com.novell.www.resource.service.CheckCodeMapValueStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "checkCodeMapValueStatusResponse"));
        oper.setReturnClass(com.novell.www.resource.service.CheckCodeMapValueStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "checkCodeMapValueStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceRequestStatusByIdentity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByIdentityRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByIdentityRequest"), com.novell.www.resource.service.GetResourceRequestStatusByIdentityRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByIdentityResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourceRequestStatusByIdentityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByIdentityResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceRequestStatusByCorrelationId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByCorrelationIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByCorrelationIdRequest"), com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByCorrelationIdResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByCorrelationIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeResourceAid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceAidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceAidRequest"), com.novell.www.resource.service.RemoveResourceAidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceAidResponse"));
        oper.setReturnClass(com.novell.www.resource.service.RemoveResourceAidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceAidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyResourceAid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceAidRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceAidRequest"), com.novell.www.resource.service.ModifyResourceAidRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceAidResponse"));
        oper.setReturnClass(com.novell.www.resource.service.ModifyResourceAidResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceAidResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssignmentsForResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getAssignmentsForResourceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getAssignmentsForResourceRequest"), com.novell.www.resource.service.GetAssignmentsForResourceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getAssignmentsForResourceResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetAssignmentsForResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getAssignmentsForResourceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCodeMapValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getCodeMapValuesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getCodeMapValuesRequest"), com.novell.www.resource.service.GetCodeMapValuesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getCodeMapValuesResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetCodeMapValuesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getCodeMapValuesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestResourceRevoke");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceRevokeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceRevokeRequest"), com.novell.www.resource.service.RequestResourceRevokeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceRevokeResponse"));
        oper.setReturnClass(com.novell.www.resource.service.RequestResourceRevokeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceRevokeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAllResourceLocalizedStringsWithCorrelationId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsWithCorrelationIdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsWithCorrelationIdRequest"), com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsWithCorrelationIdResponse"));
        oper.setReturnClass(com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsWithCorrelationIdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResourceLocalizedStrings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceLocalizedStringsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceLocalizedStringsRequest"), com.novell.www.resource.service.GetResourceLocalizedStringsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceLocalizedStringsResponse"));
        oper.setReturnClass(com.novell.www.resource.service.GetResourceLocalizedStringsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceLocalizedStringsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"),
                      "com.novell.www.resource.service.NrfServiceException",
                      new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException"), 
                      true
                     ));
        _operations[28] = oper;

    }

    public IRemoteResourceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IRemoteResourceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IRemoteResourceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Approver");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.Approver.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ApproverArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.Approver[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Approver");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "approver");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CategoryKey");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CategoryKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CategoryKeyArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CategoryKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CategoryKey");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "categorykey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "checkCodeMapValueStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CheckCodeMapValueStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "checkCodeMapValueStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CheckCodeMapValueStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapRefreshStatus");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CodeMapRefreshStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapRefreshStatusArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CodeMapRefreshStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapRefreshStatus");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codemaprefreshstatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapValue");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CodeMapValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapValueArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CodeMapValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapValue");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codemapvalue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapValueStatus");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CodeMapValueStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceAidRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CreateResourceAidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceAidResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CreateResourceAidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CreateResourceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "createResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CreateResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CrudResourceRequestStatus");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.CrudResourceRequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "DNString");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.DNString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "DNStringArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.DNString[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "DNString");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "dnstring");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "EntitlementRefreshInfo");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.EntitlementRefreshInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "findResourceByExampleWithOperatorRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.FindResourceByExampleWithOperatorRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "findResourceByExampleWithOperatorResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.FindResourceByExampleWithOperatorResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "flushDriverCacheRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.FlushDriverCacheRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "flushDriverCacheResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.FlushDriverCacheResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getAssignmentsForResourceRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetAssignmentsForResourceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getAssignmentsForResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetAssignmentsForResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getCodeMapValuesRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetCodeMapValuesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getCodeMapValuesResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetCodeMapValuesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getEntitlementCodeMapRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetEntitlementCodeMapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getEntitlementCodeMapResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetEntitlementCodeMapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getRefreshStatusRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetRefreshStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getRefreshStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetRefreshStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForCurrentUserRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForCurrentUserResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForUserRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceAssignmentsForUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceAssignmentsForUserResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceAssignmentsForUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceLocalizedStringsRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceLocalizedStringsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceLocalizedStringsResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceLocalizedStringsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByCorrelationIdRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByCorrelationIdResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByIdentityRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceRequestStatusByIdentityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusByIdentityResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceRequestStatusByIdentityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusForCurrentUserRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceRequestStatusForCurrentUserResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoByCategoryRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourcessInfoByCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoByCategoryResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourcessInfoByCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourcessInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.GetResourcessInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "LocalizedValue");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.LocalizedValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "LocalizedValueArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.LocalizedValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "LocalizedValue");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "localizedvalue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceAidRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ModifyResourceAidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceAidResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ModifyResourceAidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ModifyResourceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "modifyResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ModifyResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfEntitlementRef");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.NrfEntitlementRef.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfEntitlementRefArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.NrfEntitlementRef[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfEntitlementRef");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "nrfentitlementref");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfServiceException");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.NrfServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMap");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ProvisioningCodeMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMapArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ProvisioningCodeMap[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMap");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "provisioningcodemap");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMapLabel");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ProvisioningCodeMapLabel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMapLabelArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ProvisioningCodeMapLabel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMapLabel");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "provisioningcodemaplabel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "refreshCodeMapRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RefreshCodeMapRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "refreshCodeMapResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RefreshCodeMapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceAidRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RemoveResourceAidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceAidResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RemoveResourceAidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RemoveResourceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RemoveResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceGrantRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RequestResourceGrantRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceGrantResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RequestResourceGrantResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceRevokeRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RequestResourceRevokeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceRevokeResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.RequestResourceRevokeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Resource");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.Resource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.Resource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Resource");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resource");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignment");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignmentArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignment");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceassignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignmentRequestStatus");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceAssignmentRequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignmentRequestStatusArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceAssignmentRequestStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignmentRequestStatus");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceassignmentrequeststatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceInfo");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceInfoArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceInfo");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceinfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceParameter");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceParameterArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceParameter");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceparameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceRequestParam");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceRequestParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceRequestParamArray");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.ResourceRequestParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceRequestParam");
            qName2 = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourcerequestparam");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetAllResourceLocalizedStringsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetAllResourceLocalizedStringsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsWithCorrelationIdRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsWithCorrelationIdResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsAidRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetResourceLocalizedStringsAidRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsAidResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetResourceLocalizedStringsAidResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsRequest");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetResourceLocalizedStringsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsResponse");
            cachedSerQNames.add(qName);
            cls = com.novell.www.resource.service.SetResourceLocalizedStringsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.novell.www.resource.service.GetResourcessInfoByCategoryResponse getResourcessInfoByCategory(com.novell.www.resource.service.GetResourcessInfoByCategoryRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourcessInfoByCategory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourcessInfoByCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourcessInfoByCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourcessInfoByCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourcessInfoByCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserResponse getResourceRequestStatusForCurrentUser(com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourceRequestStatusForCurrentUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourceRequestStatusForCurrentUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourceRequestStatusForCurrentUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourceResponse getResource(com.novell.www.resource.service.GetResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.SetResourceLocalizedStringsResponse setResourceLocalizedStrings(com.novell.www.resource.service.SetResourceLocalizedStringsRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/setResourceLocalizedStrings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setResourceLocalizedStrings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.SetResourceLocalizedStringsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.SetResourceLocalizedStringsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.SetResourceLocalizedStringsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.SetResourceLocalizedStringsAidResponse setResourceLocalizedStringsAid(com.novell.www.resource.service.SetResourceLocalizedStringsAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/setResourceLocalizedStringsAid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setResourceLocalizedStringsAid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.SetResourceLocalizedStringsAidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.SetResourceLocalizedStringsAidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.SetResourceLocalizedStringsAidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.FlushDriverCacheResponse flushDriverCache(com.novell.www.resource.service.FlushDriverCacheRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/flushDriverCache");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "flushDriverCache"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.FlushDriverCacheResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.FlushDriverCacheResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.FlushDriverCacheResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.SetAllResourceLocalizedStringsResponse setAllResourceLocalizedStrings(com.novell.www.resource.service.SetAllResourceLocalizedStringsRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/setAllResourceLocalizedStrings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setAllResourceLocalizedStrings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.SetAllResourceLocalizedStringsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.SetAllResourceLocalizedStringsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.SetAllResourceLocalizedStringsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourcessInfoResponse getResourcessInfo(com.novell.www.resource.service.GetResourcessInfoRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourcessInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourcessInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourcessInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourcessInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourcessInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.CreateResourceAidResponse createResourceAid(com.novell.www.resource.service.CreateResourceAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/createResourceAid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createResourceAid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.CreateResourceAidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.CreateResourceAidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.CreateResourceAidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.ModifyResourceResponse modifyResource(com.novell.www.resource.service.ModifyResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/modifyResource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.ModifyResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.ModifyResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.ModifyResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.RequestResourceGrantResponse requestResourceGrant(com.novell.www.resource.service.RequestResourceGrantRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/requestResourceGrant");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestResourceGrant"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.RequestResourceGrantResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.RequestResourceGrantResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.RequestResourceGrantResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourceAssignmentsForUserResponse getResourceAssignmentsForUser(com.novell.www.resource.service.GetResourceAssignmentsForUserRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourceAssignmentsForUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourceAssignmentsForUser"));
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourceAssignmentsForUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourceAssignmentsForUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourceAssignmentsForUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserResponse getResourceAssignmentsForCurrentUser(com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourceAssignmentsForCurrentUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourceAssignmentsForCurrentUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourceAssignmentsForCurrentUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.RefreshCodeMapResponse refreshCodeMap(com.novell.www.resource.service.RefreshCodeMapRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/refreshCodeMap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "refreshCodeMap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.RefreshCodeMapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.RefreshCodeMapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.RefreshCodeMapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.RemoveResourceResponse removeResource(com.novell.www.resource.service.RemoveResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/removeResource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.RemoveResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.RemoveResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.RemoveResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.CreateResourceResponse createResource(com.novell.www.resource.service.CreateResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/createResource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.CreateResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.CreateResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.CreateResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.FindResourceByExampleWithOperatorResponse findResourceByExampleWithOperator(com.novell.www.resource.service.FindResourceByExampleWithOperatorRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/findResourceByExampleWithOperator");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "findResourceByExampleWithOperator"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.FindResourceByExampleWithOperatorResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.FindResourceByExampleWithOperatorResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.FindResourceByExampleWithOperatorResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetEntitlementCodeMapResponse getEntitlementCodeMap(com.novell.www.resource.service.GetEntitlementCodeMapRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getEntitlementCodeMap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getEntitlementCodeMap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetEntitlementCodeMapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetEntitlementCodeMapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetEntitlementCodeMapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetRefreshStatusResponse getRefreshStatus(com.novell.www.resource.service.GetRefreshStatusRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getRefreshStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRefreshStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetRefreshStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetRefreshStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetRefreshStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.CheckCodeMapValueStatusResponse checkCodeMapValueStatus(com.novell.www.resource.service.CheckCodeMapValueStatusRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/checkCodeMapValueStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "checkCodeMapValueStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.CheckCodeMapValueStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.CheckCodeMapValueStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.CheckCodeMapValueStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourceRequestStatusByIdentityResponse getResourceRequestStatusByIdentity(com.novell.www.resource.service.GetResourceRequestStatusByIdentityRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourceRequestStatusByIdentity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourceRequestStatusByIdentity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourceRequestStatusByIdentityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourceRequestStatusByIdentityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourceRequestStatusByIdentityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdResponse getResourceRequestStatusByCorrelationId(com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourceRequestStatusByCorrelationId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourceRequestStatusByCorrelationId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourceRequestStatusByCorrelationIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.RemoveResourceAidResponse removeResourceAid(com.novell.www.resource.service.RemoveResourceAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/removeResourceAid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "removeResourceAid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.RemoveResourceAidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.RemoveResourceAidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.RemoveResourceAidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.ModifyResourceAidResponse modifyResourceAid(com.novell.www.resource.service.ModifyResourceAidRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/modifyResourceAid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyResourceAid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.ModifyResourceAidResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.ModifyResourceAidResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.ModifyResourceAidResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetAssignmentsForResourceResponse getAssignmentsForResource(com.novell.www.resource.service.GetAssignmentsForResourceRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getAssignmentsForResource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getAssignmentsForResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetAssignmentsForResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetAssignmentsForResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetAssignmentsForResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetCodeMapValuesResponse getCodeMapValues(com.novell.www.resource.service.GetCodeMapValuesRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getCodeMapValues");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCodeMapValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetCodeMapValuesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetCodeMapValuesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetCodeMapValuesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.RequestResourceRevokeResponse requestResourceRevoke(com.novell.www.resource.service.RequestResourceRevokeRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/requestResourceRevoke");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestResourceRevoke"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.RequestResourceRevokeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.RequestResourceRevokeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.RequestResourceRevokeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdResponse setAllResourceLocalizedStringsWithCorrelationId(com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/setAllResourceLocalizedStringsWithCorrelationId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setAllResourceLocalizedStringsWithCorrelationId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.SetAllResourceLocalizedStringsWithCorrelationIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.novell.www.resource.service.GetResourceLocalizedStringsResponse getResourceLocalizedStrings(com.novell.www.resource.service.GetResourceLocalizedStringsRequest bodyIn) throws java.rmi.RemoteException, com.novell.www.resource.service.NrfServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.novell.com/resource/service/getResourceLocalizedStrings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getResourceLocalizedStrings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bodyIn});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.novell.www.resource.service.GetResourceLocalizedStringsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.novell.www.resource.service.GetResourceLocalizedStringsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.novell.www.resource.service.GetResourceLocalizedStringsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.novell.www.resource.service.NrfServiceException) {
              throw (com.novell.www.resource.service.NrfServiceException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
