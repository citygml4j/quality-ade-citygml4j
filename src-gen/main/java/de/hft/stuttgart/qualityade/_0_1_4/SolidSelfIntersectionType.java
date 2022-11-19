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
 * <p>Java-Klasse für GE_S_SELF_INTERSECTIONType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_S_SELF_INTERSECTIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractSolidErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="polygonId1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="polygonId2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_S_SELF_INTERSECTIONType", propOrder = {
    "polygonId1",
    "polygonId2"
})
public class SolidSelfIntersectionType
    extends AbstractSolidErrorType
{

    @XmlElement(required = true)
    protected String polygonId1;
    @XmlElement(required = true)
    protected String polygonId2;

    /**
     * Ruft den Wert der polygonId1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolygonId1() {
        return polygonId1;
    }

    /**
     * Legt den Wert der polygonId1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolygonId1(String value) {
        this.polygonId1 = value;
    }

    public boolean isSetPolygonId1() {
        return (this.polygonId1 != null);
    }

    /**
     * Ruft den Wert der polygonId2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolygonId2() {
        return polygonId2;
    }

    /**
     * Legt den Wert der polygonId2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolygonId2(String value) {
        this.polygonId2 = value;
    }

    public boolean isSetPolygonId2() {
        return (this.polygonId2 != null);
    }

}
