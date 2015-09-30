/**
 * NrfEntitlementRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class NrfEntitlementRef  implements java.io.Serializable {
    private java.lang.String entitlementCorrelationId;

    private java.lang.String entitlementDn;

    private java.lang.String entitlementParameters;

    private java.lang.String src;

    public NrfEntitlementRef() {
    }

    public NrfEntitlementRef(
           java.lang.String entitlementCorrelationId,
           java.lang.String entitlementDn,
           java.lang.String entitlementParameters,
           java.lang.String src) {
           this.entitlementCorrelationId = entitlementCorrelationId;
           this.entitlementDn = entitlementDn;
           this.entitlementParameters = entitlementParameters;
           this.src = src;
    }


    /**
     * Gets the entitlementCorrelationId value for this NrfEntitlementRef.
     * 
     * @return entitlementCorrelationId
     */
    public java.lang.String getEntitlementCorrelationId() {
        return entitlementCorrelationId;
    }


    /**
     * Sets the entitlementCorrelationId value for this NrfEntitlementRef.
     * 
     * @param entitlementCorrelationId
     */
    public void setEntitlementCorrelationId(java.lang.String entitlementCorrelationId) {
        this.entitlementCorrelationId = entitlementCorrelationId;
    }


    /**
     * Gets the entitlementDn value for this NrfEntitlementRef.
     * 
     * @return entitlementDn
     */
    public java.lang.String getEntitlementDn() {
        return entitlementDn;
    }


    /**
     * Sets the entitlementDn value for this NrfEntitlementRef.
     * 
     * @param entitlementDn
     */
    public void setEntitlementDn(java.lang.String entitlementDn) {
        this.entitlementDn = entitlementDn;
    }


    /**
     * Gets the entitlementParameters value for this NrfEntitlementRef.
     * 
     * @return entitlementParameters
     */
    public java.lang.String getEntitlementParameters() {
        return entitlementParameters;
    }


    /**
     * Sets the entitlementParameters value for this NrfEntitlementRef.
     * 
     * @param entitlementParameters
     */
    public void setEntitlementParameters(java.lang.String entitlementParameters) {
        this.entitlementParameters = entitlementParameters;
    }


    /**
     * Gets the src value for this NrfEntitlementRef.
     * 
     * @return src
     */
    public java.lang.String getSrc() {
        return src;
    }


    /**
     * Sets the src value for this NrfEntitlementRef.
     * 
     * @param src
     */
    public void setSrc(java.lang.String src) {
        this.src = src;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NrfEntitlementRef)) return false;
        NrfEntitlementRef other = (NrfEntitlementRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementCorrelationId==null && other.getEntitlementCorrelationId()==null) || 
             (this.entitlementCorrelationId!=null &&
              this.entitlementCorrelationId.equals(other.getEntitlementCorrelationId()))) &&
            ((this.entitlementDn==null && other.getEntitlementDn()==null) || 
             (this.entitlementDn!=null &&
              this.entitlementDn.equals(other.getEntitlementDn()))) &&
            ((this.entitlementParameters==null && other.getEntitlementParameters()==null) || 
             (this.entitlementParameters!=null &&
              this.entitlementParameters.equals(other.getEntitlementParameters()))) &&
            ((this.src==null && other.getSrc()==null) || 
             (this.src!=null &&
              this.src.equals(other.getSrc())));
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
        if (getEntitlementCorrelationId() != null) {
            _hashCode += getEntitlementCorrelationId().hashCode();
        }
        if (getEntitlementDn() != null) {
            _hashCode += getEntitlementDn().hashCode();
        }
        if (getEntitlementParameters() != null) {
            _hashCode += getEntitlementParameters().hashCode();
        }
        if (getSrc() != null) {
            _hashCode += getSrc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NrfEntitlementRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfEntitlementRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementCorrelationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entitlementCorrelationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entitlementDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entitlementParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("src");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "src"));
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
