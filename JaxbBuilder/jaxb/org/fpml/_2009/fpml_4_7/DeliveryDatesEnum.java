//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 08:55:21 PM EDT 
//


package org.fpml._2009.fpml_4_7;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryDatesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryDatesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CalculationPeriod"/>
 *     &lt;enumeration value="FirstNearby"/>
 *     &lt;enumeration value="SecondNearby"/>
 *     &lt;enumeration value="ThirdNearby"/>
 *     &lt;enumeration value="SixthNearby"/>
 *     &lt;enumeration value="TwelfthNearby"/>
 *     &lt;enumeration value="Spot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryDatesEnum")
@XmlEnum
public enum DeliveryDatesEnum {


    /**
     * The Delivery Date of the underlying Commodity shall be the month of expiration of the futures contract that corresponds to the month and year of the Calculation Period. e.g. The JAN 09 contract when pricing in January '09 (In the case of contracts like Brent crude, this will mean that the contract expired in DEC 08.)
     * 
     */
    @XmlEnumValue("CalculationPeriod")
    CALCULATION_PERIOD("CalculationPeriod"),

    /**
     * The Delivery Date of the underlying Commodity shall be the month of expiration of the First Nearby Month futures contract.
     * 
     */
    @XmlEnumValue("FirstNearby")
    FIRST_NEARBY("FirstNearby"),

    /**
     * The Delivery Date of the underlying Commodity shall be the month of expiration of the Second Nearby Month futures contract.
     * 
     */
    @XmlEnumValue("SecondNearby")
    SECOND_NEARBY("SecondNearby"),

    /**
     * The Delivery Date of the underlying Commodity shall be the month of expiration of the Third Nearby Month futures contract.
     * 
     */
    @XmlEnumValue("ThirdNearby")
    THIRD_NEARBY("ThirdNearby"),

    /**
     * The Delivery Date of the underlying Commodity shall be the month of expiration of the Sixth Nearby Month futures contract.
     * 
     */
    @XmlEnumValue("SixthNearby")
    SIXTH_NEARBY("SixthNearby"),

    /**
     * The Delivery Date of the underlying Commodity shall be the month of expiration of the Twelfth Nearby Month futures contract.
     * 
     */
    @XmlEnumValue("TwelfthNearby")
    TWELFTH_NEARBY("TwelfthNearby"),

    /**
     * The Delivery Date of the underlying Commodity shall be the spot date.
     * 
     */
    @XmlEnumValue("Spot")
    SPOT("Spot");
    private final String value;

    DeliveryDatesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryDatesEnum fromValue(String v) {
        for (DeliveryDatesEnum c: DeliveryDatesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
