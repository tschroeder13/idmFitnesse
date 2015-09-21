/**
 * SetResourceLocalizedStringsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class SetResourceLocalizedStringsRequest  implements java.io.Serializable {
    private java.lang.String resourceDn;

    private com.novell.www.resource.service.LocalizedValue[] locale;

    private int type;

    public SetResourceLocalizedStringsRequest() {
    }

    public SetResourceLocalizedStringsRequest(
           java.lang.String resourceDn,
           com.novell.www.resource.service.LocalizedValue[] locale,
           int type) {
           this.resourceDn = resourceDn;
           this.locale = locale;
           this.type = type;
    }


    /**
     * Gets the resourceDn value for this SetResourceLocalizedStringsRequest.
     * 
     * @return resourceDn
     */
    public java.lang.String getResourceDn() {
        return resourceDn;
    }


    /**
     * Sets the resourceDn value for this SetResourceLocalizedStringsRequest.
     * 
     * @param resourceDn
     */
    public void setResourceDn(java.lang.String resourceDn) {
        this.resourceDn = resourceDn;
    }


    /**
     * Gets the locale value for this SetResourceLocalizedStringsRequest.
     * 
     * @return locale
     */
    public com.novell.www.resource.service.LocalizedValue[] getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this SetResourceLocalizedStringsRequest.
     * 
     * @param locale
     */
    public void setLocale(com.novell.www.resource.service.LocalizedValue[] locale) {
        this.locale = locale;
    }


    /**
     * Gets the type value for this SetResourceLocalizedStringsRequest.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this SetResourceLocalizedStringsRequest.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetResourceLocalizedStringsRequest)) return false;
        SetResourceLocalizedStringsRequest other = (SetResourceLocalizedStringsRequest) obj;
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
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              java.util.Arrays.equals(this.locale, other.getLocale()))) &&
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
        if (getResourceDn() != null) {
            _hashCode += getResourceDn().hashCode();
        }
        if (getLocale() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocale());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocale(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetResourceLocalizedStringsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "LocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "localizedvalue"));
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
