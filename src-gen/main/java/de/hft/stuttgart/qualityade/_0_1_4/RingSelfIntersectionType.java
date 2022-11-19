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
import net.opengis.gml.DirectPositionType;


/**
 * <p>Java-Klasse für GE_R_SELF_INTERSECTIONType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_R_SELF_INTERSECTIONType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractRingErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="edge1" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}EdgePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="edge2" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}EdgePropertyType" minOccurs="0"/&gt;
 *         &lt;element name="vertex1" type="{http://www.opengis.net/gml}DirectPositionType" minOccurs="0"/&gt;
 *         &lt;element name="vertex2" type="{http://www.opengis.net/gml}DirectPositionType" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}RingSelfIntersectionTypeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_R_SELF_INTERSECTIONType", propOrder = {
    "edge1",
    "edge2",
    "vertex1",
    "vertex2",
    "type"
})
public class RingSelfIntersectionType
    extends AbstractRingErrorType
{

    protected EdgePropertyType edge1;
    protected EdgePropertyType edge2;
    protected DirectPositionType vertex1;
    protected DirectPositionType vertex2;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RingSelfIntersectionTypeType type;

    /**
     * Ruft den Wert der edge1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EdgePropertyType }
     *     
     */
    public EdgePropertyType getEdge1() {
        return edge1;
    }

    /**
     * Legt den Wert der edge1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgePropertyType }
     *     
     */
    public void setEdge1(EdgePropertyType value) {
        this.edge1 = value;
    }

    public boolean isSetEdge1() {
        return (this.edge1 != null);
    }

    /**
     * Ruft den Wert der edge2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EdgePropertyType }
     *     
     */
    public EdgePropertyType getEdge2() {
        return edge2;
    }

    /**
     * Legt den Wert der edge2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgePropertyType }
     *     
     */
    public void setEdge2(EdgePropertyType value) {
        this.edge2 = value;
    }

    public boolean isSetEdge2() {
        return (this.edge2 != null);
    }

    /**
     * Ruft den Wert der vertex1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getVertex1() {
        return vertex1;
    }

    /**
     * Legt den Wert der vertex1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setVertex1(DirectPositionType value) {
        this.vertex1 = value;
    }

    public boolean isSetVertex1() {
        return (this.vertex1 != null);
    }

    /**
     * Ruft den Wert der vertex2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getVertex2() {
        return vertex2;
    }

    /**
     * Legt den Wert der vertex2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setVertex2(DirectPositionType value) {
        this.vertex2 = value;
    }

    public boolean isSetVertex2() {
        return (this.vertex2 != null);
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RingSelfIntersectionTypeType }
     *     
     */
    public RingSelfIntersectionTypeType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RingSelfIntersectionTypeType }
     *     
     */
    public void setType(RingSelfIntersectionTypeType value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

}
