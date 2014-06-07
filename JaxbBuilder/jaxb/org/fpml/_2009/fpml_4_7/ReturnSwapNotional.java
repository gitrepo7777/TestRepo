//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Specifies the notional of return type swap. When used in the equity leg, the definition will typically combine the actual amount (using the notional component defined by the FpML industry group) and the determination method. When used in the interest leg, the definition will typically point to the definition of the equity leg.
 * 
 * <p>Java class for ReturnSwapNotional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwapNotional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="amountRelativeTo" type="{http://www.fpml.org/2009/FpML-4-7}AmountReference"/>
 *         &lt;element name="relativeNotionalAmount" type="{http://www.fpml.org/2009/FpML-4-7}ReturnSwapNotionalAmountReference"/>
 *         &lt;element name="relativeDeterminationMethod" type="{http://www.fpml.org/2009/FpML-4-7}DeterminationMethodReference"/>
 *         &lt;element name="determinationMethod" type="{http://www.fpml.org/2009/FpML-4-7}DeterminationMethod"/>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/2009/FpML-4-7}NotionalAmount"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwapNotional", propOrder = {
    "amountRelativeTo",
    "relativeNotionalAmount",
    "relativeDeterminationMethod",
    "determinationMethod",
    "notionalAmount"
})
public class ReturnSwapNotional {

    protected AmountReference amountRelativeTo;
    protected ReturnSwapNotionalAmountReference relativeNotionalAmount;
    protected DeterminationMethodReference relativeDeterminationMethod;
    protected DeterminationMethod determinationMethod;
    protected NotionalAmount notionalAmount;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the amountRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link AmountReference }
     *     
     */
    public AmountReference getAmountRelativeTo() {
        return amountRelativeTo;
    }

    /**
     * Sets the value of the amountRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountReference }
     *     
     */
    public void setAmountRelativeTo(AmountReference value) {
        this.amountRelativeTo = value;
    }

    /**
     * Gets the value of the relativeNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnSwapNotionalAmountReference }
     *     
     */
    public ReturnSwapNotionalAmountReference getRelativeNotionalAmount() {
        return relativeNotionalAmount;
    }

    /**
     * Sets the value of the relativeNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnSwapNotionalAmountReference }
     *     
     */
    public void setRelativeNotionalAmount(ReturnSwapNotionalAmountReference value) {
        this.relativeNotionalAmount = value;
    }

    /**
     * Gets the value of the relativeDeterminationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethodReference }
     *     
     */
    public DeterminationMethodReference getRelativeDeterminationMethod() {
        return relativeDeterminationMethod;
    }

    /**
     * Sets the value of the relativeDeterminationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethodReference }
     *     
     */
    public void setRelativeDeterminationMethod(DeterminationMethodReference value) {
        this.relativeDeterminationMethod = value;
    }

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setDeterminationMethod(DeterminationMethod value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmount }
     *     
     */
    public NotionalAmount getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmount }
     *     
     */
    public void setNotionalAmount(NotionalAmount value) {
        this.notionalAmount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
