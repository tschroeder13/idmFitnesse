/**
 * SetResourceLocalizedStringsAidRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class SetResourceLocalizedStringsAidRequest  implements java.io.Serializable {
    private java.lang.String arg0;

    private com.novell.www.resource.service.LocalizedValue[] arg1;

    private int arg2;

    private java.lang.String arg3;

    public SetResourceLocalizedStringsAidRequest() {
    }

    public SetResourceLocalizedStringsAidRequest(
           java.lang.String arg0,
           com.novell.www.resource.service.LocalizedValue[] arg1,
           int arg2,
           java.lang.String arg3) {
           this.arg0 = arg0;
           this.arg1 = arg1;
           this.arg2 = arg2;
           this.arg3 = arg3;
    }


    /**
     * Gets the arg0 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @return arg0
     */
    public java.lang.String getArg0() {
        return arg0;
    }


    /**
     * Sets the arg0 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @param arg0
     */
    public void setArg0(java.lang.String arg0) {
        this.arg0 = arg0;
    }


    /**
     * Gets the arg1 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @return arg1
     */
    public com.novell.www.resource.service.LocalizedValue[] getArg1() {
        return arg1;
    }


    /**
     * Sets the arg1 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @param arg1
     */
    public void setArg1(com.novell.www.resource.service.LocalizedValue[] arg1) {
        this.arg1 = arg1;
    }


    /**
     * Gets the arg2 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @return arg2
     */
    public int getArg2() {
        return arg2;
    }


    /**
     * Sets the arg2 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @param arg2
     */
    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }


    /**
     * Gets the arg3 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @return arg3
     */
    public java.lang.String getArg3() {
        return arg3;
    }


    /**
     * Sets the arg3 value for this SetResourceLocalizedStringsAidRequest.
     * 
     * @param arg3
     */
    public void setArg3(java.lang.String arg3) {
        this.arg3 = arg3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetResourceLocalizedStringsAidRequest)) return false;
        SetResourceLocalizedStringsAidRequest other = (SetResourceLocalizedStringsAidRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arg0==null && other.getArg0()==null) || 
             (this.arg0!=null &&
              this.arg0.equals(other.getArg0()))) &&
            ((this.arg1==null && other.getArg1()==null) || 
             (this.arg1!=null &&
              java.util.Arrays.equals(this.arg1, other.getArg1()))) &&
            this.arg2 == other.getArg2() &&
            ((this.arg3==null && other.getArg3()==null) || 
             (this.arg3!=null &&
              this.arg3.equals(other.getArg3())));
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
        if (getArg0() != null) {
            _hashCode += getArg0().hashCode();
        }
        if (getArg1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArg1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArg1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getArg2();
        if (getArg3() != null) {
            _hashCode += getArg3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetResourceLocalizedStringsAidRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "setResourceLocalizedStringsAidRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg0");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "arg0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "arg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "LocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "localizedvalue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "arg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "arg3"));
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
