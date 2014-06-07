//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A notification to inform downstream systems when a system that acts as source of trade information detects that an allocation has been cancelled.
 * 
 * <p>Java class for AllocationCancelled complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationCancelled">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/2009/FpML-4-7}NotificationMessage">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="trade" type="{http://www.fpml.org/2009/FpML-4-7}Trade"/>
 *           &lt;element name="partyTradeIdentifier" type="{http://www.fpml.org/2009/FpML-4-7}PartyTradeIdentifier"/>
 *         &lt;/choice>
 *         &lt;element name="party" type="{http://www.fpml.org/2009/FpML-4-7}Party" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationCancelled", propOrder = {
    "tradeOrPartyTradeIdentifier",
    "party"
})
public class AllocationCancelled
    extends NotificationMessage
{

    @XmlElements({
        @XmlElement(name = "partyTradeIdentifier", type = PartyTradeIdentifier.class),
        @XmlElement(name = "trade", type = Trade.class)
    })
    protected List<Object> tradeOrPartyTradeIdentifier;
    @XmlElement(required = true)
    protected List<Party> party;

    /**
     * Gets the value of the tradeOrPartyTradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeOrPartyTradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeOrPartyTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * {@link Trade }
     * 
     * 
     */
    public List<Object> getTradeOrPartyTradeIdentifier() {
        if (tradeOrPartyTradeIdentifier == null) {
            tradeOrPartyTradeIdentifier = new ArrayList<Object>();
        }
        return this.tradeOrPartyTradeIdentifier;
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