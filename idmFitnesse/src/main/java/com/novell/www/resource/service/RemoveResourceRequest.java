/**
 * RemoveResourceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class RemoveResourceRequest  implements java.io.Serializable {
    private com.novell.www.resource.service.DNString resourceDn;

    public RemoveResourceRequest() {
    }

    public RemoveResourceRequest(
           com.novell.www.resource.service.DNString resourceDn) {
           this.resourceDn = resourceDn;
    }


    /**
     * Gets the resourceDn value for this RemoveResourceRequest.
     * 
     * @return resourceDn
     */
    public com.novell.www.resource.service.DNString getResourceDn() {
        return resourceDn;
    }


    /**
     * Sets the resourceDn value for this RemoveResourceRequest.
     * 
     * @param resourceDn
     */
    public void setResourceDn(com.novell.www.resource.service.DNString resourceDn) {
        this.resourceDn = resourceDn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveResourceRequest)) return false;
        RemoveResourceRequest other = (RemoveResourceRequest) obj;
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
              this.resourceDn.equals(other.getResourceDn())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveResourceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "removeResourceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "DNString"));
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
