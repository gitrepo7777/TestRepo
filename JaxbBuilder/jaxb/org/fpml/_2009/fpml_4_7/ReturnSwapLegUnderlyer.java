//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A base class for all return leg types with an underlyer.
 * 
 * <p>Java class for ReturnSwapLegUnderlyer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwapLegUnderlyer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}ReturnSwapLeg">
 *       &lt;sequence>
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableOrRelativeDate"/>
 *         &lt;element name="terminationDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableOrRelativeDate"/>
 *         &lt;element name="strikeDate" type="{http://www.fpml.org/2009/FpML-4-7}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="underlyer" type="{http://www.fpml.org/2009/FpML-4-7}Underlyer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwapLegUnderlyer", propOrder = {
    "effectiveDate",
    "terminationDate",
    "strikeDate",
    "underlyer"
})
@XmlSeeAlso({
    ReturnLeg.class
})
public abstract class ReturnSwapLegUnderlyer
    extends ReturnSwapLeg
{

    @XmlElement(required = true)
    protected AdjustableOrRelativeDate effectiveDate;
    @XmlElement(required = true)
    protected AdjustableOrRelativeDate terminationDate;
    protected AdjustableOrRelativeDate strikeDate;
    @XmlElement(required = true)
    protected Underlyer underlyer;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setEffectiveDate(AdjustableOrRelativeDate value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setTerminationDate(AdjustableOrRelativeDate value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the strikeDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getStrikeDate() {
        return strikeDate;
    }

    /**
     * Sets the value of the strikeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setStrikeDate(AdjustableOrRelativeDate value) {
        this.strikeDate = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link Underlyer }
     *     
     */
    public Underlyer getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Underlyer }
     *     
     */
    public void setUnderlyer(Underlyer value) {
        this.underlyer = value;
    }

}
