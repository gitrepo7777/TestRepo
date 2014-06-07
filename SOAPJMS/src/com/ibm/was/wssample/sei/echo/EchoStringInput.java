/**
 * EchoStringInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.was.wssample.sei.echo;

public class EchoStringInput  implements java.io.Serializable {
    private java.lang.String echoInput;

    public EchoStringInput() {
    }

    public EchoStringInput(
           java.lang.String echoInput) {
           this.echoInput = echoInput;
    }


    /**
     * Gets the echoInput value for this EchoStringInput.
     * 
     * @return echoInput
     */
    public java.lang.String getEchoInput() {
        return echoInput;
    }


    /**
     * Sets the echoInput value for this EchoStringInput.
     * 
     * @param echoInput
     */
    public void setEchoInput(java.lang.String echoInput) {
        this.echoInput = echoInput;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EchoStringInput)) return false;
        EchoStringInput other = (EchoStringInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.echoInput==null && other.getEchoInput()==null) || 
             (this.echoInput!=null &&
              this.echoInput.equals(other.getEchoInput())));
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
        if (getEchoInput() != null) {
            _hashCode += getEchoInput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EchoStringInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://com/ibm/was/wssample/sei/echo/", ">echoStringInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("echoInput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "echoInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
