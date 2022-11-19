package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public abstract class AbstractRingError extends AbstractGeometryError {
    private String linearRingId;

    public AbstractRingError() {
    }

    public AbstractRingError(String linearRingId) {
        setLinearRingId(linearRingId);
    }

    public String getLinearRingId() {
        return linearRingId;
    }

    public void setLinearRingId(String linearRingId) {
        this.linearRingId = linearRingId;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        return target instanceof AbstractRingError ?
                ObjectCopier.copyTo(this, (AbstractRingError) target, AbstractRingError.class, copyBuilder) :
                target;
    }
}
