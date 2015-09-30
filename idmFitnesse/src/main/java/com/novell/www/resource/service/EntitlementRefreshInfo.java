/**
 * EntitlementRefreshInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class EntitlementRefreshInfo  implements java.io.Serializable {
    private com.novell.www.resource.service.CodeMapRefreshStatus[] detailedStatus;

    private java.lang.String entitlementDN;

    private java.lang.String guid;

    private boolean status;

    public EntitlementRefreshInfo() {
    }

    public EntitlementRefreshInfo(
           com.novell.www.resource.service.CodeMapRefreshStatus[] detailedStatus,
           java.lang.String entitlementDN,
           java.lang.String guid,
           boolean status) {
           this.detailedStatus = detailedStatus;
           this.entitlementDN = entitlementDN;
           this.guid = guid;
           this.status = status;
    }


    /**
     * Gets the detailedStatus value for this EntitlementRefreshInfo.
     * 
     * @return detailedStatus
     */
    public com.novell.www.resource.service.CodeMapRefreshStatus[] getDetailedStatus() {
        return detailedStatus;
    }


    /**
     * Sets the detailedStatus value for this EntitlementRefreshInfo.
     * 
     * @param detailedStatus
     */
    public void setDetailedStatus(com.novell.www.resource.service.CodeMapRefreshStatus[] detailedStatus) {
        this.detailedStatus = detailedStatus;
    }


    /**
     * Gets the entitlementDN value for this EntitlementRefreshInfo.
     * 
     * @return entitlementDN
     */
    public java.lang.String getEntitlementDN() {
        return entitlementDN;
    }


    /**
     * Sets the entitlementDN value for this EntitlementRefreshInfo.
     * 
     * @param entitlementDN
     */
    public void setEntitlementDN(java.lang.String entitlementDN) {
        this.entitlementDN = entitlementDN;
    }


    /**
     * Gets the guid value for this EntitlementRefreshInfo.
     * 
     * @return guid
     */
    public java.lang.String getGuid() {
        return guid;
    }


    /**
     * Sets the guid value for this EntitlementRefreshInfo.
     * 
     * @param guid
     */
    public void setGuid(java.lang.String guid) {
        this.guid = guid;
    }


    /**
     * Gets the status value for this EntitlementRefreshInfo.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this EntitlementRefreshInfo.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitlementRefreshInfo)) return false;
        EntitlementRefreshInfo other = (EntitlementRefreshInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailedStatus==null && other.getDetailedStatus()==null) || 
             (this.detailedStatus!=null &&
              java.util.Arrays.equals(this.detailedStatus, other.getDetailedStatus()))) &&
            ((this.entitlementDN==null && other.getEntitlementDN()==null) || 
             (this.entitlementDN!=null &&
              this.entitlementDN.equals(other.getEntitlementDN()))) &&
            ((this.guid==null && other.getGuid()==null) || 
             (this.guid!=null &&
              this.guid.equals(other.getGuid()))) &&
            this.status == other.isStatus();
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
        if (getDetailedStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailedStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailedStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntitlementDN() != null) {
            _hashCode += getEntitlementDN().hashCode();
        }
        if (getGuid() != null) {
            _hashCode += getGuid().hashCode();
        }
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitlementRefreshInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "EntitlementRefreshInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "detailedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapRefreshStatus"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codemaprefreshstatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementDN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entitlementDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "guid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
