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
 * <p>Java-Klasse für GE_S_NOT_CLOSEDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_S_NOT_CLOSEDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractSolidErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="edges" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}EdgeListPropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_S_NOT_CLOSEDType", propOrder = {
    "edges"
})
public class SolidNotClosedType
    extends AbstractSolidErrorType
{

    @XmlElement(required = true)
    protected EdgeListPropertyType edges;

    /**
     * Ruft den Wert der edges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EdgeListPropertyType }
     *     
     */
    public EdgeListPropertyType getEdges() {
        return edges;
    }

    /**
     * Legt den Wert der edges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgeListPropertyType }
     *     
     */
    public void setEdges(EdgeListPropertyType value) {
        this.edges = value;
    }

    public boolean isSetEdges() {
        return (this.edges!= null);
    }

}
