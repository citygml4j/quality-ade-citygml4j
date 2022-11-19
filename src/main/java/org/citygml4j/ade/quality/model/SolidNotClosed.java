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
import org.citygml4j.model.common.child.ChildList;

import java.util.List;

public class SolidNotClosed extends AbstractSolidError {
    private List<Edge> edges;

    public SolidNotClosed() {
    }

    public SolidNotClosed(String geometryId, List<Edge> edges) {
        super(geometryId);
        setEdges(edges);
    }

    public boolean isSetEdges() {
        return edges != null && !edges.isEmpty();
    }

    public List<Edge> getEdges() {
        if (edges == null) {
            edges = new ChildList<>(this);
        }

        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = ModelObjects.setParent(edges, this);
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.GE_S_NOT_CLOSED;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        SolidNotClosed copy = target == null ? new SolidNotClosed() : (SolidNotClosed) target;
        super.copyTo(copy, copyBuilder);
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new SolidNotClosed(), copyBuilder);
    }
}
