//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:54:53 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the content model for a message generated when a party confirms that a trade is affirmed.
 * 
 * <p>Java class for TradeAffirmed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeAffirmed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}ResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="tradeIdentifier" type="{http://www.fpml.org/2009/FpML-4-7}TradeIdentifier" maxOccurs="unbounded"/>
 *         &lt;element name="party" type="{http://www.fpml.org/2009/FpML-4-7}Party" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAffirmed", propOrder = {
    "tradeIdentifier",
    "party"
})
public class TradeAffirmed
    extends ResponseMessage
{

    @XmlElement(required = true)
    protected List<TradeIdentifier> tradeIdentifier;
    @XmlElement(required = true)
    protected List<Party> party;

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<TradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
