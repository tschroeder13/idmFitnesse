/**
 * ResourceAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class ResourceAssignment  implements java.io.Serializable {
    private java.lang.String instanceGuid;

    private java.lang.String reason;

    private java.lang.String recipientDn;

    private java.util.Calendar requestDate;

    private com.novell.www.resource.service.ResourceRequestParam[] requestParams;

    private java.lang.String requesterDn;

    private java.lang.String resourceDn;

    public ResourceAssignment() {
    }

    public ResourceAssignment(
           java.lang.String instanceGuid,
           java.lang.String reason,
           java.lang.String recipientDn,
           java.util.Calendar requestDate,
           com.novell.www.resource.service.ResourceRequestParam[] requestParams,
           java.lang.String requesterDn,
           java.lang.String resourceDn) {
           this.instanceGuid = instanceGuid;
           this.reason = reason;
           this.recipientDn = recipientDn;
           this.requestDate = requestDate;
           this.requestParams = requestParams;
           this.requesterDn = requesterDn;
           this.resourceDn = resourceDn;
    }


    /**
     * Gets the instanceGuid value for this ResourceAssignment.
     * 
     * @return instanceGuid
     */
    public java.lang.String getInstanceGuid() {
        return instanceGuid;
    }


    /**
     * Sets the instanceGuid value for this ResourceAssignment.
     * 
     * @param instanceGuid
     */
    public void setInstanceGuid(java.lang.String instanceGuid) {
        this.instanceGuid = instanceGuid;
    }


    /**
     * Gets the reason value for this ResourceAssignment.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ResourceAssignment.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the recipientDn value for this ResourceAssignment.
     * 
     * @return recipientDn
     */
    public java.lang.String getRecipientDn() {
        return recipientDn;
    }


    /**
     * Sets the recipientDn value for this ResourceAssignment.
     * 
     * @param recipientDn
     */
    public void setRecipientDn(java.lang.String recipientDn) {
        this.recipientDn = recipientDn;
    }


    /**
     * Gets the requestDate value for this ResourceAssignment.
     * 
     * @return requestDate
     */
    public java.util.Calendar getRequestDate() {
        return requestDate;
    }


    /**
     * Sets the requestDate value for this ResourceAssignment.
     * 
     * @param requestDate
     */
    public void setRequestDate(java.util.Calendar requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * Gets the requestParams value for this ResourceAssignment.
     * 
     * @return requestParams
     */
    public com.novell.www.resource.service.ResourceRequestParam[] getRequestParams() {
        return requestParams;
    }


    /**
     * Sets the requestParams value for this ResourceAssignment.
     * 
     * @param requestParams
     */
    public void setRequestParams(com.novell.www.resource.service.ResourceRequestParam[] requestParams) {
        this.requestParams = requestParams;
    }


    /**
     * Gets the requesterDn value for this ResourceAssignment.
     * 
     * @return requesterDn
     */
    public java.lang.String getRequesterDn() {
        return requesterDn;
    }


    /**
     * Sets the requesterDn value for this ResourceAssignment.
     * 
     * @param requesterDn
     */
    public void setRequesterDn(java.lang.String requesterDn) {
        this.requesterDn = requesterDn;
    }


    /**
     * Gets the resourceDn value for this ResourceAssignment.
     * 
     * @return resourceDn
     */
    public java.lang.String getResourceDn() {
        return resourceDn;
    }


    /**
     * Sets the resourceDn value for this ResourceAssignment.
     * 
     * @param resourceDn
     */
    public void setResourceDn(java.lang.String resourceDn) {
        this.resourceDn = resourceDn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceAssignment)) return false;
        ResourceAssignment other = (ResourceAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instanceGuid==null && other.getInstanceGuid()==null) || 
             (this.instanceGuid!=null &&
              this.instanceGuid.equals(other.getInstanceGuid()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.recipientDn==null && other.getRecipientDn()==null) || 
             (this.recipientDn!=null &&
              this.recipientDn.equals(other.getRecipientDn()))) &&
            ((this.requestDate==null && other.getRequestDate()==null) || 
             (this.requestDate!=null &&
              this.requestDate.equals(other.getRequestDate()))) &&
            ((this.requestParams==null && other.getRequestParams()==null) || 
             (this.requestParams!=null &&
              java.util.Arrays.equals(this.requestParams, other.getRequestParams()))) &&
            ((this.requesterDn==null && other.getRequesterDn()==null) || 
             (this.requesterDn!=null &&
              this.requesterDn.equals(other.getRequesterDn()))) &&
            ((this.resourceDn==null && other.getResourceDn()==null) || 
             (this.resourceDn!=null &&
              this.resourceDn.equals(other.getResourceDn())));
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
        if (getInstanceGuid() != null) {
            _hashCode += getInstanceGuid().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getRecipientDn() != null) {
            _hashCode += getRecipientDn().hashCode();
        }
        if (getRequestDate() != null) {
            _hashCode += getRequestDate().hashCode();
        }
        if (getRequestParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequesterDn() != null) {
            _hashCode += getRequesterDn().hashCode();
        }
        if (getResourceDn() != null) {
            _hashCode += getResourceDn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "instanceGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "recipientDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requestParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceRequestParam"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourcerequestparam"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requesterDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceDn"));
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
