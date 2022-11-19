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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PolygonIdListPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PolygonIdListPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}PolygonIdList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolygonIdListPropertyType", propOrder = {
    "polygonIdList"
})
public class PolygonIdListPropertyType {

    @XmlElement(name = "PolygonIdList", required = true)
    protected PolygonIdListType polygonIdList;

    /**
     * Ruft den Wert der polygonIdList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolygonIdListType }
     *     
     */
    public PolygonIdListType getPolygonIdList() {
        return polygonIdList;
    }

    /**
     * Legt den Wert der polygonIdList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonIdListType }
     *     
     */
    public void setPolygonIdList(PolygonIdListType value) {
        this.polygonIdList = value;
    }

    public boolean isSetPolygonIdList() {
        return (this.polygonIdList!= null);
    }

}
