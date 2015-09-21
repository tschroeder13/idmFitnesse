/**
 * RemoveResourceAidRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class RemoveResourceAidRequest  implements java.io.Serializable {
    private com.novell.www.resource.service.DNString resourceDn;

    private java.lang.String correlationId;

    public RemoveResourceAidRequest() {
    }

    public RemoveResourceAidRequest(
           com.novell.www.resource.service.DNString resourceDn,
           java.lang.String correlationId) {
           this.resourceDn = resourceDn;
           this.correlationId = correlationId;
    }


    /**
     * Gets the resourceDn value for this RemoveResourceAidRequest.
     * 
     * @return resourceDn
     */
    public com.novell.www.resource.service.DNString getResourceDn() {
        return resourceDn;
    }


    /**
     * Sets the resourceDn value for this RemoveResourceAidRequest.
     * 
     * @param resourceDn
     */
    public void setResourceDn(com.novell.www.resource.service.DNString resourceDn) {
        this.resourceDn = resourceDn;
    }


    /**
     * Gets the correlationId value for this RemoveResourceAidRequest.
     * 
     * @return correlationId
     */
    public java.lang.String getCorrelationId() {
        return correlationId;
    }


    /**
     * Sets the correlationId value for this RemoveResourceAidRequest.
     * 
     * @param correlationId
     */
    public void setCorrelationId(java.lang.String correlationId) {
        this.correlationId = correlationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveResourceAidRequest)) return false;
        RemoveResourceAidRequest other = (RemoveResourceAidRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceDn==null && other.getResourceDn()==null) || 
             (this.resourceDn!=null &&
              this.resourceDn.equals(other.getResourceDn()))) &&
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
        if (getResourceDn() != null) {
            _hashCode += getResourceDn().hashCode();
        }
        if (getCorrelationId() != null) {
            _hashCode += getCorrelationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveResourceAidRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceAidRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "DNString"));
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
