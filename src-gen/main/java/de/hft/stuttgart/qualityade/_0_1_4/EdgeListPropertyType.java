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
 * <p>Java-Klasse für EdgeListPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EdgeListPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}EdgeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdgeListPropertyType", propOrder = {
    "edgeList"
})
public class EdgeListPropertyType {

    @XmlElement(name = "EdgeList", required = true)
    protected EdgeListType edgeList;

    /**
     * Ruft den Wert der edgeList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EdgeListType }
     *     
     */
    public EdgeListType getEdgeList() {
        return edgeList;
    }

    /**
     * Legt den Wert der edgeList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgeListType }
     *     
     */
    public void setEdgeList(EdgeListType value) {
        this.edgeList = value;
    }

    public boolean isSetEdgeList() {
        return (this.edgeList!= null);
    }

}
