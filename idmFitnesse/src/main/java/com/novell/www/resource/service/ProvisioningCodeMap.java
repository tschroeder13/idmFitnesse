/**
 * ProvisioningCodeMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class ProvisioningCodeMap  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String driverDisplayName;

    private java.lang.String driverDn;

    private java.lang.String entitlementDn;

    private java.lang.String entityKey;

    private int entityType;

    private com.novell.www.resource.service.ProvisioningCodeMapLabel[] labels;

    private long lastRefreshed;

    private java.lang.String name;

    private java.lang.String queryKey;

    private java.lang.String viewId;

    public ProvisioningCodeMap() {
    }

    public ProvisioningCodeMap(
           java.lang.String description,
           java.lang.String driverDisplayName,
           java.lang.String driverDn,
           java.lang.String entitlementDn,
           java.lang.String entityKey,
           int entityType,
           com.novell.www.resource.service.ProvisioningCodeMapLabel[] labels,
           long lastRefreshed,
           java.lang.String name,
           java.lang.String queryKey,
           java.lang.String viewId) {
           this.description = description;
           this.driverDisplayName = driverDisplayName;
           this.driverDn = driverDn;
           this.entitlementDn = entitlementDn;
           this.entityKey = entityKey;
           this.entityType = entityType;
           this.labels = labels;
           this.lastRefreshed = lastRefreshed;
           this.name = name;
           this.queryKey = queryKey;
           this.viewId = viewId;
    }


    /**
     * Gets the description value for this ProvisioningCodeMap.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProvisioningCodeMap.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the driverDisplayName value for this ProvisioningCodeMap.
     * 
     * @return driverDisplayName
     */
    public java.lang.String getDriverDisplayName() {
        return driverDisplayName;
    }


    /**
     * Sets the driverDisplayName value for this ProvisioningCodeMap.
     * 
     * @param driverDisplayName
     */
    public void setDriverDisplayName(java.lang.String driverDisplayName) {
        this.driverDisplayName = driverDisplayName;
    }


    /**
     * Gets the driverDn value for this ProvisioningCodeMap.
     * 
     * @return driverDn
     */
    public java.lang.String getDriverDn() {
        return driverDn;
    }


    /**
     * Sets the driverDn value for this ProvisioningCodeMap.
     * 
     * @param driverDn
     */
    public void setDriverDn(java.lang.String driverDn) {
        this.driverDn = driverDn;
    }


    /**
     * Gets the entitlementDn value for this ProvisioningCodeMap.
     * 
     * @return entitlementDn
     */
    public java.lang.String getEntitlementDn() {
        return entitlementDn;
    }


    /**
     * Sets the entitlementDn value for this ProvisioningCodeMap.
     * 
     * @param entitlementDn
     */
    public void setEntitlementDn(java.lang.String entitlementDn) {
        this.entitlementDn = entitlementDn;
    }


    /**
     * Gets the entityKey value for this ProvisioningCodeMap.
     * 
     * @return entityKey
     */
    public java.lang.String getEntityKey() {
        return entityKey;
    }


    /**
     * Sets the entityKey value for this ProvisioningCodeMap.
     * 
     * @param entityKey
     */
    public void setEntityKey(java.lang.String entityKey) {
        this.entityKey = entityKey;
    }


    /**
     * Gets the entityType value for this ProvisioningCodeMap.
     * 
     * @return entityType
     */
    public int getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this ProvisioningCodeMap.
     * 
     * @param entityType
     */
    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the labels value for this ProvisioningCodeMap.
     * 
     * @return labels
     */
    public com.novell.www.resource.service.ProvisioningCodeMapLabel[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this ProvisioningCodeMap.
     * 
     * @param labels
     */
    public void setLabels(com.novell.www.resource.service.ProvisioningCodeMapLabel[] labels) {
        this.labels = labels;
    }


    /**
     * Gets the lastRefreshed value for this ProvisioningCodeMap.
     * 
     * @return lastRefreshed
     */
    public long getLastRefreshed() {
        return lastRefreshed;
    }


    /**
     * Sets the lastRefreshed value for this ProvisioningCodeMap.
     * 
     * @param lastRefreshed
     */
    public void setLastRefreshed(long lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }


    /**
     * Gets the name value for this ProvisioningCodeMap.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProvisioningCodeMap.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the queryKey value for this ProvisioningCodeMap.
     * 
     * @return queryKey
     */
    public java.lang.String getQueryKey() {
        return queryKey;
    }


    /**
     * Sets the queryKey value for this ProvisioningCodeMap.
     * 
     * @param queryKey
     */
    public void setQueryKey(java.lang.String queryKey) {
        this.queryKey = queryKey;
    }


    /**
     * Gets the viewId value for this ProvisioningCodeMap.
     * 
     * @return viewId
     */
    public java.lang.String getViewId() {
        return viewId;
    }


    /**
     * Sets the viewId value for this ProvisioningCodeMap.
     * 
     * @param viewId
     */
    public void setViewId(java.lang.String viewId) {
        this.viewId = viewId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvisioningCodeMap)) return false;
        ProvisioningCodeMap other = (ProvisioningCodeMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.driverDisplayName==null && other.getDriverDisplayName()==null) || 
             (this.driverDisplayName!=null &&
              this.driverDisplayName.equals(other.getDriverDisplayName()))) &&
            ((this.driverDn==null && other.getDriverDn()==null) || 
             (this.driverDn!=null &&
              this.driverDn.equals(other.getDriverDn()))) &&
            ((this.entitlementDn==null && other.getEntitlementDn()==null) || 
             (this.entitlementDn!=null &&
              this.entitlementDn.equals(other.getEntitlementDn()))) &&
            ((this.entityKey==null && other.getEntityKey()==null) || 
             (this.entityKey!=null &&
              this.entityKey.equals(other.getEntityKey()))) &&
            this.entityType == other.getEntityType() &&
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels()))) &&
            this.lastRefreshed == other.getLastRefreshed() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.queryKey==null && other.getQueryKey()==null) || 
             (this.queryKey!=null &&
              this.queryKey.equals(other.getQueryKey()))) &&
            ((this.viewId==null && other.getViewId()==null) || 
             (this.viewId!=null &&
              this.viewId.equals(other.getViewId())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDriverDisplayName() != null) {
            _hashCode += getDriverDisplayName().hashCode();
        }
        if (getDriverDn() != null) {
            _hashCode += getDriverDn().hashCode();
        }
        if (getEntitlementDn() != null) {
            _hashCode += getEntitlementDn().hashCode();
        }
        if (getEntityKey() != null) {
            _hashCode += getEntityKey().hashCode();
        }
        _hashCode += getEntityType();
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getLastRefreshed()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getQueryKey() != null) {
            _hashCode += getQueryKey().hashCode();
        }
        if (getViewId() != null) {
            _hashCode += getViewId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProvisioningCodeMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "driverDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driverDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "driverDn"));
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
        elemField.setFieldName("entityKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entityKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ProvisioningCodeMapLabel"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "provisioningcodemaplabel"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRefreshed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "lastRefreshed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "queryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "viewId"));
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
