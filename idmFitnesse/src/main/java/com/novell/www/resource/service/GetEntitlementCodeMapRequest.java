/**
 * GetEntitlementCodeMapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class GetEntitlementCodeMapRequest  implements java.io.Serializable {
    private java.lang.String codeMapKey;

    private int type;

    public GetEntitlementCodeMapRequest() {
    }

    public GetEntitlementCodeMapRequest(
           java.lang.String codeMapKey,
           int type) {
           this.codeMapKey = codeMapKey;
           this.type = type;
    }


    /**
     * Gets the codeMapKey value for this GetEntitlementCodeMapRequest.
     * 
     * @return codeMapKey
     */
    public java.lang.String getCodeMapKey() {
        return codeMapKey;
    }


    /**
     * Sets the codeMapKey value for this GetEntitlementCodeMapRequest.
     * 
     * @param codeMapKey
     */
    public void setCodeMapKey(java.lang.String codeMapKey) {
        this.codeMapKey = codeMapKey;
    }


    /**
     * Gets the type value for this GetEntitlementCodeMapRequest.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this GetEntitlementCodeMapRequest.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEntitlementCodeMapRequest)) return false;
        GetEntitlementCodeMapRequest other = (GetEntitlementCodeMapRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeMapKey==null && other.getCodeMapKey()==null) || 
             (this.codeMapKey!=null &&
              this.codeMapKey.equals(other.getCodeMapKey()))) &&
            this.type == other.getType();
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
        if (getCodeMapKey() != null) {
            _hashCode += getCodeMapKey().hashCode();
        }
        _hashCode += getType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEntitlementCodeMapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getEntitlementCodeMapRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeMapKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codeMapKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
