/**
 * Resource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.novell.www.resource.service;

public class Resource  implements java.io.Serializable {
    private boolean active;

    private boolean allowOverride;

    private boolean allowedMulty;

    private java.lang.String description;

    private com.novell.www.resource.service.NrfEntitlementRef[] entitlementRef;

    private java.lang.String entityKey;

    private com.novell.www.resource.service.Approver[] grantApprovers;

    private java.lang.String grantQuorum;

    private java.lang.String grantRequestDef;

    private java.lang.String name;

    private com.novell.www.resource.service.DNString[] owners;

    private com.novell.www.resource.service.ResourceParameter[] parameters;

    private java.lang.String provisioningRequestDef;

    private com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys;

    private com.novell.www.resource.service.Approver[] revokeApprovers;

    private java.lang.String revokeQuorum;

    private java.lang.String revokeRequestDef;

    public Resource() {
    }

    public Resource(
           boolean active,
           boolean allowOverride,
           boolean allowedMulty,
           java.lang.String description,
           com.novell.www.resource.service.NrfEntitlementRef[] entitlementRef,
           java.lang.String entityKey,
           com.novell.www.resource.service.Approver[] grantApprovers,
           java.lang.String grantQuorum,
           java.lang.String grantRequestDef,
           java.lang.String name,
           com.novell.www.resource.service.DNString[] owners,
           com.novell.www.resource.service.ResourceParameter[] parameters,
           java.lang.String provisioningRequestDef,
           com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys,
           com.novell.www.resource.service.Approver[] revokeApprovers,
           java.lang.String revokeQuorum,
           java.lang.String revokeRequestDef) {
           this.active = active;
           this.allowOverride = allowOverride;
           this.allowedMulty = allowedMulty;
           this.description = description;
           this.entitlementRef = entitlementRef;
           this.entityKey = entityKey;
           this.grantApprovers = grantApprovers;
           this.grantQuorum = grantQuorum;
           this.grantRequestDef = grantRequestDef;
           this.name = name;
           this.owners = owners;
           this.parameters = parameters;
           this.provisioningRequestDef = provisioningRequestDef;
           this.resourceCategoryKeys = resourceCategoryKeys;
           this.revokeApprovers = revokeApprovers;
           this.revokeQuorum = revokeQuorum;
           this.revokeRequestDef = revokeRequestDef;
    }


    /**
     * Gets the active value for this Resource.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Resource.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the allowOverride value for this Resource.
     * 
     * @return allowOverride
     */
    public boolean isAllowOverride() {
        return allowOverride;
    }


    /**
     * Sets the allowOverride value for this Resource.
     * 
     * @param allowOverride
     */
    public void setAllowOverride(boolean allowOverride) {
        this.allowOverride = allowOverride;
    }


    /**
     * Gets the allowedMulty value for this Resource.
     * 
     * @return allowedMulty
     */
    public boolean isAllowedMulty() {
        return allowedMulty;
    }


    /**
     * Sets the allowedMulty value for this Resource.
     * 
     * @param allowedMulty
     */
    public void setAllowedMulty(boolean allowedMulty) {
        this.allowedMulty = allowedMulty;
    }


    /**
     * Gets the description value for this Resource.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Resource.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the entitlementRef value for this Resource.
     * 
     * @return entitlementRef
     */
    public com.novell.www.resource.service.NrfEntitlementRef[] getEntitlementRef() {
        return entitlementRef;
    }


    /**
     * Sets the entitlementRef value for this Resource.
     * 
     * @param entitlementRef
     */
    public void setEntitlementRef(com.novell.www.resource.service.NrfEntitlementRef[] entitlementRef) {
        this.entitlementRef = entitlementRef;
    }


    /**
     * Gets the entityKey value for this Resource.
     * 
     * @return entityKey
     */
    public java.lang.String getEntityKey() {
        return entityKey;
    }


    /**
     * Sets the entityKey value for this Resource.
     * 
     * @param entityKey
     */
    public void setEntityKey(java.lang.String entityKey) {
        this.entityKey = entityKey;
    }


    /**
     * Gets the grantApprovers value for this Resource.
     * 
     * @return grantApprovers
     */
    public com.novell.www.resource.service.Approver[] getGrantApprovers() {
        return grantApprovers;
    }


    /**
     * Sets the grantApprovers value for this Resource.
     * 
     * @param grantApprovers
     */
    public void setGrantApprovers(com.novell.www.resource.service.Approver[] grantApprovers) {
        this.grantApprovers = grantApprovers;
    }


    /**
     * Gets the grantQuorum value for this Resource.
     * 
     * @return grantQuorum
     */
    public java.lang.String getGrantQuorum() {
        return grantQuorum;
    }


    /**
     * Sets the grantQuorum value for this Resource.
     * 
     * @param grantQuorum
     */
    public void setGrantQuorum(java.lang.String grantQuorum) {
        this.grantQuorum = grantQuorum;
    }


    /**
     * Gets the grantRequestDef value for this Resource.
     * 
     * @return grantRequestDef
     */
    public java.lang.String getGrantRequestDef() {
        return grantRequestDef;
    }


    /**
     * Sets the grantRequestDef value for this Resource.
     * 
     * @param grantRequestDef
     */
    public void setGrantRequestDef(java.lang.String grantRequestDef) {
        this.grantRequestDef = grantRequestDef;
    }


    /**
     * Gets the name value for this Resource.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Resource.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the owners value for this Resource.
     * 
     * @return owners
     */
    public com.novell.www.resource.service.DNString[] getOwners() {
        return owners;
    }


    /**
     * Sets the owners value for this Resource.
     * 
     * @param owners
     */
    public void setOwners(com.novell.www.resource.service.DNString[] owners) {
        this.owners = owners;
    }


    /**
     * Gets the parameters value for this Resource.
     * 
     * @return parameters
     */
    public com.novell.www.resource.service.ResourceParameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this Resource.
     * 
     * @param parameters
     */
    public void setParameters(com.novell.www.resource.service.ResourceParameter[] parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the provisioningRequestDef value for this Resource.
     * 
     * @return provisioningRequestDef
     */
    public java.lang.String getProvisioningRequestDef() {
        return provisioningRequestDef;
    }


    /**
     * Sets the provisioningRequestDef value for this Resource.
     * 
     * @param provisioningRequestDef
     */
    public void setProvisioningRequestDef(java.lang.String provisioningRequestDef) {
        this.provisioningRequestDef = provisioningRequestDef;
    }


    /**
     * Gets the resourceCategoryKeys value for this Resource.
     * 
     * @return resourceCategoryKeys
     */
    public com.novell.www.resource.service.CategoryKey[] getResourceCategoryKeys() {
        return resourceCategoryKeys;
    }


    /**
     * Sets the resourceCategoryKeys value for this Resource.
     * 
     * @param resourceCategoryKeys
     */
    public void setResourceCategoryKeys(com.novell.www.resource.service.CategoryKey[] resourceCategoryKeys) {
        this.resourceCategoryKeys = resourceCategoryKeys;
    }


    /**
     * Gets the revokeApprovers value for this Resource.
     * 
     * @return revokeApprovers
     */
    public com.novell.www.resource.service.Approver[] getRevokeApprovers() {
        return revokeApprovers;
    }


    /**
     * Sets the revokeApprovers value for this Resource.
     * 
     * @param revokeApprovers
     */
    public void setRevokeApprovers(com.novell.www.resource.service.Approver[] revokeApprovers) {
        this.revokeApprovers = revokeApprovers;
    }


    /**
     * Gets the revokeQuorum value for this Resource.
     * 
     * @return revokeQuorum
     */
    public java.lang.String getRevokeQuorum() {
        return revokeQuorum;
    }


    /**
     * Sets the revokeQuorum value for this Resource.
     * 
     * @param revokeQuorum
     */
    public void setRevokeQuorum(java.lang.String revokeQuorum) {
        this.revokeQuorum = revokeQuorum;
    }


    /**
     * Gets the revokeRequestDef value for this Resource.
     * 
     * @return revokeRequestDef
     */
    public java.lang.String getRevokeRequestDef() {
        return revokeRequestDef;
    }


    /**
     * Sets the revokeRequestDef value for this Resource.
     * 
     * @param revokeRequestDef
     */
    public void setRevokeRequestDef(java.lang.String revokeRequestDef) {
        this.revokeRequestDef = revokeRequestDef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Resource)) return false;
        Resource other = (Resource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            this.allowOverride == other.isAllowOverride() &&
            this.allowedMulty == other.isAllowedMulty() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.entitlementRef==null && other.getEntitlementRef()==null) || 
             (this.entitlementRef!=null &&
              java.util.Arrays.equals(this.entitlementRef, other.getEntitlementRef()))) &&
            ((this.entityKey==null && other.getEntityKey()==null) || 
             (this.entityKey!=null &&
              this.entityKey.equals(other.getEntityKey()))) &&
            ((this.grantApprovers==null && other.getGrantApprovers()==null) || 
             (this.grantApprovers!=null &&
              java.util.Arrays.equals(this.grantApprovers, other.getGrantApprovers()))) &&
            ((this.grantQuorum==null && other.getGrantQuorum()==null) || 
             (this.grantQuorum!=null &&
              this.grantQuorum.equals(other.getGrantQuorum()))) &&
            ((this.grantRequestDef==null && other.getGrantRequestDef()==null) || 
             (this.grantRequestDef!=null &&
              this.grantRequestDef.equals(other.getGrantRequestDef()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.owners==null && other.getOwners()==null) || 
             (this.owners!=null &&
              java.util.Arrays.equals(this.owners, other.getOwners()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.provisioningRequestDef==null && other.getProvisioningRequestDef()==null) || 
             (this.provisioningRequestDef!=null &&
              this.provisioningRequestDef.equals(other.getProvisioningRequestDef()))) &&
            ((this.resourceCategoryKeys==null && other.getResourceCategoryKeys()==null) || 
             (this.resourceCategoryKeys!=null &&
              java.util.Arrays.equals(this.resourceCategoryKeys, other.getResourceCategoryKeys()))) &&
            ((this.revokeApprovers==null && other.getRevokeApprovers()==null) || 
             (this.revokeApprovers!=null &&
              java.util.Arrays.equals(this.revokeApprovers, other.getRevokeApprovers()))) &&
            ((this.revokeQuorum==null && other.getRevokeQuorum()==null) || 
             (this.revokeQuorum!=null &&
              this.revokeQuorum.equals(other.getRevokeQuorum()))) &&
            ((this.revokeRequestDef==null && other.getRevokeRequestDef()==null) || 
             (this.revokeRequestDef!=null &&
              this.revokeRequestDef.equals(other.getRevokeRequestDef())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowOverride() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowedMulty() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEntitlementRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntitlementRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntitlementRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityKey() != null) {
            _hashCode += getEntityKey().hashCode();
        }
        if (getGrantApprovers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrantApprovers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrantApprovers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrantQuorum() != null) {
            _hashCode += getGrantQuorum().hashCode();
        }
        if (getGrantRequestDef() != null) {
            _hashCode += getGrantRequestDef().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvisioningRequestDef() != null) {
            _hashCode += getProvisioningRequestDef().hashCode();
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
        if (getRevokeApprovers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevokeApprovers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevokeApprovers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevokeQuorum() != null) {
            _hashCode += getRevokeQuorum().hashCode();
        }
        if (getRevokeRequestDef() != null) {
            _hashCode += getRevokeRequestDef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Resource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Resource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "allowOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedMulty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "allowedMulty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entitlementRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "NrfEntitlementRef"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "nrfentitlementref"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "entityKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantApprovers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "grantApprovers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Approver"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "approver"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantQuorum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "grantQuorum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantRequestDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "grantRequestDef"));
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
        elemField.setFieldName("owners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "owners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "DNString"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "dnstring"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "ResourceParameter"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "resourceparameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningRequestDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "provisioningRequestDef"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revokeApprovers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "revokeApprovers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "Approver"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "approver"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revokeQuorum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "revokeQuorum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revokeRequestDef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.novell.com/resource/service", "revokeRequestDef"));
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
