//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:53:15 PM EDT 
//


package org.fpml._2009.fpml_4_7;

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
 * An servicing date relevant for a trade structure, such as a payment or a reset.
 * 
 * <p>Java class for ScheduledDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduledDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}AdjustedAndOrUnadjustedDate.model"/>
 *         &lt;element name="type" type="{http://www.fpml.org/2009/FpML-4-7}ScheduledDateType"/>
 *         &lt;element name="assetReference" type="{http://www.fpml.org/2009/FpML-4-7}AnyAssetReference" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}AssociatedValue.model" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledDate", propOrder = {
    "content"
})
public class ScheduledDate {

    @XmlElementRefs({
        @XmlElementRef(name = "associatedValue", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "type", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "associatedValueReference", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "adjustedDate", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "unadjustedDate", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "assetReference", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "AdjustedDate" is used by two different parts of a schema. See: 
     * line 315 of file:/C:/MyWorkspaces/TestWorkspace/JaxbBuilder/schema/FpML%20Schemas/fpml-valuation-4-7.xsd
     * line 313 of file:/C:/MyWorkspaces/TestWorkspace/JaxbBuilder/schema/FpML%20Schemas/fpml-valuation-4-7.xsd
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
     * {@link JAXBElement }{@code <}{@link AssetValuation }{@code >}
     * {@link JAXBElement }{@code <}{@link ValuationReference }{@code >}
     * {@link JAXBElement }{@code <}{@link ScheduledDateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnyAssetReference }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
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
