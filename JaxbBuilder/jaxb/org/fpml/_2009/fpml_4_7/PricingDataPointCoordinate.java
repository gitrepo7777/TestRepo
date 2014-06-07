//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:11 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A set of index values that identify a pricing data point. For example: (strike = 17%, expiration = 6M, term = 1Y.
 * 
 * <p>Java class for PricingDataPointCoordinate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingDataPointCoordinate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/2009/FpML-4-7}PricingStructureIndex.model" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingDataPointCoordinate", propOrder = {
    "pricingStructureIndexModel"
})
public class PricingDataPointCoordinate {

    @XmlElementRefs({
        @XmlElementRef(name = "generic", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "strike", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "expiration", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class),
        @XmlElementRef(name = "term", namespace = "http://www.fpml.org/2009/FpML-4-7", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> pricingStructureIndexModel;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the pricingStructureIndexModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingStructureIndexModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingStructureIndexModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link GenericDimension }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeDimension }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeDimension }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPricingStructureIndexModel() {
        if (pricingStructureIndexModel == null) {
            pricingStructureIndexModel = new ArrayList<JAXBElement<?>>();
        }
        return this.pricingStructureIndexModel;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
