/**
 * GetResourcessInfoByCategoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class GetResourcessInfoByCategoryRequest  implements java.io.Serializable {
    private com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys;

    public GetResourcessInfoByCategoryRequest() {
    }

    public GetResourcessInfoByCategoryRequest(
           com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys) {
           this.resourceCategoryKeys = resourceCategoryKeys;
    }


    /**
     * Gets the resourceCategoryKeys value for this GetResourcessInfoByCategoryRequest.
     * 
     * @return resourceCategoryKeys
     */
    public com.novell.www.resource.service.CategoryKey[] getResourceCategoryKeys() {
        return resourceCategoryKeys;
    }


    /**
     * Sets the resourceCategoryKeys value for this GetResourcessInfoByCategoryRequest.
     * 
     * @param resourceCategoryKeys
     */
    public void setResourceCategoryKeys(com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys) {
        this.resourceCategoryKeys = resourceCategoryKeys;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResourcessInfoByCategoryRequest)) return false;
        GetResourcessInfoByCategoryRequest other = (GetResourcessInfoByCategoryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(GetResourcessInfoByCategoryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoByCategoryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceCategoryKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceCategoryKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CategoryKey"));
        elemField.setMinOccurs(0);
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
