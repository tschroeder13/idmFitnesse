/**
 * ResourceAssignmentRequestStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class ResourceAssignmentRequestStatus  implements java.io.Serializable {
    private java.lang.String correlationId;

    private java.lang.String entityKey;

    private java.lang.String reason;

    private java.util.Calendar requestDate;

    private com.novell.www.resource.service.ResourceRequestParam[] requestParams;

    private java.lang.String requester;

    private java.lang.String source;

    private java.lang.String statusDescription;

    private int statusValue;

    private java.lang.String target;

    public ResourceAssignmentRequestStatus() {
    }

    public ResourceAssignmentRequestStatus(
           java.lang.String correlationId,
           java.lang.String entityKey,
           java.lang.String reason,
           java.util.Calendar requestDate,
           com.novell.www.resource.service.ResourceRequestParam[] requestParams,
           java.lang.String requester,
           java.lang.String source,
           java.lang.String statusDescription,
           int statusValue,
           java.lang.String target) {
           this.correlationId = correlationId;
           this.entityKey = entityKey;
           this.reason = reason;
           this.requestDate = requestDate;
           this.requestParams = requestParams;
           this.requester = requester;
           this.source = source;
           this.statusDescription = statusDescription;
           this.statusValue = statusValue;
           this.target = target;
    }


    /**
     * Gets the correlationId value for this ResourceAssignmentRequestStatus.
     * 
     * @return correlationId
     */
    public java.lang.String getCorrelationId() {
        return correlationId;
    }


    /**
     * Sets the correlationId value for this ResourceAssignmentRequestStatus.
     * 
     * @param correlationId
     */
    public void setCorrelationId(java.lang.String correlationId) {
        this.correlationId = correlationId;
    }


    /**
     * Gets the entityKey value for this ResourceAssignmentRequestStatus.
     * 
     * @return entityKey
     */
    public java.lang.String getEntityKey() {
        return entityKey;
    }


    /**
     * Sets the entityKey value for this ResourceAssignmentRequestStatus.
     * 
     * @param entityKey
     */
    public void setEntityKey(java.lang.String entityKey) {
        this.entityKey = entityKey;
    }


    /**
     * Gets the reason value for this ResourceAssignmentRequestStatus.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ResourceAssignmentRequestStatus.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the requestDate value for this ResourceAssignmentRequestStatus.
     * 
     * @return requestDate
     */
    public java.util.Calendar getRequestDate() {
        return requestDate;
    }


    /**
     * Sets the requestDate value for this ResourceAssignmentRequestStatus.
     * 
     * @param requestDate
     */
    public void setRequestDate(java.util.Calendar requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * Gets the requestParams value for this ResourceAssignmentRequestStatus.
     * 
     * @return requestParams
     */
    public com.novell.www.resource.service.ResourceRequestParam[] getRequestParams() {
        return requestParams;
    }


    /**
     * Sets the requestParams value for this ResourceAssignmentRequestStatus.
     * 
     * @param requestParams
     */
    public void setRequestParams(com.novell.www.resource.service.ResourceRequestParam[] requestParams) {
        this.requestParams = requestParams;
    }


    /**
     * Gets the requester value for this ResourceAssignmentRequestStatus.
     * 
     * @return requester
     */
    public java.lang.String getRequester() {
        return requester;
    }


    /**
     * Sets the requester value for this ResourceAssignmentRequestStatus.
     * 
     * @param requester
     */
    public void setRequester(java.lang.String requester) {
        this.requester = requester;
    }


    /**
     * Gets the source value for this ResourceAssignmentRequestStatus.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this ResourceAssignmentRequestStatus.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the statusDescription value for this ResourceAssignmentRequestStatus.
     * 
     * @return statusDescription
     */
    public java.lang.String getStatusDescription() {
        return statusDescription;
    }


    /**
     * Sets the statusDescription value for this ResourceAssignmentRequestStatus.
     * 
     * @param statusDescription
     */
    public void setStatusDescription(java.lang.String statusDescription) {
        this.statusDescription = statusDescription;
    }


    /**
     * Gets the statusValue value for this ResourceAssignmentRequestStatus.
     * 
     * @return statusValue
     */
    public int getStatusValue() {
        return statusValue;
    }


    /**
     * Sets the statusValue value for this ResourceAssignmentRequestStatus.
     * 
     * @param statusValue
     */
    public void setStatusValue(int statusValue) {
        this.statusValue = statusValue;
    }


    /**
     * Gets the target value for this ResourceAssignmentRequestStatus.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ResourceAssignmentRequestStatus.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceAssignmentRequestStatus)) return false;
        ResourceAssignmentRequestStatus other = (ResourceAssignmentRequestStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correlationId==null && other.getCorrelationId()==null) || 
             (this.correlationId!=null &&
              this.correlationId.equals(other.getCorrelationId()))) &&
            ((this.entityKey==null && other.getEntityKey()==null) || 
             (this.entityKey!=null &&
              this.entityKey.equals(other.getEntityKey()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.requestDate==null && other.getRequestDate()==null) || 
             (this.requestDate!=null &&
              this.requestDate.equals(other.getRequestDate()))) &&
            ((this.requestParams==null && other.getRequestParams()==null) || 
             (this.requestParams!=null &&
              java.util.Arrays.equals(this.requestParams, other.getRequestParams()))) &&
            ((this.requester==null && other.getRequester()==null) || 
             (this.requester!=null &&
              this.requester.equals(other.getRequester()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.statusDescription==null && other.getStatusDescription()==null) || 
             (this.statusDescription!=null &&
              this.statusDescription.equals(other.getStatusDescription()))) &&
            this.statusValue == other.getStatusValue() &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget())));
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
        if (getCorrelationId() != null) {
            _hashCode += getCorrelationId().hashCode();
        }
        if (getEntityKey() != null) {
            _hashCode += getEntityKey().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
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
        if (getRequester() != null) {
            _hashCode += getRequester().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStatusDescription() != null) {
            _hashCode += getStatusDescription().hashCode();
        }
        _hashCode += getStatusValue();
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourceAssignmentRequestStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceAssignmentRequestStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "correlationId"));
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
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "reason"));
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
        elemField.setFieldName("requester");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "requester"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "statusDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "statusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "target"));
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
