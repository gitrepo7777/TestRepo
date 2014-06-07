//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represent a change in Contract Size.
 * 
 * <p>Java class for ChangeContractSize complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeContractSize">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}ChangeContract">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="changeInNotionalAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *           &lt;element name="outstandingNotionalAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="changeInNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="outstandingNumberOfOptions" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="changeInNumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="outstandingNumberOfUnits" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeContractSize", propOrder = {
    "changeInNotionalAmount",
    "outstandingNotionalAmount",
    "changeInNumberOfOptions",
    "outstandingNumberOfOptions",
    "changeInNumberOfUnits",
    "outstandingNumberOfUnits"
})
public class ChangeContractSize
    extends ChangeContract
{

    protected Money changeInNotionalAmount;
    protected Money outstandingNotionalAmount;
    protected BigDecimal changeInNumberOfOptions;
    protected BigDecimal outstandingNumberOfOptions;
    protected BigDecimal changeInNumberOfUnits;
    protected BigDecimal outstandingNumberOfUnits;

    /**
     * Gets the value of the changeInNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getChangeInNotionalAmount() {
        return changeInNotionalAmount;
    }

    /**
     * Sets the value of the changeInNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setChangeInNotionalAmount(Money value) {
        this.changeInNotionalAmount = value;
    }

    /**
     * Gets the value of the outstandingNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    /**
     * Sets the value of the outstandingNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOutstandingNotionalAmount(Money value) {
        this.outstandingNotionalAmount = value;
    }

    /**
     * Gets the value of the changeInNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeInNumberOfOptions() {
        return changeInNumberOfOptions;
    }

    /**
     * Sets the value of the changeInNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeInNumberOfOptions(BigDecimal value) {
        this.changeInNumberOfOptions = value;
    }

    /**
     * Gets the value of the outstandingNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfOptions() {
        return outstandingNumberOfOptions;
    }

    /**
     * Sets the value of the outstandingNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfOptions(BigDecimal value) {
        this.outstandingNumberOfOptions = value;
    }

    /**
     * Gets the value of the changeInNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeInNumberOfUnits() {
        return changeInNumberOfUnits;
    }

    /**
     * Sets the value of the changeInNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeInNumberOfUnits(BigDecimal value) {
        this.changeInNumberOfUnits = value;
    }

    /**
     * Gets the value of the outstandingNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfUnits() {
        return outstandingNumberOfUnits;
    }

    /**
     * Sets the value of the outstandingNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfUnits(BigDecimal value) {
        this.outstandingNumberOfUnits = value;
    }

}
