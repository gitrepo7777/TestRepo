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
 * <p>Java class for ShareExtraordinaryEventEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShareExtraordinaryEventEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AlternativeObligation"/>
 *     &lt;enumeration value="CancellationAndPayment"/>
 *     &lt;enumeration value="OptionsExchange"/>
 *     &lt;enumeration value="CalculationAgent"/>
 *     &lt;enumeration value="ModifiedCalculationAgent"/>
 *     &lt;enumeration value="PartialCancellationAndPayment"/>
 *     &lt;enumeration value="Component"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShareExtraordinaryEventEnum")
@XmlEnum
public enum ShareExtraordinaryEventEnum {


    /**
     * The trade continues such that the underlying now consists of the New Shares and/or the Other Consideration, if any, and the proceeds of any redemption, if any, that the holder of the underlying Shares would have been entitled to.
     * 
     */
    @XmlEnumValue("AlternativeObligation")
    ALTERNATIVE_OBLIGATION("AlternativeObligation"),

    /**
     * The trade is cancelled and a cancellation fee will be paid by one party to the other.
     * 
     */
    @XmlEnumValue("CancellationAndPayment")
    CANCELLATION_AND_PAYMENT("CancellationAndPayment"),

    /**
     * The trade will be adjusted by the Calculation Agent in accordance with the adjustments made by any exchange on which options on the underlying are listed.
     * 
     */
    @XmlEnumValue("OptionsExchange")
    OPTIONS_EXCHANGE("OptionsExchange"),

    /**
     * The Calculation Agent will determine what adjustment is required to offset any change to the economics of the trade. If the Calculation Agent cannot achieve this, the trade goes to Cancellation and Payment with the Calculation Agent deciding on the value of the cancellation fee. Adjustments may not be made to account solely for changes in volatility, expected dividends, stock loan rate or liquidity.
     * 
     */
    @XmlEnumValue("CalculationAgent")
    CALCULATION_AGENT("CalculationAgent"),

    /**
     * The Calculation Agent will determine what adjustment is required to offset any change to the economics of the trade. If the Calculation Agent cannot achieve this, the trade goes to Cancellation and Payment with the Calculation Agent deciding on the value of the cancellation fee. Adjustments to account for changes in volatility, expected dividends, stock loan rate or liquidity are allowed.
     * 
     */
    @XmlEnumValue("ModifiedCalculationAgent")
    MODIFIED_CALCULATION_AGENT("ModifiedCalculationAgent"),

    /**
     * Applies to Basket Transactions. The portion of the Basket made up by the affected Share will be cancelled and a cancellation fee will be paid from one party to the other. The remainder of the trade continues.
     * 
     */
    @XmlEnumValue("PartialCancellationAndPayment")
    PARTIAL_CANCELLATION_AND_PAYMENT("PartialCancellationAndPayment"),

    /**
     * If this is a Share-for-Combined merger event (Shares are replaced with New Shares and Other Consideration), then different treatment can be applied to each component if the parties have specified this.
     * 
     */
    @XmlEnumValue("Component")
    COMPONENT("Component");
    private final String value;

    ShareExtraordinaryEventEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShareExtraordinaryEventEnum fromValue(String v) {
        for (ShareExtraordinaryEventEnum c: ShareExtraordinaryEventEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
