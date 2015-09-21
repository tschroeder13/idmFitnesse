/**
 * CodeMapValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class CodeMapValue  implements java.io.Serializable {
    private java.lang.String codeMap;

    private java.lang.String codeValue;

    private java.lang.String description;

    private java.lang.String displayName;

    private java.lang.String nativeValue;

    private java.lang.String paramValue;

    private java.lang.String subType;

    private java.lang.String valueId;

    public CodeMapValue() {
    }

    public CodeMapValue(
           java.lang.String codeMap,
           java.lang.String codeValue,
           java.lang.String description,
           java.lang.String displayName,
           java.lang.String nativeValue,
           java.lang.String paramValue,
           java.lang.String subType,
           java.lang.String valueId) {
           this.codeMap = codeMap;
           this.codeValue = codeValue;
           this.description = description;
           this.displayName = displayName;
           this.nativeValue = nativeValue;
           this.paramValue = paramValue;
           this.subType = subType;
           this.valueId = valueId;
    }


    /**
     * Gets the codeMap value for this CodeMapValue.
     * 
     * @return codeMap
     */
    public java.lang.String getCodeMap() {
        return codeMap;
    }


    /**
     * Sets the codeMap value for this CodeMapValue.
     * 
     * @param codeMap
     */
    public void setCodeMap(java.lang.String codeMap) {
        this.codeMap = codeMap;
    }


    /**
     * Gets the codeValue value for this CodeMapValue.
     * 
     * @return codeValue
     */
    public java.lang.String getCodeValue() {
        return codeValue;
    }


    /**
     * Sets the codeValue value for this CodeMapValue.
     * 
     * @param codeValue
     */
    public void setCodeValue(java.lang.String codeValue) {
        this.codeValue = codeValue;
    }


    /**
     * Gets the description value for this CodeMapValue.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CodeMapValue.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the displayName value for this CodeMapValue.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this CodeMapValue.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the nativeValue value for this CodeMapValue.
     * 
     * @return nativeValue
     */
    public java.lang.String getNativeValue() {
        return nativeValue;
    }


    /**
     * Sets the nativeValue value for this CodeMapValue.
     * 
     * @param nativeValue
     */
    public void setNativeValue(java.lang.String nativeValue) {
        this.nativeValue = nativeValue;
    }


    /**
     * Gets the paramValue value for this CodeMapValue.
     * 
     * @return paramValue
     */
    public java.lang.String getParamValue() {
        return paramValue;
    }


    /**
     * Sets the paramValue value for this CodeMapValue.
     * 
     * @param paramValue
     */
    public void setParamValue(java.lang.String paramValue) {
        this.paramValue = paramValue;
    }


    /**
     * Gets the subType value for this CodeMapValue.
     * 
     * @return subType
     */
    public java.lang.String getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this CodeMapValue.
     * 
     * @param subType
     */
    public void setSubType(java.lang.String subType) {
        this.subType = subType;
    }


    /**
     * Gets the valueId value for this CodeMapValue.
     * 
     * @return valueId
     */
    public java.lang.String getValueId() {
        return valueId;
    }


    /**
     * Sets the valueId value for this CodeMapValue.
     * 
     * @param valueId
     */
    public void setValueId(java.lang.String valueId) {
        this.valueId = valueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeMapValue)) return false;
        CodeMapValue other = (CodeMapValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codeMap==null && other.getCodeMap()==null) || 
             (this.codeMap!=null &&
              this.codeMap.equals(other.getCodeMap()))) &&
            ((this.codeValue==null && other.getCodeValue()==null) || 
             (this.codeValue!=null &&
              this.codeValue.equals(other.getCodeValue()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.nativeValue==null && other.getNativeValue()==null) || 
             (this.nativeValue!=null &&
              this.nativeValue.equals(other.getNativeValue()))) &&
            ((this.paramValue==null && other.getParamValue()==null) || 
             (this.paramValue!=null &&
              this.paramValue.equals(other.getParamValue()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType()))) &&
            ((this.valueId==null && other.getValueId()==null) || 
             (this.valueId!=null &&
              this.valueId.equals(other.getValueId())));
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
        if (getCodeMap() != null) {
            _hashCode += getCodeMap().hashCode();
        }
        if (getCodeValue() != null) {
            _hashCode += getCodeValue().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getNativeValue() != null) {
            _hashCode += getNativeValue().hashCode();
        }
        if (getParamValue() != null) {
            _hashCode += getParamValue().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        if (getValueId() != null) {
            _hashCode += getValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeMapValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "CodeMapValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codeMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "nativeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "paramValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "subType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "valueId"));
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
