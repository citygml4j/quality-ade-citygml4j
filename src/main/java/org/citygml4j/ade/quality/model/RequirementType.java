/*
 * quality-ade-citygml4j - Quality ADE module for citygml4j
 * https://github.com/citygml4j/quality-ade-citygml4j
 *
 * quality-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2019-2024 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml4j.ade.quality.model;

import java.util.Locale;

public enum RequirementType {
    R_GE_R_TOO_FEW_POINTS,
    R_GE_R_NOT_CLOSED,
    R_GE_R_CONSECUTIVE_POINTS_SAME,
    R_GE_R_SELF_INTERSECTION,
    R_GE_P_NON_PLANAR,
    R_GE_P_INTERIOR_DISCONNECTED,
    R_GE_P_INTERSECTING_RINGS,
    R_GE_P_HOLE_OUTSIDE,
    R_GE_P_ORIENTATION_RINGS_SAME,
    R_GE_P_INNER_RINGS_NESTED,
    R_GE_S_TOO_FEW_POLYGONS,
    R_GE_S_NOT_CLOSED,
    R_GE_S_NON_MANIFOLD_EDGE,
    R_GE_S_POLYGON_WRONG_ORIENTATION,
    R_GE_S_ALL_POLYGONS_WRONG_ORIENTATION,
    R_GE_S_NON_MANIFOLD_VERTEX,
    R_GE_S_SELF_INTERSECTION,
    R_GE_S_MULTIPLE_CONNECTED_COMPONENTS,
    R_SE_ATTRIBUTES_EXISTING,
    R_SE_ATTRIBUTES_CORRECT;

    public static RequirementType fromValue(String value) {
        if (value != null) {
            for (RequirementType constant : RequirementType.values()) {
                if (constant.name().toLowerCase(Locale.ROOT).equals(value.toLowerCase(Locale.ROOT))) {
                    return constant;
                }
            }
        }

        return null;
    }
}
