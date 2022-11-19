//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StatisticsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StatisticsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numErrorBuildings" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}FeatureStatisticsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="numErrorVegetation" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}FeatureStatisticsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="numErrorLandObjects" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}FeatureStatisticsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="numErrorBridgeObjects" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}FeatureStatisticsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="numErrorWaterObjects" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}FeatureStatisticsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="numErrorTransportation" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}FeatureStatisticsPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}ErrorPropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsType", propOrder = {
    "numErrorBuildings",
    "numErrorVegetation",
    "numErrorLandObjects",
    "numErrorBridgeObjects",
    "numErrorWaterObjects",
    "numErrorTransportation",
    "error"
})
public class StatisticsType {

    protected FeatureStatisticsPropertyType numErrorBuildings;
    protected FeatureStatisticsPropertyType numErrorVegetation;
    protected FeatureStatisticsPropertyType numErrorLandObjects;
    protected FeatureStatisticsPropertyType numErrorBridgeObjects;
    protected FeatureStatisticsPropertyType numErrorWaterObjects;
    protected FeatureStatisticsPropertyType numErrorTransportation;
    protected List<ErrorPropertyType> error;

    /**
     * Ruft den Wert der numErrorBuildings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public FeatureStatisticsPropertyType getNumErrorBuildings() {
        return numErrorBuildings;
    }

    /**
     * Legt den Wert der numErrorBuildings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public void setNumErrorBuildings(FeatureStatisticsPropertyType value) {
        this.numErrorBuildings = value;
    }

    public boolean isSetNumErrorBuildings() {
        return (this.numErrorBuildings!= null);
    }

    /**
     * Ruft den Wert der numErrorVegetation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public FeatureStatisticsPropertyType getNumErrorVegetation() {
        return numErrorVegetation;
    }

    /**
     * Legt den Wert der numErrorVegetation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public void setNumErrorVegetation(FeatureStatisticsPropertyType value) {
        this.numErrorVegetation = value;
    }

    public boolean isSetNumErrorVegetation() {
        return (this.numErrorVegetation!= null);
    }

    /**
     * Ruft den Wert der numErrorLandObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public FeatureStatisticsPropertyType getNumErrorLandObjects() {
        return numErrorLandObjects;
    }

    /**
     * Legt den Wert der numErrorLandObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public void setNumErrorLandObjects(FeatureStatisticsPropertyType value) {
        this.numErrorLandObjects = value;
    }

    public boolean isSetNumErrorLandObjects() {
        return (this.numErrorLandObjects!= null);
    }

    /**
     * Ruft den Wert der numErrorBridgeObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public FeatureStatisticsPropertyType getNumErrorBridgeObjects() {
        return numErrorBridgeObjects;
    }

    /**
     * Legt den Wert der numErrorBridgeObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public void setNumErrorBridgeObjects(FeatureStatisticsPropertyType value) {
        this.numErrorBridgeObjects = value;
    }

    public boolean isSetNumErrorBridgeObjects() {
        return (this.numErrorBridgeObjects!= null);
    }

    /**
     * Ruft den Wert der numErrorWaterObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public FeatureStatisticsPropertyType getNumErrorWaterObjects() {
        return numErrorWaterObjects;
    }

    /**
     * Legt den Wert der numErrorWaterObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public void setNumErrorWaterObjects(FeatureStatisticsPropertyType value) {
        this.numErrorWaterObjects = value;
    }

    public boolean isSetNumErrorWaterObjects() {
        return (this.numErrorWaterObjects!= null);
    }

    /**
     * Ruft den Wert der numErrorTransportation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public FeatureStatisticsPropertyType getNumErrorTransportation() {
        return numErrorTransportation;
    }

    /**
     * Legt den Wert der numErrorTransportation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureStatisticsPropertyType }
     *     
     */
    public void setNumErrorTransportation(FeatureStatisticsPropertyType value) {
        this.numErrorTransportation = value;
    }

    public boolean isSetNumErrorTransportation() {
        return (this.numErrorTransportation!= null);
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorPropertyType }
     * 
     * 
     */
    public List<ErrorPropertyType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorPropertyType>();
        }
        return this.error;
    }

    public boolean isSetError() {
        return ((this.error!= null)&&(!this.error.isEmpty()));
    }

    public void unsetError() {
        this.error = null;
    }

}
