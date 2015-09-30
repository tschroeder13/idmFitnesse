/**
 * SetAllResourceLocalizedStringsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class SetAllResourceLocalizedStringsRequest  implements java.io.Serializable {
    private java.lang.String resourceDn;

    private com.novell.www.resource.service.LocalizedValue[] locNameStrings;

    private com.novell.www.resource.service.LocalizedValue[] locDescStrings;

    public SetAllResourceLocalizedStringsRequest() {
    }

    public SetAllResourceLocalizedStringsRequest(
           java.lang.String resourceDn,
           com.novell.www.resource.service.LocalizedValue[] locNameStrings,
           com.novell.www.resource.service.LocalizedValue[] locDescStrings) {
           this.resourceDn = resourceDn;
           this.locNameStrings = locNameStrings;
           this.locDescStrings = locDescStrings;
    }


    /**
     * Gets the resourceDn value for this SetAllResourceLocalizedStringsRequest.
     * 
     * @return resourceDn
     */
    public java.lang.String getResourceDn() {
        return resourceDn;
    }


    /**
     * Sets the resourceDn value for this SetAllResourceLocalizedStringsRequest.
     * 
     * @param resourceDn
     */
    public void setResourceDn(java.lang.String resourceDn) {
        this.resourceDn = resourceDn;
    }


    /**
     * Gets the locNameStrings value for this SetAllResourceLocalizedStringsRequest.
     * 
     * @return locNameStrings
     */
    public com.novell.www.resource.service.LocalizedValue[] getLocNameStrings() {
        return locNameStrings;
    }


    /**
     * Sets the locNameStrings value for this SetAllResourceLocalizedStringsRequest.
     * 
     * @param locNameStrings
     */
    public void setLocNameStrings(com.novell.www.resource.service.LocalizedValue[] locNameStrings) {
        this.locNameStrings = locNameStrings;
    }


    /**
     * Gets the locDescStrings value for this SetAllResourceLocalizedStringsRequest.
     * 
     * @return locDescStrings
     */
    public com.novell.www.resource.service.LocalizedValue[] getLocDescStrings() {
        return locDescStrings;
    }


    /**
     * Sets the locDescStrings value for this SetAllResourceLocalizedStringsRequest.
     * 
     * @param locDescStrings
     */
    public void setLocDescStrings(com.novell.www.resource.service.LocalizedValue[] locDescStrings) {
        this.locDescStrings = locDescStrings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetAllResourceLocalizedStringsRequest)) return false;
        SetAllResourceLocalizedStringsRequest other = (SetAllResourceLocalizedStringsRequest) obj;
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
            ((this.locNameStrings==null && other.getLocNameStrings()==null) || 
             (this.locNameStrings!=null &&
              java.util.Arrays.equals(this.locNameStrings, other.getLocNameStrings()))) &&
            ((this.locDescStrings==null && other.getLocDescStrings()==null) || 
             (this.locDescStrings!=null &&
              java.util.Arrays.equals(this.locDescStrings, other.getLocDescStrings())));
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
        if (getLocNameStrings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocNameStrings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocNameStrings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocDescStrings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocDescStrings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocDescStrings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetAllResourceLocalizedStringsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setAllResourceLocalizedStringsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locNameStrings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "locNameStrings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "LocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "localizedvalue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locDescStrings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "locDescStrings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "LocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "localizedvalue"));
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
