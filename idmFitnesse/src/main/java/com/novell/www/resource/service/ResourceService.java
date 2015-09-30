/**
 * ResourceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public interface ResourceService extends javax.xml.rpc.Service {
    public java.lang.String getIRemoteResourcePortAddress();

    public com.novell.www.resource.service.IRemoteResource getIRemoteResourcePort() throws javax.xml.rpc.ServiceException;

    public com.novell.www.resource.service.IRemoteResource getIRemoteResourcePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
