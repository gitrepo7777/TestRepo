//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the market sector in which the trade has been arranged.
 * 
 * <p>Java class for BrokerConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrokerConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brokerConfirmationType" type="{http://www.fpml.org/2009/FpML-4-7}BrokerConfirmationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrokerConfirmation", propOrder = {
    "brokerConfirmationType"
})
public class BrokerConfirmation {

    @XmlElement(required = true)
    protected BrokerConfirmationType brokerConfirmationType;

    /**
     * Gets the value of the brokerConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public BrokerConfirmationType getBrokerConfirmationType() {
        return brokerConfirmationType;
    }

    /**
     * Sets the value of the brokerConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerConfirmationType }
     *     
     */
    public void setBrokerConfirmationType(BrokerConfirmationType value) {
        this.brokerConfirmationType = value;
    }

}
