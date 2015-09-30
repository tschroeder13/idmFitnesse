/**
 * CodeMapRefreshStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class CodeMapRefreshStatus  implements java.io.Serializable {
    private java.lang.String connectionName;

    private java.lang.String entitlementDN;

    private java.lang.String guid;

    private long lastRefresh;

    private java.lang.String status;

    public CodeMapRefreshStatus() {
    }

    public CodeMapRefreshStatus(
           java.lang.String connectionName,
           java.lang.String entitlementDN,
           java.lang.String guid,
           long lastRefresh,
           java.lang.String status) {
           this.connectionName = connectionName;
           this.entitlementDN = entitlementDN;
           this.guid = guid;
           this.lastRefresh = lastRefresh;
           this.status = status;
    }


    /**
     * Gets the connectionName value for this CodeMapRefreshStatus.
     * 
     * @return connectionName
     */
    public java.lang.String getConnectionName() {
        return connectionName;
    }


    /**
     * Sets the connectionName value for this CodeMapRefreshStatus.
     * 
     * @param connectionName
     */
    public void setConnectionName(java.lang.String connectionName) {
        this.connectionName = connectionName;
    }


    /**
     * Gets the entitlementDN value for this CodeMapRefreshStatus.
     * 
     * @return entitlementDN
     */
    public java.lang.String getEntitlementDN() {
        return entitlementDN;
    }


    /**
     * Sets the entitlementDN value for this CodeMapRefreshStatus.
     * 
     * @param entitlementDN
     */
    public void setEntitlementDN(java.lang.String entitlementDN) {
        this.entitlementDN = entitlementDN;
    }


    /**
     * Gets the guid value for this CodeMapRefreshStatus.
     * 
     * @return guid
     */
    public java.lang.String getGuid() {
        return guid;
    }


    /**
     * Sets the guid value for this CodeMapRefreshStatus.
     * 
     * @param guid
     */
    public void setGuid(java.lang.String guid) {
        this.guid = guid;
    }


    /**
     * Gets the lastRefresh value for this CodeMapRefreshStatus.
     * 
     * @return lastRefresh
     */
    public long getLastRefresh() {
        return lastRefresh;
    }


    /**
     * Sets the lastRefresh value for this CodeMapRefreshStatus.
     * 
     * @param lastRefresh
     */
    public void setLastRefresh(long lastRefresh) {
        this.lastRefresh = lastRefresh;
    }


    /**
     * Gets the status value for this CodeMapRefreshStatus.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CodeMapRefreshStatus.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeMapRefreshStatus)) return false;
        CodeMapRefreshStatus other = (CodeMapRefreshStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.connectionName==null && other.getConnectionName()==null) || 
             (this.connectionName!=null &&
              this.connectionName.equals(other.getConnectionName()))) &&
            ((this.entitlementDN==null && other.getEntitlementDN()==null) || 
             (this.entitlementDN!=null &&
              this.entitlementDN.equals(other.getEntitlementDN()))) &&
            ((this.guid==null && other.getGuid()==null) || 
             (this.guid!=null &&
              this.guid.equals(other.getGuid()))) &&
            this.lastRefresh == other.getLastRefresh() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getConnectionName() != null) {
            _hashCode += getConnectionName().hashCode();
        }
        if (getEntitlementDN() != null) {
            _hashCode += getEntitlementDN().hashCode();
        }
        if (getGuid() != null) {
            _hashCode += getGuid().hashCode();
        }
        _hashCode += new Long(getLastRefresh()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeMapRefreshStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapRefreshStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "connectionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("lastRefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "lastRefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "status"));
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
