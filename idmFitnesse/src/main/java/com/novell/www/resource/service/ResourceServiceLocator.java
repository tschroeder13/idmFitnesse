/**
 * ResourceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class ResourceServiceLocator extends org.apache.axis.client.Service implements com.novell.www.resource.service.ResourceService {

    public ResourceServiceLocator() {
    }


    public ResourceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ResourceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IRemoteResourcePort
    private java.lang.String IRemoteResourcePort_address = "http://172.16.66.211:8180/IDMProv/resource/service";

    public java.lang.String getIRemoteResourcePortAddress() {
        return IRemoteResourcePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IRemoteResourcePortWSDDServiceName = "IRemoteResourcePort";

    public java.lang.String getIRemoteResourcePortWSDDServiceName() {
        return IRemoteResourcePortWSDDServiceName;
    }

    public void setIRemoteResourcePortWSDDServiceName(java.lang.String name) {
        IRemoteResourcePortWSDDServiceName = name;
    }

    public com.novell.www.resource.service.IRemoteResource getIRemoteResourcePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IRemoteResourcePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIRemoteResourcePort(endpoint);
    }

    public com.novell.www.resource.service.IRemoteResource getIRemoteResourcePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.novell.www.resource.service.IRemoteResourceBindingStub _stub = new com.novell.www.resource.service.IRemoteResourceBindingStub(portAddress, this);
            _stub.setPortName(getIRemoteResourcePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIRemoteResourcePortEndpointAddress(java.lang.String address) {
        IRemoteResourcePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.novell.www.resource.service.IRemoteResource.class.isAssignableFrom(serviceEndpointInterface)) {
                com.novell.www.resource.service.IRemoteResourceBindingStub _stub = new com.novell.www.resource.service.IRemoteResourceBindingStub(new java.net.URL(IRemoteResourcePort_address), this);
                _stub.setPortName(getIRemoteResourcePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IRemoteResourcePort".equals(inputPortName)) {
            return getIRemoteResourcePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "IRemoteResourcePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IRemoteResourcePort".equals(portName)) {
            setIRemoteResourcePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
