//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:16 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining swap streams and additional payments between the principal parties involved in the swap.
 * 
 * <p>Java class for Swap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Swap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}Product">
 *       &lt;sequence>
 *         &lt;element name="swapStream" type="{http://www.fpml.org/2009/FpML-4-7}InterestRateStream" maxOccurs="unbounded"/>
 *         &lt;element name="earlyTerminationProvision" type="{http://www.fpml.org/2009/FpML-4-7}EarlyTerminationProvision" minOccurs="0"/>
 *         &lt;element name="cancelableProvision" type="{http://www.fpml.org/2009/FpML-4-7}CancelableProvision" minOccurs="0"/>
 *         &lt;element name="extendibleProvision" type="{http://www.fpml.org/2009/FpML-4-7}ExtendibleProvision" minOccurs="0"/>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/2009/FpML-4-7}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalTerms" type="{http://www.fpml.org/2009/FpML-4-7}SwapAdditionalTerms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Swap", propOrder = {
    "swapStream",
    "earlyTerminationProvision",
    "cancelableProvision",
    "extendibleProvision",
    "additionalPayment",
    "additionalTerms"
})
public class Swap
    extends Product
{

    @XmlElement(required = true)
    protected List<InterestRateStream> swapStream;
    protected EarlyTerminationProvision earlyTerminationProvision;
    protected CancelableProvision cancelableProvision;
    protected ExtendibleProvision extendibleProvision;
    protected List<Payment> additionalPayment;
    protected SwapAdditionalTerms additionalTerms;

    /**
     * Gets the value of the swapStream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swapStream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwapStream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateStream }
     * 
     * 
     */
    public List<InterestRateStream> getSwapStream() {
        if (swapStream == null) {
            swapStream = new ArrayList<InterestRateStream>();
        }
        return this.swapStream;
    }

    /**
     * Gets the value of the earlyTerminationProvision property.
     * 
     * @return
     *     possible object is
     *     {@link EarlyTerminationProvision }
     *     
     */
    public EarlyTerminationProvision getEarlyTerminationProvision() {
        return earlyTerminationProvision;
    }

    /**
     * Sets the value of the earlyTerminationProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarlyTerminationProvision }
     *     
     */
    public void setEarlyTerminationProvision(EarlyTerminationProvision value) {
        this.earlyTerminationProvision = value;
    }

    /**
     * Gets the value of the cancelableProvision property.
     * 
     * @return
     *     possible object is
     *     {@link CancelableProvision }
     *     
     */
    public CancelableProvision getCancelableProvision() {
        return cancelableProvision;
    }

    /**
     * Sets the value of the cancelableProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelableProvision }
     *     
     */
    public void setCancelableProvision(CancelableProvision value) {
        this.cancelableProvision = value;
    }

    /**
     * Gets the value of the extendibleProvision property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendibleProvision }
     *     
     */
    public ExtendibleProvision getExtendibleProvision() {
        return extendibleProvision;
    }

    /**
     * Sets the value of the extendibleProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendibleProvision }
     *     
     */
    public void setExtendibleProvision(ExtendibleProvision value) {
        this.extendibleProvision = value;
    }

    /**
     * Gets the value of the additionalPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getAdditionalPayment() {
        if (additionalPayment == null) {
            additionalPayment = new ArrayList<Payment>();
        }
        return this.additionalPayment;
    }

    /**
     * Gets the value of the additionalTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SwapAdditionalTerms }
     *     
     */
    public SwapAdditionalTerms getAdditionalTerms() {
        return additionalTerms;
    }

    /**
     * Sets the value of the additionalTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapAdditionalTerms }
     *     
     */
    public void setAdditionalTerms(SwapAdditionalTerms value) {
        this.additionalTerms = value;
    }

}
