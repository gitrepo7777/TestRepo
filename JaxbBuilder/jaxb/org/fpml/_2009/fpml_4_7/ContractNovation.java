//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Details of the Contract Novation.
 * 
 * <p>Java class for ContractNovation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractNovation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}ContractNovationDetails.model"/>
 *         &lt;element name="payment" type="{http://www.fpml.org/2009/FpML-4-7}Payment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractNovation", propOrder = {
    "content"
})
public class ContractNovation {

    @XmlElementRefs({
        @XmlElementRef(name = "newContract", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "novationContractDate", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "novatedAmount", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "remainingParty", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "transferor", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "firstPeriodStartDate", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "creditDerivativesNotices", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "contractualTermsSupplement", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "nonReliance", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "oldContract", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "novatedNumberOfOptions", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "oldContractReference", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "transferee", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "newContractReference", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "otherRemainingParty", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "novationDate", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "payment", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "fullFirstCalculationPeriod", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "novatedNumberOfUnits", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "contractualDefinitions", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "NewContractReference" is used by two different parts of a schema. See: 
     * line 1171 of file:/C:/MyWorkspaces/TestWorkspace/JaxbBuilder/schema/FpML%20Schemas/fpml-doc-4-7.xsd
     * line 1140 of file:/C:/MyWorkspaces/TestWorkspace/JaxbBuilder/schema/FpML%20Schemas/fpml-doc-4-7.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Contract }{@code >}
     * {@link JAXBElement }{@code <}{@link Money }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditDerivativesNotices }{@code >}
     * {@link JAXBElement }{@code <}{@link FirstPeriodStartDate }{@code >}
     * {@link JAXBElement }{@code <}{@link ContractualTermsSupplement }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Contract }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link ContractReference }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link ContractReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link Payment }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link ContractualDefinitions }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
