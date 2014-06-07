//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining an early termination provision where either or both parties have the right to exercise.
 * 
 * <p>Java class for OptionalEarlyTermination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionalEarlyTermination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="singlePartyOption" type="{http://www.fpml.org/2009/FpML-4-7}SinglePartyOption" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/2009/FpML-4-7}exercise"/>
 *         &lt;element name="exerciseNotice" type="{http://www.fpml.org/2009/FpML-4-7}ExerciseNotice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="followUpConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="calculationAgent" type="{http://www.fpml.org/2009/FpML-4-7}CalculationAgent"/>
 *         &lt;element name="cashSettlement" type="{http://www.fpml.org/2009/FpML-4-7}CashSettlement"/>
 *         &lt;element name="optionalEarlyTerminationAdjustedDates" type="{http://www.fpml.org/2009/FpML-4-7}OptionalEarlyTerminationAdjustedDates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalEarlyTermination", propOrder = {
    "singlePartyOption",
    "exercise",
    "exerciseNotice",
    "followUpConfirmation",
    "calculationAgent",
    "cashSettlement",
    "optionalEarlyTerminationAdjustedDates"
})
public class OptionalEarlyTermination {

    protected SinglePartyOption singlePartyOption;
    @XmlElementRef(name = "exercise", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class)
    protected JAXBElement<? extends Exercise> exercise;
    protected List<ExerciseNotice> exerciseNotice;
    protected Boolean followUpConfirmation;
    @XmlElement(required = true)
    protected CalculationAgent calculationAgent;
    @XmlElement(required = true)
    protected CashSettlement cashSettlement;
    protected OptionalEarlyTerminationAdjustedDates optionalEarlyTerminationAdjustedDates;

    /**
     * Gets the value of the singlePartyOption property.
     * 
     * @return
     *     possible object is
     *     {@link SinglePartyOption }
     *     
     */
    public SinglePartyOption getSinglePartyOption() {
        return singlePartyOption;
    }

    /**
     * Sets the value of the singlePartyOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SinglePartyOption }
     *     
     */
    public void setSinglePartyOption(SinglePartyOption value) {
        this.singlePartyOption = value;
    }

    /**
     * Gets the value of the exercise property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmericanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link EuropeanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link BermudaExercise }{@code >}
     *     
     */
    public JAXBElement<? extends Exercise> getExercise() {
        return exercise;
    }

    /**
     * Sets the value of the exercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmericanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link Exercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link EuropeanExercise }{@code >}
     *     {@link JAXBElement }{@code <}{@link BermudaExercise }{@code >}
     *     
     */
    public void setExercise(JAXBElement<? extends Exercise> value) {
        this.exercise = ((JAXBElement<? extends Exercise> ) value);
    }

    /**
     * Gets the value of the exerciseNotice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exerciseNotice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExerciseNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExerciseNotice }
     * 
     * 
     */
    public List<ExerciseNotice> getExerciseNotice() {
        if (exerciseNotice == null) {
            exerciseNotice = new ArrayList<ExerciseNotice>();
        }
        return this.exerciseNotice;
    }

    /**
     * Gets the value of the followUpConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowUpConfirmation() {
        return followUpConfirmation;
    }

    /**
     * Sets the value of the followUpConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowUpConfirmation(Boolean value) {
        this.followUpConfirmation = value;
    }

    /**
     * Gets the value of the calculationAgent property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationAgent }
     *     
     */
    public CalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    /**
     * Sets the value of the calculationAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationAgent }
     *     
     */
    public void setCalculationAgent(CalculationAgent value) {
        this.calculationAgent = value;
    }

    /**
     * Gets the value of the cashSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlement }
     *     
     */
    public CashSettlement getCashSettlement() {
        return cashSettlement;
    }

    /**
     * Sets the value of the cashSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlement }
     *     
     */
    public void setCashSettlement(CashSettlement value) {
        this.cashSettlement = value;
    }

    /**
     * Gets the value of the optionalEarlyTerminationAdjustedDates property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalEarlyTerminationAdjustedDates }
     *     
     */
    public OptionalEarlyTerminationAdjustedDates getOptionalEarlyTerminationAdjustedDates() {
        return optionalEarlyTerminationAdjustedDates;
    }

    /**
     * Sets the value of the optionalEarlyTerminationAdjustedDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalEarlyTerminationAdjustedDates }
     *     
     */
    public void setOptionalEarlyTerminationAdjustedDates(OptionalEarlyTerminationAdjustedDates value) {
        this.optionalEarlyTerminationAdjustedDates = value;
    }

}
