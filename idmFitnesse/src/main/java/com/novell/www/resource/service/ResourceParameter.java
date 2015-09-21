/**
 * ResourceParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class ResourceParameter  implements java.io.Serializable {
    private java.lang.String codemapKey;

    private java.lang.String entitlementDn;

    private boolean hiddenFlag;

    private java.lang.String key;

    private java.lang.String paramLabel;

    private boolean staticFlag;

    private java.lang.String type;

    private java.lang.String value;

    private java.lang.String valueLabel;

    public ResourceParameter() {
    }

    public ResourceParameter(
           java.lang.String codemapKey,
           java.lang.String entitlementDn,
           boolean hiddenFlag,
           java.lang.String key,
           java.lang.String paramLabel,
           boolean staticFlag,
           java.lang.String type,
           java.lang.String value,
           java.lang.String valueLabel) {
           this.codemapKey = codemapKey;
           this.entitlementDn = entitlementDn;
           this.hiddenFlag = hiddenFlag;
           this.key = key;
           this.paramLabel = paramLabel;
           this.staticFlag = staticFlag;
           this.type = type;
           this.value = value;
           this.valueLabel = valueLabel;
    }


    /**
     * Gets the codemapKey value for this ResourceParameter.
     * 
     * @return codemapKey
     */
    public java.lang.String getCodemapKey() {
        return codemapKey;
    }


    /**
     * Sets the codemapKey value for this ResourceParameter.
     * 
     * @param codemapKey
     */
    public void setCodemapKey(java.lang.String codemapKey) {
        this.codemapKey = codemapKey;
    }


    /**
     * Gets the entitlementDn value for this ResourceParameter.
     * 
     * @return entitlementDn
     */
    public java.lang.String getEntitlementDn() {
        return entitlementDn;
    }


    /**
     * Sets the entitlementDn value for this ResourceParameter.
     * 
     * @param entitlementDn
     */
    public void setEntitlementDn(java.lang.String entitlementDn) {
        this.entitlementDn = entitlementDn;
    }


    /**
     * Gets the hiddenFlag value for this ResourceParameter.
     * 
     * @return hiddenFlag
     */
    public boolean isHiddenFlag() {
        return hiddenFlag;
    }


    /**
     * Sets the hiddenFlag value for this ResourceParameter.
     * 
     * @param hiddenFlag
     */
    public void setHiddenFlag(boolean hiddenFlag) {
        this.hiddenFlag = hiddenFlag;
    }


    /**
     * Gets the key value for this ResourceParameter.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ResourceParameter.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the paramLabel value for this ResourceParameter.
     * 
     * @return paramLabel
     */
    public java.lang.String getParamLabel() {
        return paramLabel;
    }


    /**
     * Sets the paramLabel value for this ResourceParameter.
     * 
     * @param paramLabel
     */
    public void setParamLabel(java.lang.String paramLabel) {
        this.paramLabel = paramLabel;
    }


    /**
     * Gets the staticFlag value for this ResourceParameter.
     * 
     * @return staticFlag
     */
    public boolean isStaticFlag() {
        return staticFlag;
    }


    /**
     * Sets the staticFlag value for this ResourceParameter.
     * 
     * @param staticFlag
     */
    public void setStaticFlag(boolean staticFlag) {
        this.staticFlag = staticFlag;
    }


    /**
     * Gets the type value for this ResourceParameter.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ResourceParameter.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the value value for this ResourceParameter.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ResourceParameter.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the valueLabel value for this ResourceParameter.
     * 
     * @return valueLabel
     */
    public java.lang.String getValueLabel() {
        return valueLabel;
    }


    /**
     * Sets the valueLabel value for this ResourceParameter.
     * 
     * @param valueLabel
     */
    public void setValueLabel(java.lang.String valueLabel) {
        this.valueLabel = valueLabel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceParameter)) return false;
        ResourceParameter other = (ResourceParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codemapKey==null && other.getCodemapKey()==null) || 
             (this.codemapKey!=null &&
              this.codemapKey.equals(other.getCodemapKey()))) &&
            ((this.entitlementDn==null && other.getEntitlementDn()==null) || 
             (this.entitlementDn!=null &&
              this.entitlementDn.equals(other.getEntitlementDn()))) &&
            this.hiddenFlag == other.isHiddenFlag() &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.paramLabel==null && other.getParamLabel()==null) || 
             (this.paramLabel!=null &&
              this.paramLabel.equals(other.getParamLabel()))) &&
            this.staticFlag == other.isStaticFlag() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueLabel==null && other.getValueLabel()==null) || 
             (this.valueLabel!=null &&
              this.valueLabel.equals(other.getValueLabel())));
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
        if (getCodemapKey() != null) {
            _hashCode += getCodemapKey().hashCode();
        }
        if (getEntitlementDn() != null) {
            _hashCode += getEntitlementDn().hashCode();
        }
        _hashCode += (isHiddenFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getParamLabel() != null) {
            _hashCode += getParamLabel().hashCode();
        }
        _hashCode += (isStaticFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueLabel() != null) {
            _hashCode += getValueLabel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codemapKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "codemapKey"));
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
        elemField.setFieldName("hiddenFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "hiddenFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "paramLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "staticFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "valueLabel"));
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
