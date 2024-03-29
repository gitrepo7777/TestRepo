//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:58 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A scheme defining where bullion is to be delivered for a Bullion Transaction.
 * 
 * <p>Java class for BullionDeliveryLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BullionDeliveryLocation">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/2009/FpML-4-7>Scheme">
 *       &lt;attribute name="bullionDeliveryLocationScheme" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="http://www.fpml.org/coding-scheme/bullion-delivery-location" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BullionDeliveryLocation", propOrder = {
    "value"
})
public class BullionDeliveryLocation {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String bullionDeliveryLocationScheme;

    /**
     * The base class for all types which define coding schemes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the bullionDeliveryLocationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBullionDeliveryLocationScheme() {
        if (bullionDeliveryLocationScheme == null) {
            return "http://www.fpml.org/coding-scheme/bullion-delivery-location";
        } else {
            return bullionDeliveryLocationScheme;
        }
    }

    /**
     * Sets the value of the bullionDeliveryLocationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBullionDeliveryLocationScheme(String value) {
        this.bullionDeliveryLocationScheme = value;
    }

}
