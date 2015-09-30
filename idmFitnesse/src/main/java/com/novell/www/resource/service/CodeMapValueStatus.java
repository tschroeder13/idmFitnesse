/**
 * CodeMapValueStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class CodeMapValueStatus  implements java.io.Serializable {
    private com.novell.www.resource.service.CodeMapRefreshStatus refreshStatus;

    private boolean upToDate;

    private java.lang.String value;

    public CodeMapValueStatus() {
    }

    public CodeMapValueStatus(
           com.novell.www.resource.service.CodeMapRefreshStatus refreshStatus,
           boolean upToDate,
           java.lang.String value) {
           this.refreshStatus = refreshStatus;
           this.upToDate = upToDate;
           this.value = value;
    }


    /**
     * Gets the refreshStatus value for this CodeMapValueStatus.
     * 
     * @return refreshStatus
     */
    public com.novell.www.resource.service.CodeMapRefreshStatus getRefreshStatus() {
        return refreshStatus;
    }


    /**
     * Sets the refreshStatus value for this CodeMapValueStatus.
     * 
     * @param refreshStatus
     */
    public void setRefreshStatus(com.novell.www.resource.service.CodeMapRefreshStatus refreshStatus) {
        this.refreshStatus = refreshStatus;
    }


    /**
     * Gets the upToDate value for this CodeMapValueStatus.
     * 
     * @return upToDate
     */
    public boolean isUpToDate() {
        return upToDate;
    }


    /**
     * Sets the upToDate value for this CodeMapValueStatus.
     * 
     * @param upToDate
     */
    public void setUpToDate(boolean upToDate) {
        this.upToDate = upToDate;
    }


    /**
     * Gets the value value for this CodeMapValueStatus.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this CodeMapValueStatus.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeMapValueStatus)) return false;
        CodeMapValueStatus other = (CodeMapValueStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refreshStatus==null && other.getRefreshStatus()==null) || 
             (this.refreshStatus!=null &&
              this.refreshStatus.equals(other.getRefreshStatus()))) &&
            this.upToDate == other.isUpToDate() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getRefreshStatus() != null) {
            _hashCode += getRefreshStatus().hashCode();
        }
        _hashCode += (isUpToDate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeMapValueStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapValueStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "refreshStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapRefreshStatus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "upToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
