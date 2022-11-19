//
// Generated with ade-xjc - XML Schema binding compiler for CityGML ADEs, version 2.10.0
// ade-xjc is part of the citygml4j project, see https://github.com/citygml4j
// Any modifications to this file will be lost upon recompilation of the source
// Generated: Sat Nov 19 09:54:08 CET 2022
//


package de.hft.stuttgart.qualityade._0_1_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RequirementTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RequirementTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="R_GE_R_TOO_FEW_POINTS"/&gt;
 *     &lt;enumeration value="R_GE_R_NOT_CLOSED"/&gt;
 *     &lt;enumeration value="R_GE_R_CONSECUTIVE_POINTS_SAME"/&gt;
 *     &lt;enumeration value="R_GE_R_SELF_INTERSECTION"/&gt;
 *     &lt;enumeration value="R_GE_P_NON_PLANAR"/&gt;
 *     &lt;enumeration value="R_GE_P_INTERIOR_DISCONNECTED"/&gt;
 *     &lt;enumeration value="R_GE_P_INTERSECTING_RINGS"/&gt;
 *     &lt;enumeration value="R_GE_P_HOLE_OUTSIDE"/&gt;
 *     &lt;enumeration value="R_GE_P_ORIENTATION_RINGS_SAME"/&gt;
 *     &lt;enumeration value="R_GE_P_INNER_RINGS_NESTED"/&gt;
 *     &lt;enumeration value="R_GE_S_TOO_FEW_POLYGONS"/&gt;
 *     &lt;enumeration value="R_GE_S_NOT_CLOSED"/&gt;
 *     &lt;enumeration value="R_GE_S_NON_MANIFOLD_EDGE"/&gt;
 *     &lt;enumeration value="R_GE_S_POLYGON_WRONG_ORIENTATION"/&gt;
 *     &lt;enumeration value="R_GE_S_ALL_POLYGONS_WRONG_ORIENTATION"/&gt;
 *     &lt;enumeration value="R_GE_S_NON_MANIFOLD_VERTEX"/&gt;
 *     &lt;enumeration value="R_GE_S_SELF_INTERSECTION"/&gt;
 *     &lt;enumeration value="R_GE_S_MULTIPLE_CONNECTED_COMPONENTS"/&gt;
 *     &lt;enumeration value="R_SE_ATTRIBUTES_EXISTING"/&gt;
 *     &lt;enumeration value="R_SE_ATTRIBUTES_CORRECT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequirementTypeType")
@XmlEnum
public enum RequirementTypeType {

    @XmlEnumValue("R_GE_R_TOO_FEW_POINTS")
    R___GE___R___TOO___FEW___POINTS("R_GE_R_TOO_FEW_POINTS"),
    @XmlEnumValue("R_GE_R_NOT_CLOSED")
    R___GE___R___NOT___CLOSED("R_GE_R_NOT_CLOSED"),
    @XmlEnumValue("R_GE_R_CONSECUTIVE_POINTS_SAME")
    R___GE___R___CONSECUTIVE___POINTS___SAME("R_GE_R_CONSECUTIVE_POINTS_SAME"),
    @XmlEnumValue("R_GE_R_SELF_INTERSECTION")
    R___GE___R___SELF___INTERSECTION("R_GE_R_SELF_INTERSECTION"),
    @XmlEnumValue("R_GE_P_NON_PLANAR")
    R___GE___P___NON___PLANAR("R_GE_P_NON_PLANAR"),
    @XmlEnumValue("R_GE_P_INTERIOR_DISCONNECTED")
    R___GE___P___INTERIOR___DISCONNECTED("R_GE_P_INTERIOR_DISCONNECTED"),
    @XmlEnumValue("R_GE_P_INTERSECTING_RINGS")
    R___GE___P___INTERSECTING___RINGS("R_GE_P_INTERSECTING_RINGS"),
    @XmlEnumValue("R_GE_P_HOLE_OUTSIDE")
    R___GE___P___HOLE___OUTSIDE("R_GE_P_HOLE_OUTSIDE"),
    @XmlEnumValue("R_GE_P_ORIENTATION_RINGS_SAME")
    R___GE___P___ORIENTATION___RINGS___SAME("R_GE_P_ORIENTATION_RINGS_SAME"),
    @XmlEnumValue("R_GE_P_INNER_RINGS_NESTED")
    R___GE___P___INNER___RINGS___NESTED("R_GE_P_INNER_RINGS_NESTED"),
    @XmlEnumValue("R_GE_S_TOO_FEW_POLYGONS")
    R___GE___S___TOO___FEW___POLYGONS("R_GE_S_TOO_FEW_POLYGONS"),
    @XmlEnumValue("R_GE_S_NOT_CLOSED")
    R___GE___S___NOT___CLOSED("R_GE_S_NOT_CLOSED"),
    @XmlEnumValue("R_GE_S_NON_MANIFOLD_EDGE")
    R___GE___S___NON___MANIFOLD___EDGE("R_GE_S_NON_MANIFOLD_EDGE"),
    @XmlEnumValue("R_GE_S_POLYGON_WRONG_ORIENTATION")
    R___GE___S___POLYGON___WRONG___ORIENTATION("R_GE_S_POLYGON_WRONG_ORIENTATION"),
    @XmlEnumValue("R_GE_S_ALL_POLYGONS_WRONG_ORIENTATION")
    R___GE___S___ALL___POLYGONS___WRONG___ORIENTATION("R_GE_S_ALL_POLYGONS_WRONG_ORIENTATION"),
    @XmlEnumValue("R_GE_S_NON_MANIFOLD_VERTEX")
    R___GE___S___NON___MANIFOLD___VERTEX("R_GE_S_NON_MANIFOLD_VERTEX"),
    @XmlEnumValue("R_GE_S_SELF_INTERSECTION")
    R___GE___S___SELF___INTERSECTION("R_GE_S_SELF_INTERSECTION"),
    @XmlEnumValue("R_GE_S_MULTIPLE_CONNECTED_COMPONENTS")
    R___GE___S___MULTIPLE___CONNECTED___COMPONENTS("R_GE_S_MULTIPLE_CONNECTED_COMPONENTS"),
    @XmlEnumValue("R_SE_ATTRIBUTES_EXISTING")
    R___SE___ATTRIBUTES___EXISTING("R_SE_ATTRIBUTES_EXISTING"),
    @XmlEnumValue("R_SE_ATTRIBUTES_CORRECT")
    R___SE___ATTRIBUTES___CORRECT("R_SE_ATTRIBUTES_CORRECT");
    private final String value;

    RequirementTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequirementTypeType fromValue(String v) {
        for (RequirementTypeType c: RequirementTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
