/**
 * GetResourcessInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class GetResourcessInfoRequest  implements java.io.Serializable {
    private com.novell.www.resource.service.DNString[] resDns;

    public GetResourcessInfoRequest() {
    }

    public GetResourcessInfoRequest(
           com.novell.www.resource.service.DNString[] resDns) {
           this.resDns = resDns;
    }


    /**
     * Gets the resDns value for this GetResourcessInfoRequest.
     * 
     * @return resDns
     */
    public com.novell.www.resource.service.DNString[] getResDns() {
        return resDns;
    }


    /**
     * Sets the resDns value for this GetResourcessInfoRequest.
     * 
     * @param resDns
     */
    public void setResDns(com.novell.www.resource.service.DNString[] resDns) {
        this.resDns = resDns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResourcessInfoRequest)) return false;
        GetResourcessInfoRequest other = (GetResourcessInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resDns==null && other.getResDns()==null) || 
             (this.resDns!=null &&
              java.util.Arrays.equals(this.resDns, other.getResDns())));
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
        if (getResDns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResDns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResDns(), i);
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
        new org.apache.axis.description.TypeDesc(GetResourcessInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "getResourcessInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resDns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resDns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "DNString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "dnstring"));
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
