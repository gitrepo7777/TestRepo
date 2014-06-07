//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that is extending the Offset structure for providing the ability to specify an FX fixing date as an offset to dates specified somewhere else in the document.
 * 
 * <p>Java class for FxFixingDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxFixingDate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Offset">
 *       &lt;sequence>
 *         &lt;element name="businessDayConvention" type="{http://www.fpml.org/2009/FpML-4-7}BusinessDayConventionEnum"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}BusinessCentersOrReference.model" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="dateRelativeToPaymentDates" type="{http://www.fpml.org/2009/FpML-4-7}DateRelativeToPaymentDates"/>
 *           &lt;element name="dateRelativeToCalculationPeriodDates" type="{http://www.fpml.org/2009/FpML-4-7}DateRelativeToCalculationPeriodDates"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxFixingDate", propOrder = {
    "businessDayConvention",
    "businessCentersReference",
    "businessCenters",
    "dateRelativeToPaymentDates",
    "dateRelativeToCalculationPeriodDates"
})
public class FxFixingDate
    extends Offset
{

    @XmlElement(required = true)
    protected BusinessDayConventionEnum businessDayConvention;
    protected BusinessCentersReference businessCentersReference;
    protected BusinessCenters businessCenters;
    protected DateRelativeToPaymentDates dateRelativeToPaymentDates;
    protected DateRelativeToCalculationPeriodDates dateRelativeToCalculationPeriodDates;

    /**
     * Gets the value of the businessDayConvention property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayConventionEnum }
     *     
     */
    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    /**
     * Sets the value of the businessDayConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayConventionEnum }
     *     
     */
    public void setBusinessDayConvention(BusinessDayConventionEnum value) {
        this.businessDayConvention = value;
    }

    /**
     * Gets the value of the businessCentersReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCentersReference }
     *     
     */
    public BusinessCentersReference getBusinessCentersReference() {
        return businessCentersReference;
    }

    /**
     * Sets the value of the businessCentersReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCentersReference }
     *     
     */
    public void setBusinessCentersReference(BusinessCentersReference value) {
        this.businessCentersReference = value;
    }

    /**
     * Gets the value of the businessCenters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    /**
     * Sets the value of the businessCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    public void setBusinessCenters(BusinessCenters value) {
        this.businessCenters = value;
    }

    /**
     * Gets the value of the dateRelativeToPaymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateRelativeToPaymentDates }
     *     
     */
    public DateRelativeToPaymentDates getDateRelativeToPaymentDates() {
        return dateRelativeToPaymentDates;
    }

    /**
     * Sets the value of the dateRelativeToPaymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRelativeToPaymentDates }
     *     
     */
    public void setDateRelativeToPaymentDates(DateRelativeToPaymentDates value) {
        this.dateRelativeToPaymentDates = value;
    }

    /**
     * Gets the value of the dateRelativeToCalculationPeriodDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateRelativeToCalculationPeriodDates }
     *     
     */
    public DateRelativeToCalculationPeriodDates getDateRelativeToCalculationPeriodDates() {
        return dateRelativeToCalculationPeriodDates;
    }

    /**
     * Sets the value of the dateRelativeToCalculationPeriodDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRelativeToCalculationPeriodDates }
     *     
     */
    public void setDateRelativeToCalculationPeriodDates(DateRelativeToCalculationPeriodDates value) {
        this.dateRelativeToCalculationPeriodDates = value;
    }

}
