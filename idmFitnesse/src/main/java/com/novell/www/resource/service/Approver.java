/**
 * Approver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class Approver  implements java.io.Serializable {
    private java.lang.String approverDN;

    private long sequence;

    public Approver() {
    }

    public Approver(
           java.lang.String approverDN,
           long sequence) {
           this.approverDN = approverDN;
           this.sequence = sequence;
    }


    /**
     * Gets the approverDN value for this Approver.
     * 
     * @return approverDN
     */
    public java.lang.String getApproverDN() {
        return approverDN;
    }


    /**
     * Sets the approverDN value for this Approver.
     * 
     * @param approverDN
     */
    public void setApproverDN(java.lang.String approverDN) {
        this.approverDN = approverDN;
    }


    /**
     * Gets the sequence value for this Approver.
     * 
     * @return sequence
     */
    public long getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this Approver.
     * 
     * @param sequence
     */
    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Approver)) return false;
        Approver other = (Approver) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.approverDN==null && other.getApproverDN()==null) || 
             (this.approverDN!=null &&
              this.approverDN.equals(other.getApproverDN()))) &&
            this.sequence == other.getSequence();
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
        if (getApproverDN() != null) {
            _hashCode += getApproverDN().hashCode();
        }
        _hashCode += new Long(getSequence()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Approver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Approver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approverDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "approverDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
