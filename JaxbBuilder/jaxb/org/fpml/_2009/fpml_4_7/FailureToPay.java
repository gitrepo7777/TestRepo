//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailureToPay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureToPay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gracePeriodExtension" type="{http://www.fpml.org/2009/FpML-4-7}GracePeriodExtension" minOccurs="0"/>
 *         &lt;element name="paymentRequirement" type="{http://www.fpml.org/2009/FpML-4-7}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureToPay", propOrder = {
    "gracePeriodExtension",
    "paymentRequirement"
})
public class FailureToPay {

    protected GracePeriodExtension gracePeriodExtension;
    protected Money paymentRequirement;

    /**
     * Gets the value of the gracePeriodExtension property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriodExtension }
     *     
     */
    public GracePeriodExtension getGracePeriodExtension() {
        return gracePeriodExtension;
    }

    /**
     * Sets the value of the gracePeriodExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriodExtension }
     *     
     */
    public void setGracePeriodExtension(GracePeriodExtension value) {
        this.gracePeriodExtension = value;
    }

    /**
     * Gets the value of the paymentRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentRequirement() {
        return paymentRequirement;
    }

    /**
     * Sets the value of the paymentRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentRequirement(Money value) {
        this.paymentRequirement = value;
    }

}