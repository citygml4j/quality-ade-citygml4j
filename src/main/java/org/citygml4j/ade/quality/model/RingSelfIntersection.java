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

public class RingSelfIntersection extends AbstractRingError {
    private Edge edge1;
    private Edge edge2;
    private DirectPosition vertex1;
    private DirectPosition vertex2;
    private RingSelfIntersectionType type;

    public RingSelfIntersection() {
    }

    public RingSelfIntersection(String linearRingId, RingSelfIntersectionType type) {
        super(linearRingId);
        setType(type);
    }

    public Edge getEdge1() {
        return edge1;
    }

    public void setEdge1(Edge edge1) {
        this.edge1 = ModelObjects.setParent(edge1, this);
    }

    public Edge getEdge2() {
        return edge2;
    }

    public void setEdge2(Edge edge2) {
        this.edge2 = ModelObjects.setParent(edge2, this);
    }

    public DirectPosition getVertex1() {
        return vertex1;
    }

    public void setVertex1(DirectPosition vertex1) {
        this.vertex1 = ModelObjects.setParent(vertex1, this);
    }

    public DirectPosition getVertex2() {
        return vertex2;
    }

    public void setVertex2(DirectPosition vertex2) {
        this.vertex2 = ModelObjects.setParent(vertex2, this);
    }

    public RingSelfIntersectionType getType() {
        return type;
    }

    public void setType(RingSelfIntersectionType type) {
        this.type = type;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_R_SELF_INTERSECTION;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        RingSelfIntersection copy = target == null ? new RingSelfIntersection() : (RingSelfIntersection) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new RingSelfIntersection(), copyBuilder);
    }
}
