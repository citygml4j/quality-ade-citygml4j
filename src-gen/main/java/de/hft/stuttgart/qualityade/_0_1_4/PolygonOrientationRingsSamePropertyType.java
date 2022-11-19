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
 * <p>Java-Klasse für GE_P_ORIENTATION_RINGS_SAMEPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_P_ORIENTATION_RINGS_SAMEPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}GE_P_ORIENTATION_RINGS_SAME"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_P_ORIENTATION_RINGS_SAMEPropertyType", propOrder = {
    "ge_P_ORIENTATION_RINGS_SAME"
})
public class PolygonOrientationRingsSamePropertyType {

    @XmlElement(name = "GE_P_ORIENTATION_RINGS_SAME", required = true)
    protected PolygonOrientationRingsSameType ge_P_ORIENTATION_RINGS_SAME;

    /**
     * Ruft den Wert der ge_P_ORIENTATION_RINGS_SAME-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolygonOrientationRingsSameType }
     *     
     */
    public PolygonOrientationRingsSameType getGE_P_ORIENTATION_RINGS_SAME() {
        return ge_P_ORIENTATION_RINGS_SAME;
    }

    /**
     * Legt den Wert der ge_P_ORIENTATION_RINGS_SAME-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolygonOrientationRingsSameType }
     *     
     */
    public void setGE_P_ORIENTATION_RINGS_SAME(PolygonOrientationRingsSameType value) {
        this.ge_P_ORIENTATION_RINGS_SAME = value;
    }

    public boolean isSetGE_P_ORIENTATION_RINGS_SAME() {
        return (this.ge_P_ORIENTATION_RINGS_SAME!= null);
    }

}
