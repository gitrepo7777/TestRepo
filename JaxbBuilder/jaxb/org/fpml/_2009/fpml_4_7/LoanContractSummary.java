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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A basic set of fields used to uniquely identify the loan contract.
 * 
 * <p>Java class for LoanContractSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanContractSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.fpml.org/2009/FpML-4-7}ContractIdentifier" maxOccurs="unbounded"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="originalAmount" type="{http://www.fpml.org/2009/FpML-4-7}Money"/>
 *           &lt;element name="participationAmount" type="{http://www.fpml.org/2009/FpML-4-7}ParticipationAmount"/>
 *         &lt;/choice>
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractSummary", propOrder = {
    "identifier",
    "originalAmount",
    "participationAmount",
    "maturityDate"
})
public class LoanContractSummary {

    @XmlElement(required = true)
    protected List<ContractIdentifier> identifier;
    protected Money originalAmount;
    protected ParticipationAmount participationAmount;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturityDate;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractIdentifier }
     * 
     * 
     */
    public List<ContractIdentifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<ContractIdentifier>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOriginalAmount(Money value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the participationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationAmount }
     *     
     */
    public ParticipationAmount getParticipationAmount() {
        return participationAmount;
    }

    /**
     * Sets the value of the participationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationAmount }
     *     
     */
    public void setParticipationAmount(ParticipationAmount value) {
        this.participationAmount = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturityDate(XMLGregorianCalendar value) {
        this.maturityDate = value;
    }

}
