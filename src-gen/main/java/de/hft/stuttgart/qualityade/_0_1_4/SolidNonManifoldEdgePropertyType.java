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
 * <p>Java-Klasse für GE_S_NON_MANIFOLD_EDGEPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_S_NON_MANIFOLD_EDGEPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_S_NON_MANIFOLD_EDGE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_S_NON_MANIFOLD_EDGEPropertyType", propOrder = {
    "ge_S_NON_MANIFOLD_EDGE"
})
public class SolidNonManifoldEdgePropertyType {

    @XmlElement(name = "GE_S_NON_MANIFOLD_EDGE", required = true)
    protected SolidNonManifoldEdgeType ge_S_NON_MANIFOLD_EDGE;

    /**
     * Ruft den Wert der ge_S_NON_MANIFOLD_EDGE-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SolidNonManifoldEdgeType }
     *     
     */
    public SolidNonManifoldEdgeType getGE_S_NON_MANIFOLD_EDGE() {
        return ge_S_NON_MANIFOLD_EDGE;
    }

    /**
     * Legt den Wert der ge_S_NON_MANIFOLD_EDGE-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidNonManifoldEdgeType }
     *     
     */
    public void setGE_S_NON_MANIFOLD_EDGE(SolidNonManifoldEdgeType value) {
        this.ge_S_NON_MANIFOLD_EDGE = value;
    }

    public boolean isSetGE_S_NON_MANIFOLD_EDGE() {
        return (this.ge_S_NON_MANIFOLD_EDGE!= null);
    }

}
