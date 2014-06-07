//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:58 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Commodity Notional.
 * 
 * <p>Java class for CommodityNotionalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityNotionalQuantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityUnit" type="{http://www.fpml.org/2009/FpML-4-7}QuantityUnit"/>
 *         &lt;element name="quantityFrequency" type="{http://www.fpml.org/2009/FpML-4-7}CommodityQuantityFrequency"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityNotionalQuantity", propOrder = {
    "quantityUnit",
    "quantityFrequency",
    "quantity"
})
@XmlSeeAlso({
    ElectricityPhysicalDeliveryQuantity.class,
    CommoditySettlementPeriodsNotionalQuantity.class
})
public class CommodityNotionalQuantity {

    @XmlElement(required = true)
    protected QuantityUnit quantityUnit;
    @XmlElement(required = true)
    protected CommodityQuantityFrequency quantityFrequency;
    @XmlElement(required = true)
    protected BigDecimal quantity;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the quantityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getQuantityUnit() {
        return quantityUnit;
    }

    /**
     * Sets the value of the quantityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setQuantityUnit(QuantityUnit value) {
        this.quantityUnit = value;
    }

    /**
     * Gets the value of the quantityFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityQuantityFrequency }
     *     
     */
    public CommodityQuantityFrequency getQuantityFrequency() {
        return quantityFrequency;
    }

    /**
     * Sets the value of the quantityFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityQuantityFrequency }
     *     
     */
    public void setQuantityFrequency(CommodityQuantityFrequency value) {
        this.quantityFrequency = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity(BigDecimal value) {
        this.quantity = value;
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