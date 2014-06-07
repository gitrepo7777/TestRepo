//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:58 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a hub or other reference for a physically settled commodity trade.
 * 
 * <p>Java class for CommodityHub complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityHub">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyReference" type="{http://www.fpml.org/2009/FpML-4-7}PartyOrAccountReference"/>
 *         &lt;element name="hubCode" type="{http://www.fpml.org/2009/FpML-4-7}CommodityHubCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityHub", propOrder = {
    "partyReference",
    "hubCode"
})
public class CommodityHub {

    @XmlElement(required = true)
    protected PartyOrAccountReference partyReference;
    @XmlElement(required = true)
    protected CommodityHubCode hubCode;

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public PartyOrAccountReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrAccountReference }
     *     
     */
    public void setPartyReference(PartyOrAccountReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the hubCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityHubCode }
     *     
     */
    public CommodityHubCode getHubCode() {
        return hubCode;
    }

    /**
     * Sets the value of the hubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityHubCode }
     *     
     */
    public void setHubCode(CommodityHubCode value) {
        this.hubCode = value;
    }

}
