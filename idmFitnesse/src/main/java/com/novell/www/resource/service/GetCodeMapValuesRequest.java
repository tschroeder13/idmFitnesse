/**
 * GetCodeMapValuesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class GetCodeMapValuesRequest  implements java.io.Serializable {
    private java.lang.String codeMapKey;

    private java.lang.String locale;

    private java.lang.String dn;

    private java.lang.String nativeValue;

    private java.lang.String logicalSystemId;

    public GetCodeMapValuesRequest() {
    }

    public GetCodeMapValuesRequest(
           java.lang.String codeMapKey,
           java.lang.String locale,
           java.lang.String dn,
           java.lang.String nativeValue,
           java.lang.String logicalSystemId) {
           this.codeMapKey = codeMapKey;
           this.locale = locale;
           this.dn = dn;
           this.nativeValue = nativeValue;
           this.logicalSystemId = logicalSystemId;
    }


    /**
     * Gets the codeMapKey value for this GetCodeMapValuesRequest.
     * 
     * @return codeMapKey
     */
    public java.lang.String getCodeMapKey() {
        return codeMapKey;
    }


    /**
     * Sets the codeMapKey value for this GetCodeMapValuesRequest.
     * 
     * @param codeMapKey
     */
    public void setCodeMapKey(java.lang.String codeMapKey) {
        this.codeMapKey = codeMapKey;
    }


    /**
     * Gets the locale value for this GetCodeMapValuesRequest.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this GetCodeMapValuesRequest.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the dn value for this GetCodeMapValuesRequest.
     * 
     * @return dn
     */
    public java.lang.String getDn() {
        return dn;
    }


    /**
     * Sets the dn value for this GetCodeMapValuesRequest.
     * 
     * @param dn
     */
    public void setDn(java.lang.String dn) {
        this.dn = dn;
    }


    /**
     * Gets the nativeValue value for this GetCodeMapValuesRequest.
     * 
     * @return nativeValue
     */
    public java.lang.String getNativeValue() {
        return nativeValue;
    }


    /**
     * Sets the nativeValue value for this GetCodeMapValuesRequest.
     * 
     * @param nativeValue
     */
    public void setNativeValue(java.lang.String nativeValue) {
        this.nativeValue = nativeValue;
    }


    /**
     * Gets the logicalSystemId value for this GetCodeMapValuesRequest.
     * 
     * @return logicalSystemId
     */
    public java.lang.String getLogicalSystemId() {
        return logicalSystemId;
    }


    /**
     * Sets the logicalSystemId value for this GetCodeMapValuesRequest.
     * 
     * @param logicalSystemId
     */
    public void setLogicalSystemId(java.lang.String logicalSystemId) {
        this.logicalSystemId = logicalSystemId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCodeMapValuesRequest)) return false;
        GetCodeMapValuesRequest other = (GetCodeMapValuesRequest) obj;
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
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.dn==null && other.getDn()==null) || 
             (this.dn!=null &&
              this.dn.equals(other.getDn()))) &&
            ((this.nativeValue==null && other.getNativeValue()==null) || 
             (this.nativeValue!=null &&
              this.nativeValue.equals(other.getNativeValue()))) &&
            ((this.logicalSystemId==null && other.getLogicalSystemId()==null) || 
             (this.logicalSystemId!=null &&
              this.logicalSystemId.equals(other.getLogicalSystemId())));
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
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getDn() != null) {
            _hashCode += getDn().hashCode();
        }
        if (getNativeValue() != null) {
            _hashCode += getNativeValue().hashCode();
        }
        if (getLogicalSystemId() != null) {
            _hashCode += getLogicalSystemId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCodeMapValuesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getCodeMapValuesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeMapKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codeMapKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "dn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "nativeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalSystemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "logicalSystemId"));
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
