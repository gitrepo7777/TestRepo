//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type to represent a single pass through payment.
 * 
 * <p>Java class for PassThroughItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassThroughItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}PayerReceiver.model"/>
 *         &lt;element name="underlyerReference" type="{http://www.fpml.org/2009/FpML-4-7}AssetReference"/>
 *         &lt;element name="passThroughPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassThroughItem", propOrder = {
    "payerPartyReference",
    "receiverPartyReference",
    "underlyerReference",
    "passThroughPercentage"
})
public class PassThroughItem {

    @XmlElement(required = true)
    protected PartyOrAccountReference payerPartyReference;
    @XmlElement(required = true)
    protected PartyOrAccountReference receiverPartyReference;
    @XmlElement(required = true)
    protected AssetReference underlyerReference;
    @XmlElement(required = true)
    protected BigDecimal passThroughPercentage;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public PartyOrAccountReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public void setPayerPartyReference(PartyOrAccountReference value) {
        this.payerPartyReference = value;
    }

    /**
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public PartyOrAccountReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public void setReceiverPartyReference(PartyOrAccountReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the underlyerReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssetReference }
     *     
     */
    public AssetReference getUnderlyerReference() {
        return underlyerReference;
    }

    /**
     * Sets the value of the underlyerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetReference }
     *     
     */
    public void setUnderlyerReference(AssetReference value) {
        this.underlyerReference = value;
    }

    /**
     * Gets the value of the passThroughPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPassThroughPercentage() {
        return passThroughPercentage;
    }

    /**
     * Sets the value of the passThroughPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPassThroughPercentage(BigDecimal value) {
        this.passThroughPercentage = value;
    }

}
