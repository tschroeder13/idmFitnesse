/**
 * CheckCodeMapValueStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class CheckCodeMapValueStatusRequest  implements java.io.Serializable {
    private java.lang.String entitilementDN;

    private java.lang.String connectionName;

    private java.lang.String codeMapValue;

    public CheckCodeMapValueStatusRequest() {
    }

    public CheckCodeMapValueStatusRequest(
           java.lang.String entitilementDN,
           java.lang.String connectionName,
           java.lang.String codeMapValue) {
           this.entitilementDN = entitilementDN;
           this.connectionName = connectionName;
           this.codeMapValue = codeMapValue;
    }


    /**
     * Gets the entitilementDN value for this CheckCodeMapValueStatusRequest.
     * 
     * @return entitilementDN
     */
    public java.lang.String getEntitilementDN() {
        return entitilementDN;
    }


    /**
     * Sets the entitilementDN value for this CheckCodeMapValueStatusRequest.
     * 
     * @param entitilementDN
     */
    public void setEntitilementDN(java.lang.String entitilementDN) {
        this.entitilementDN = entitilementDN;
    }


    /**
     * Gets the connectionName value for this CheckCodeMapValueStatusRequest.
     * 
     * @return connectionName
     */
    public java.lang.String getConnectionName() {
        return connectionName;
    }


    /**
     * Sets the connectionName value for this CheckCodeMapValueStatusRequest.
     * 
     * @param connectionName
     */
    public void setConnectionName(java.lang.String connectionName) {
        this.connectionName = connectionName;
    }


    /**
     * Gets the codeMapValue value for this CheckCodeMapValueStatusRequest.
     * 
     * @return codeMapValue
     */
    public java.lang.String getCodeMapValue() {
        return codeMapValue;
    }


    /**
     * Sets the codeMapValue value for this CheckCodeMapValueStatusRequest.
     * 
     * @param codeMapValue
     */
    public void setCodeMapValue(java.lang.String codeMapValue) {
        this.codeMapValue = codeMapValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCodeMapValueStatusRequest)) return false;
        CheckCodeMapValueStatusRequest other = (CheckCodeMapValueStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitilementDN==null && other.getEntitilementDN()==null) || 
             (this.entitilementDN!=null &&
              this.entitilementDN.equals(other.getEntitilementDN()))) &&
            ((this.connectionName==null && other.getConnectionName()==null) || 
             (this.connectionName!=null &&
              this.connectionName.equals(other.getConnectionName()))) &&
            ((this.codeMapValue==null && other.getCodeMapValue()==null) || 
             (this.codeMapValue!=null &&
              this.codeMapValue.equals(other.getCodeMapValue())));
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
        if (getEntitilementDN() != null) {
            _hashCode += getEntitilementDN().hashCode();
        }
        if (getConnectionName() != null) {
            _hashCode += getConnectionName().hashCode();
        }
        if (getCodeMapValue() != null) {
            _hashCode += getCodeMapValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCodeMapValueStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "checkCodeMapValueStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitilementDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entitilementDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "connectionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeMapValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codeMapValue"));
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
