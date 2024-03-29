
package clientTC;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for c2fResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="c2fResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c2fResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "c2fResponse", propOrder = {
    "c2FResult"
})
public class C2FResponse {

    @XmlElement(name = "c2fResult")
    protected double c2FResult;

    /**
     * Gets the value of the c2FResult property.
     * 
     */
    public double getC2FResult() {
        return c2FResult;
    }

    /**
     * Sets the value of the c2FResult property.
     * 
     */
    public void setC2FResult(double value) {
        this.c2FResult = value;
    }

}
