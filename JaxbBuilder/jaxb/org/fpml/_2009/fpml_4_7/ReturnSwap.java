//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:46 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing return swaps including equity swaps (long form), total return swaps, and variance swaps.
 * 
 * <p>Java class for ReturnSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}ReturnSwapBase">
 *       &lt;sequence>
 *         &lt;element name="additionalPayment" type="{http://www.fpml.org/2009/FpML-4-7}ReturnSwapAdditionalPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="earlyTermination" type="{http://www.fpml.org/2009/FpML-4-7}ReturnSwapEarlyTermination" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extraordinaryEvents" type="{http://www.fpml.org/2009/FpML-4-7}ExtraordinaryEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwap", propOrder = {
    "additionalPayment",
    "earlyTermination",
    "extraordinaryEvents"
})
public class ReturnSwap
    extends ReturnSwapBase
{

    protected List<ReturnSwapAdditionalPayment> additionalPayment;
    protected List<ReturnSwapEarlyTermination> earlyTermination;
    protected ExtraordinaryEvents extraordinaryEvents;

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
     * {@link ReturnSwapAdditionalPayment }
     * 
     * 
     */
    public List<ReturnSwapAdditionalPayment> getAdditionalPayment() {
        if (additionalPayment == null) {
            additionalPayment = new ArrayList<ReturnSwapAdditionalPayment>();
        }
        return this.additionalPayment;
    }

    /**
     * Gets the value of the earlyTermination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the earlyTermination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyTermination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnSwapEarlyTermination }
     * 
     * 
     */
    public List<ReturnSwapEarlyTermination> getEarlyTermination() {
        if (earlyTermination == null) {
            earlyTermination = new ArrayList<ReturnSwapEarlyTermination>();
        }
        return this.earlyTermination;
    }

    /**
     * Gets the value of the extraordinaryEvents property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraordinaryEvents }
     *     
     */
    public ExtraordinaryEvents getExtraordinaryEvents() {
        return extraordinaryEvents;
    }

    /**
     * Sets the value of the extraordinaryEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraordinaryEvents }
     *     
     */
    public void setExtraordinaryEvents(ExtraordinaryEvents value) {
        this.extraordinaryEvents = value;
    }

}