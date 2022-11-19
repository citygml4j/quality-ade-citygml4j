/*
 * Copyright 2021 Hochschule für Technik Stuttgart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
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
import org.citygml4j.model.gml.geometry.primitives.DirectPosition;

public class SolidNonManifoldVertex extends AbstractSolidError {
    private DirectPosition vertex;

    public SolidNonManifoldVertex() {
    }

    public SolidNonManifoldVertex(String geometryId, DirectPosition vertex) {
        super(geometryId);
        setVertex(vertex);
    }

    public DirectPosition getVertex() {
        return vertex;
    }

    public void setVertex(DirectPosition vertex) {
        this.vertex = ModelObjects.setParent(vertex, this);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_S_NON_MANIFOLD_VERTEX;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SolidNonManifoldVertex copy = target == null ? new SolidNonManifoldVertex() : (SolidNonManifoldVertex) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SolidNonManifoldVertex(), copyBuilder);
    }
}
