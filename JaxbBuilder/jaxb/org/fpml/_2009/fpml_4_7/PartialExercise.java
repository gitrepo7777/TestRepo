//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining partial exercise. As defined in the 2000 ISDA Definitions, Section 12.3 Partial Exercise, the buyer of the option may exercise all or less than all the notional amount of the underlying swap but may not be less than the minimum notional amount (if specified) and must be an integral multiple of the integral multiple amount if specified.
 * 
 * <p>Java class for PartialExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}PartialExercise.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartialExercise", propOrder = {
    "notionalReference",
    "integralMultipleAmount",
    "minimumNotionalAmount",
    "minimumNumberOfOptions"
})
public class PartialExercise {

    protected List<NotionalReference> notionalReference;
    protected BigDecimal integralMultipleAmount;
    protected BigDecimal minimumNotionalAmount;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumNumberOfOptions;

    /**
     * Gets the value of the notionalReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notionalReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotionalReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotionalReference }
     * 
     * 
     */
    public List<NotionalReference> getNotionalReference() {
        if (notionalReference == null) {
            notionalReference = new ArrayList<NotionalReference>();
        }
        return this.notionalReference;
    }

    /**
     * Gets the value of the integralMultipleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntegralMultipleAmount() {
        return integralMultipleAmount;
    }

    /**
     * Sets the value of the integralMultipleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntegralMultipleAmount(BigDecimal value) {
        this.integralMultipleAmount = value;
    }

    /**
     * Gets the value of the minimumNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    /**
     * Sets the value of the minimumNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumNotionalAmount(BigDecimal value) {
        this.minimumNotionalAmount = value;
    }

    /**
     * Gets the value of the minimumNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfOptions() {
        return minimumNumberOfOptions;
    }

    /**
     * Sets the value of the minimumNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfOptions(BigInteger value) {
        this.minimumNumberOfOptions = value;
    }

}