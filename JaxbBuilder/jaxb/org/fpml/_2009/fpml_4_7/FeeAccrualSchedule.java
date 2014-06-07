//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The details of the underlying elements that effect the calculation of a fee accrual.
 * 
 * <p>Java class for FeeAccrualSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeAccrualSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="lenderCommitmentPeriod" type="{http://www.fpml.org/2009/FpML-4-7}LenderPositionPeriod" maxOccurs="unbounded"/>
 *           &lt;element name="lenderUtilizationPeriod" type="{http://www.fpml.org/2009/FpML-4-7}LenderPositionPeriod" maxOccurs="unbounded"/>
 *           &lt;element name="lenderUnutilizedPeriod" type="{http://www.fpml.org/2009/FpML-4-7}LenderPositionPeriod" maxOccurs="unbounded"/>
 *           &lt;element name="lcBalancePeriod" type="{http://www.fpml.org/2009/FpML-4-7}LenderPositionPeriod" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="feeRatePeriod" type="{http://www.fpml.org/2009/FpML-4-7}RatePeriod" maxOccurs="unbounded"/>
 *         &lt;element name="feeAccrualPeriod" type="{http://www.fpml.org/2009/FpML-4-7}FeeAccrualPeriod" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeAccrualSchedule", propOrder = {
    "lenderCommitmentPeriod",
    "lenderUtilizationPeriod",
    "lenderUnutilizedPeriod",
    "lcBalancePeriod",
    "feeRatePeriod",
    "feeAccrualPeriod"
})
public class FeeAccrualSchedule {

    protected List<LenderPositionPeriod> lenderCommitmentPeriod;
    protected List<LenderPositionPeriod> lenderUtilizationPeriod;
    protected List<LenderPositionPeriod> lenderUnutilizedPeriod;
    protected List<LenderPositionPeriod> lcBalancePeriod;
    @XmlElement(required = true)
    protected List<RatePeriod> feeRatePeriod;
    @XmlElement(required = true)
    protected List<FeeAccrualPeriod> feeAccrualPeriod;

    /**
     * Gets the value of the lenderCommitmentPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lenderCommitmentPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLenderCommitmentPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LenderPositionPeriod }
     * 
     * 
     */
    public List<LenderPositionPeriod> getLenderCommitmentPeriod() {
        if (lenderCommitmentPeriod == null) {
            lenderCommitmentPeriod = new ArrayList<LenderPositionPeriod>();
        }
        return this.lenderCommitmentPeriod;
    }

    /**
     * Gets the value of the lenderUtilizationPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lenderUtilizationPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLenderUtilizationPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LenderPositionPeriod }
     * 
     * 
     */
    public List<LenderPositionPeriod> getLenderUtilizationPeriod() {
        if (lenderUtilizationPeriod == null) {
            lenderUtilizationPeriod = new ArrayList<LenderPositionPeriod>();
        }
        return this.lenderUtilizationPeriod;
    }

    /**
     * Gets the value of the lenderUnutilizedPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lenderUnutilizedPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLenderUnutilizedPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LenderPositionPeriod }
     * 
     * 
     */
    public List<LenderPositionPeriod> getLenderUnutilizedPeriod() {
        if (lenderUnutilizedPeriod == null) {
            lenderUnutilizedPeriod = new ArrayList<LenderPositionPeriod>();
        }
        return this.lenderUnutilizedPeriod;
    }

    /**
     * Gets the value of the lcBalancePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lcBalancePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLcBalancePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LenderPositionPeriod }
     * 
     * 
     */
    public List<LenderPositionPeriod> getLcBalancePeriod() {
        if (lcBalancePeriod == null) {
            lcBalancePeriod = new ArrayList<LenderPositionPeriod>();
        }
        return this.lcBalancePeriod;
    }

    /**
     * Gets the value of the feeRatePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeRatePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeRatePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePeriod }
     * 
     * 
     */
    public List<RatePeriod> getFeeRatePeriod() {
        if (feeRatePeriod == null) {
            feeRatePeriod = new ArrayList<RatePeriod>();
        }
        return this.feeRatePeriod;
    }

    /**
     * Gets the value of the feeAccrualPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeAccrualPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeAccrualPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeAccrualPeriod }
     * 
     * 
     */
    public List<FeeAccrualPeriod> getFeeAccrualPeriod() {
        if (feeAccrualPeriod == null) {
            feeAccrualPeriod = new ArrayList<FeeAccrualPeriod>();
        }
        return this.feeAccrualPeriod;
    }

}