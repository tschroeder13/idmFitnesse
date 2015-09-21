/**
 * ResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class ResourceInfo  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String entityKey;

    private java.lang.String name;

    private com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys;

    public ResourceInfo() {
    }

    public ResourceInfo(
           java.lang.String description,
           java.lang.String entityKey,
           java.lang.String name,
           com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys) {
           this.description = description;
           this.entityKey = entityKey;
           this.name = name;
           this.resourceCategoryKeys = resourceCategoryKeys;
    }


    /**
     * Gets the description value for this ResourceInfo.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResourceInfo.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the entityKey value for this ResourceInfo.
     * 
     * @return entityKey
     */
    public java.lang.String getEntityKey() {
        return entityKey;
    }


    /**
     * Sets the entityKey value for this ResourceInfo.
     * 
     * @param entityKey
     */
    public void setEntityKey(java.lang.String entityKey) {
        this.entityKey = entityKey;
    }


    /**
     * Gets the name value for this ResourceInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResourceInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the resourceCategoryKeys value for this ResourceInfo.
     * 
     * @return resourceCategoryKeys
     */
    public com.novell.www.resource.service.CategoryKey[] getResourceCategoryKeys() {
        return resourceCategoryKeys;
    }


    /**
     * Sets the resourceCategoryKeys value for this ResourceInfo.
     * 
     * @param resourceCategoryKeys
     */
    public void setResourceCategoryKeys(com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys) {
        this.resourceCategoryKeys = resourceCategoryKeys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceInfo)) return false;
        ResourceInfo other = (ResourceInfo) obj;
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
            ((this.entityKey==null && other.getEntityKey()==null) || 
             (this.entityKey!=null &&
              this.entityKey.equals(other.getEntityKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.resourceCategoryKeys==null && other.getResourceCategoryKeys()==null) || 
             (this.resourceCategoryKeys!=null &&
              java.util.Arrays.equals(this.resourceCategoryKeys, other.getResourceCategoryKeys())));
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
        if (getEntityKey() != null) {
            _hashCode += getEntityKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getResourceCategoryKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceCategoryKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceCategoryKeys(), i);
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
        new org.apache.axis.description.TypeDesc(ResourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "description"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceCategoryKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceCategoryKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CategoryKey"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "categorykey"));
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
