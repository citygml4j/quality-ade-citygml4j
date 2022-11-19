package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;
import org.citygml4j.model.common.base.ModelObjects;
import org.citygml4j.model.gml.geometry.primitives.DirectPosition;

public class Edge extends AbstractDataType {
    private DirectPosition from;
    private DirectPosition to;

    public Edge() {
    }

    public Edge(DirectPosition from, DirectPosition to) {
        setFrom(from);
        setTo(to);
    }

    public DirectPosition getFrom() {
        return from;
    }

    public void setFrom(DirectPosition from) {
        this.from = ModelObjects.setParent(from, this);
    }

    public DirectPosition getTo() {
        return to;
    }

    public void setTo(DirectPosition to) {
        this.to = ModelObjects.setParent(to, this);
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Edge copy = target == null ? new Edge() : (Edge) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Edge(), copyBuilder);
    }
}
