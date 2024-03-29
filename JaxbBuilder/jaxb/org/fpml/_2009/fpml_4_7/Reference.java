//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class for all types which define intra-document pointers.
 * 
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference")
@XmlSeeAlso({
    SpreadScheduleReference.class,
    AmountReference.class,
    BusinessCentersReference.class,
    LegalEntityReference.class,
    PaymentReference.class,
    ReturnSwapNotionalAmountReference.class,
    AccountReference.class,
    DeterminationMethodReference.class,
    ScheduleReference.class,
    PartyReference.class,
    NotionalAmountReference.class,
    BusinessDayAdjustmentsReference.class,
    PartyOrAccountReference.class,
    PartyOrTradeSideReference.class,
    PricingStructureReference.class,
    DateReference.class,
    NotionalReference.class,
    IdentifiedCurrencyReference.class,
    ProductReference.class
})
public abstract class Reference {


}
