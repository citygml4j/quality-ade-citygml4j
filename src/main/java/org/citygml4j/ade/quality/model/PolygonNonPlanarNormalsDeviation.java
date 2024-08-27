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

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.measures.Angle;

public class PolygonNonPlanarNormalsDeviation extends AbstractPolygonError {
    private Angle deviation;

    public PolygonNonPlanarNormalsDeviation() {
    }

    public PolygonNonPlanarNormalsDeviation(String polygonId, Angle deviation) {
        super(polygonId);
        setDeviation(deviation);
    }

    public Angle getDeviation() {
        return deviation;
    }

    public void setDeviation(Angle deviation) {
        this.deviation = ModelObjects.setParent(deviation, this);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_P_NON_PLANAR_POLYGON_NORMALS_DEVIATION;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        PolygonNonPlanarNormalsDeviation copy = target == null ?
                new PolygonNonPlanarNormalsDeviation() :
                (PolygonNonPlanarNormalsDeviation) target;

        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new PolygonNonPlanarNormalsDeviation(), copyBuilder);
    }
}
