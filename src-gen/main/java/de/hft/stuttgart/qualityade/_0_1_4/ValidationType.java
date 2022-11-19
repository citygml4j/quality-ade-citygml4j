//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import net.opengis.gml.AbstractFeatureType;


/**
 * <p>Java-Klasse für ValidationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="validationSoftware" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statistics" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}StatisticsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="validationPlan" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}ValidationPlanPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationType", propOrder = {
    "validationDate",
    "validationSoftware",
    "statistics",
    "validationPlan"
})
public class ValidationType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validationDate;
    @XmlElement(required = true)
    protected String validationSoftware;
    protected StatisticsPropertyType statistics;
    @XmlElement(required = true)
    protected ValidationPlanPropertyType validationPlan;

    /**
     * Ruft den Wert der validationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidationDate() {
        return validationDate;
    }

    /**
     * Legt den Wert der validationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidationDate(XMLGregorianCalendar value) {
        this.validationDate = value;
    }

    public boolean isSetValidationDate() {
        return (this.validationDate!= null);
    }

    /**
     * Ruft den Wert der validationSoftware-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationSoftware() {
        return validationSoftware;
    }

    /**
     * Legt den Wert der validationSoftware-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationSoftware(String value) {
        this.validationSoftware = value;
    }

    public boolean isSetValidationSoftware() {
        return (this.validationSoftware!= null);
    }

    /**
     * Ruft den Wert der statistics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsPropertyType }
     *     
     */
    public StatisticsPropertyType getStatistics() {
        return statistics;
    }

    /**
     * Legt den Wert der statistics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsPropertyType }
     *     
     */
    public void setStatistics(StatisticsPropertyType value) {
        this.statistics = value;
    }

    public boolean isSetStatistics() {
        return (this.statistics!= null);
    }

    /**
     * Ruft den Wert der validationPlan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidationPlanPropertyType }
     *     
     */
    public ValidationPlanPropertyType getValidationPlan() {
        return validationPlan;
    }

    /**
     * Legt den Wert der validationPlan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationPlanPropertyType }
     *     
     */
    public void setValidationPlan(ValidationPlanPropertyType value) {
        this.validationPlan = value;
    }

    public boolean isSetValidationPlan() {
        return (this.validationPlan!= null);
    }

}
