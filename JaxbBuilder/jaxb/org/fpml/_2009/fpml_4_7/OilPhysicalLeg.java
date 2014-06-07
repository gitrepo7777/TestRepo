//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:58 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Physically settled leg of a physically settled oil product transaction.
 * 
 * <p>Java class for OilPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OilPhysicalLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}PhysicalLeg">
 *       &lt;sequence>
 *         &lt;element name="deliveryPeriods" type="{http://www.fpml.org/2009/FpML-4-7}CommodityDeliveryPeriods"/>
 *         &lt;element name="oil" type="{http://www.fpml.org/2009/FpML-4-7}OilProduct"/>
 *         &lt;element name="deliveryConditions" type="{http://www.fpml.org/2009/FpML-4-7}OilDelivery"/>
 *         &lt;element name="deliveryQuantity" type="{http://www.fpml.org/2009/FpML-4-7}CommodityPhysicalQuantity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OilPhysicalLeg", propOrder = {
    "deliveryPeriods",
    "oil",
    "deliveryConditions",
    "deliveryQuantity"
})
public class OilPhysicalLeg
    extends PhysicalLeg
{

    @XmlElement(required = true)
    protected CommodityDeliveryPeriods deliveryPeriods;
    @XmlElement(required = true)
    protected OilProduct oil;
    @XmlElement(required = true)
    protected OilDelivery deliveryConditions;
    @XmlElement(required = true)
    protected CommodityPhysicalQuantity deliveryQuantity;

    /**
     * Gets the value of the deliveryPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public CommodityDeliveryPeriods getDeliveryPeriods() {
        return deliveryPeriods;
    }

    /**
     * Sets the value of the deliveryPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public void setDeliveryPeriods(CommodityDeliveryPeriods value) {
        this.deliveryPeriods = value;
    }

    /**
     * Gets the value of the oil property.
     * 
     * @return
     *     possible object is
     *     {@link OilProduct }
     *     
     */
    public OilProduct getOil() {
        return oil;
    }

    /**
     * Sets the value of the oil property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilProduct }
     *     
     */
    public void setOil(OilProduct value) {
        this.oil = value;
    }

    /**
     * Gets the value of the deliveryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link OilDelivery }
     *     
     */
    public OilDelivery getDeliveryConditions() {
        return deliveryConditions;
    }

    /**
     * Sets the value of the deliveryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OilDelivery }
     *     
     */
    public void setDeliveryConditions(OilDelivery value) {
        this.deliveryConditions = value;
    }

    /**
     * Gets the value of the deliveryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalQuantity }
     *     
     */
    public CommodityPhysicalQuantity getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Sets the value of the deliveryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalQuantity }
     *     
     */
    public void setDeliveryQuantity(CommodityPhysicalQuantity value) {
        this.deliveryQuantity = value;
    }

}