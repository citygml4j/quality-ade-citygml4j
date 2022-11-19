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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GE_S_MULTIPLE_CONNECTED_COMPONENTSType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GE_S_MULTIPLE_CONNECTED_COMPONENTSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}AbstractSolidErrorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="component" type="{https://transfer.hft-stuttgart.de/pages/citydoctor/qualityade/0.1.4}PolygonIdListPropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GE_S_MULTIPLE_CONNECTED_COMPONENTSType", propOrder = {
    "component"
})
public class SolidMultipleConnectedComponentsType
    extends AbstractSolidErrorType
{

    @XmlElement(required = true)
    protected List<PolygonIdListPropertyType> component;

    /**
     * Gets the value of the component property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolygonIdListPropertyType }
     * 
     * 
     */
    public List<PolygonIdListPropertyType> getComponent() {
        if (component == null) {
            component = new ArrayList<PolygonIdListPropertyType>();
        }
        return this.component;
    }

    public boolean isSetComponent() {
        return ((this.component!= null)&&(!this.component.isEmpty()));
    }

    public void unsetComponent() {
        this.component = null;
    }

}
