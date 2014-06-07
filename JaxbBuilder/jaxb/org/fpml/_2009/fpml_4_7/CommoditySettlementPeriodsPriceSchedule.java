//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:58 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The fixed price schedule for electricity that applies to one or more groups of Settlement Periods.
 * 
 * <p>Java class for CommoditySettlementPeriodsPriceSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySettlementPeriodsPriceSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementPeriodsPriceStep" type="{http://www.fpml.org/2009/FpML-4-7}FixedPrice" maxOccurs="unbounded"/>
 *         &lt;element name="settlementPeriodsReference" type="{http://www.fpml.org/2009/FpML-4-7}SettlementPeriodsReference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommoditySettlementPeriodsPriceSchedule", propOrder = {
    "settlementPeriodsPriceStep",
    "settlementPeriodsReference"
})
public class CommoditySettlementPeriodsPriceSchedule {

    @XmlElement(required = true)
    protected List<FixedPrice> settlementPeriodsPriceStep;
    @XmlElement(required = true)
    protected List<SettlementPeriodsReference> settlementPeriodsReference;

    /**
     * Gets the value of the settlementPeriodsPriceStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsPriceStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsPriceStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPrice }
     * 
     * 
     */
    public List<FixedPrice> getSettlementPeriodsPriceStep() {
        if (settlementPeriodsPriceStep == null) {
            settlementPeriodsPriceStep = new ArrayList<FixedPrice>();
        }
        return this.settlementPeriodsPriceStep;
    }

    /**
     * Gets the value of the settlementPeriodsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementPeriodsReference }
     * 
     * 
     */
    public List<SettlementPeriodsReference> getSettlementPeriodsReference() {
        if (settlementPeriodsReference == null) {
            settlementPeriodsReference = new ArrayList<SettlementPeriodsReference>();
        }
        return this.settlementPeriodsReference;
    }

}
