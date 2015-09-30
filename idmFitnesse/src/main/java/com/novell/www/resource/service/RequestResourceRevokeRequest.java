/**
 * RequestResourceRevokeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class RequestResourceRevokeRequest  implements java.io.Serializable {
    private java.lang.String resourceTarget;

    private java.lang.String requester;

    private java.lang.String userTarget;

    private java.lang.String reasonForRequest;

    private com.novell.www.resource.service.ResourceRequestParam[] requestParams;

    private java.lang.String instanceGuid;

    private java.lang.String correlationId;

    public RequestResourceRevokeRequest() {
    }

    public RequestResourceRevokeRequest(
           java.lang.String resourceTarget,
           java.lang.String requester,
           java.lang.String userTarget,
           java.lang.String reasonForRequest,
           com.novell.www.resource.service.ResourceRequestParam[] requestParams,
           java.lang.String instanceGuid,
           java.lang.String correlationId) {
           this.resourceTarget = resourceTarget;
           this.requester = requester;
           this.userTarget = userTarget;
           this.reasonForRequest = reasonForRequest;
           this.requestParams = requestParams;
           this.instanceGuid = instanceGuid;
           this.correlationId = correlationId;
    }


    /**
     * Gets the resourceTarget value for this RequestResourceRevokeRequest.
     * 
     * @return resourceTarget
     */
    public java.lang.String getResourceTarget() {
        return resourceTarget;
    }


    /**
     * Sets the resourceTarget value for this RequestResourceRevokeRequest.
     * 
     * @param resourceTarget
     */
    public void setResourceTarget(java.lang.String resourceTarget) {
        this.resourceTarget = resourceTarget;
    }


    /**
     * Gets the requester value for this RequestResourceRevokeRequest.
     * 
     * @return requester
     */
    public java.lang.String getRequester() {
        return requester;
    }


    /**
     * Sets the requester value for this RequestResourceRevokeRequest.
     * 
     * @param requester
     */
    public void setRequester(java.lang.String requester) {
        this.requester = requester;
    }


    /**
     * Gets the userTarget value for this RequestResourceRevokeRequest.
     * 
     * @return userTarget
     */
    public java.lang.String getUserTarget() {
        return userTarget;
    }


    /**
     * Sets the userTarget value for this RequestResourceRevokeRequest.
     * 
     * @param userTarget
     */
    public void setUserTarget(java.lang.String userTarget) {
        this.userTarget = userTarget;
    }


    /**
     * Gets the reasonForRequest value for this RequestResourceRevokeRequest.
     * 
     * @return reasonForRequest
     */
    public java.lang.String getReasonForRequest() {
        return reasonForRequest;
    }


    /**
     * Sets the reasonForRequest value for this RequestResourceRevokeRequest.
     * 
     * @param reasonForRequest
     */
    public void setReasonForRequest(java.lang.String reasonForRequest) {
        this.reasonForRequest = reasonForRequest;
    }


    /**
     * Gets the requestParams value for this RequestResourceRevokeRequest.
     * 
     * @return requestParams
     */
    public com.novell.www.resource.service.ResourceRequestParam[] getRequestParams() {
        return requestParams;
    }


    /**
     * Sets the requestParams value for this RequestResourceRevokeRequest.
     * 
     * @param requestParams
     */
    public void setRequestParams(com.novell.www.resource.service.ResourceRequestParam[] requestParams) {
        this.requestParams = requestParams;
    }


    /**
     * Gets the instanceGuid value for this RequestResourceRevokeRequest.
     * 
     * @return instanceGuid
     */
    public java.lang.String getInstanceGuid() {
        return instanceGuid;
    }


    /**
     * Sets the instanceGuid value for this RequestResourceRevokeRequest.
     * 
     * @param instanceGuid
     */
    public void setInstanceGuid(java.lang.String instanceGuid) {
        this.instanceGuid = instanceGuid;
    }


    /**
     * Gets the correlationId value for this RequestResourceRevokeRequest.
     * 
     * @return correlationId
     */
    public java.lang.String getCorrelationId() {
        return correlationId;
    }


    /**
     * Sets the correlationId value for this RequestResourceRevokeRequest.
     * 
     * @param correlationId
     */
    public void setCorrelationId(java.lang.String correlationId) {
        this.correlationId = correlationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestResourceRevokeRequest)) return false;
        RequestResourceRevokeRequest other = (RequestResourceRevokeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceTarget==null && other.getResourceTarget()==null) || 
             (this.resourceTarget!=null &&
              this.resourceTarget.equals(other.getResourceTarget()))) &&
            ((this.requester==null && other.getRequester()==null) || 
             (this.requester!=null &&
              this.requester.equals(other.getRequester()))) &&
            ((this.userTarget==null && other.getUserTarget()==null) || 
             (this.userTarget!=null &&
              this.userTarget.equals(other.getUserTarget()))) &&
            ((this.reasonForRequest==null && other.getReasonForRequest()==null) || 
             (this.reasonForRequest!=null &&
              this.reasonForRequest.equals(other.getReasonForRequest()))) &&
            ((this.requestParams==null && other.getRequestParams()==null) || 
             (this.requestParams!=null &&
              java.util.Arrays.equals(this.requestParams, other.getRequestParams()))) &&
            ((this.instanceGuid==null && other.getInstanceGuid()==null) || 
             (this.instanceGuid!=null &&
              this.instanceGuid.equals(other.getInstanceGuid()))) &&
            ((this.correlationId==null && other.getCorrelationId()==null) || 
             (this.correlationId!=null &&
              this.correlationId.equals(other.getCorrelationId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResourceTarget() != null) {
            _hashCode += getResourceTarget().hashCode();
        }
        if (getRequester() != null) {
            _hashCode += getRequester().hashCode();
        }
        if (getUserTarget() != null) {
            _hashCode += getUserTarget().hashCode();
        }
        if (getReasonForRequest() != null) {
            _hashCode += getReasonForRequest().hashCode();
        }
        if (getRequestParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInstanceGuid() != null) {
            _hashCode += getInstanceGuid().hashCode();
        }
        if (getCorrelationId() != null) {
            _hashCode += getCorrelationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestResourceRevokeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestResourceRevokeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requester");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requester"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "userTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonForRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "reasonForRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceRequestParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourcerequestparam"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "instanceGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "correlationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
