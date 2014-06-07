//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * CDS Basket Reference Information
 * 
 * <p>Java class for BasketReferenceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketReferenceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}BasketIdentifier.model" minOccurs="0"/>
 *         &lt;element name="referencePool" type="{http://www.fpml.org/2009/FpML-4-7}ReferencePool"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="nthToDefault" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *             &lt;element name="mthToDefault" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="tranche" type="{http://www.fpml.org/2009/FpML-4-7}Tranche"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketReferenceInformation", propOrder = {
    "content"
})
public class BasketReferenceInformation {

    @XmlElementRefs({
        @XmlElementRef(name = "basketId", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "basketName", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "nthToDefault", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "mthToDefault", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "tranche", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "referencePool", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "BasketId" is used by two different parts of a schema. See: 
     * line 1115 of file:/C:/MyWorkspaces/TestWorkspace/JaxbBuilder/schema/FpML%20Schemas/fpml-asset-4-7.xsd
     * line 1108 of file:/C:/MyWorkspaces/TestWorkspace/JaxbBuilder/schema/FpML%20Schemas/fpml-asset-4-7.xsd
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
     * {@link JAXBElement }{@code <}{@link BasketName }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BasketId }{@code >}
     * {@link JAXBElement }{@code <}{@link Tranche }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferencePool }{@code >}
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
