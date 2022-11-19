//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FeatureStatisticsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureStatisticsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numChecked" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="numErrors" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureStatisticsType", propOrder = {
    "numChecked",
    "numErrors"
})
public class FeatureStatisticsType {

    @XmlElement(required = true)
    protected BigInteger numChecked;
    @XmlElement(required = true)
    protected BigInteger numErrors;

    /**
     * Ruft den Wert der numChecked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumChecked() {
        return numChecked;
    }

    /**
     * Legt den Wert der numChecked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumChecked(BigInteger value) {
        this.numChecked = value;
    }

    public boolean isSetNumChecked() {
        return (this.numChecked!= null);
    }

    /**
     * Ruft den Wert der numErrors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumErrors() {
        return numErrors;
    }

    /**
     * Legt den Wert der numErrors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumErrors(BigInteger value) {
        this.numErrors = value;
    }

    public boolean isSetNumErrors() {
        return (this.numErrors!= null);
    }

}
