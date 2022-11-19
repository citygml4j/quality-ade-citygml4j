package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public abstract class AbstractSolidError extends AbstractGeometryError {
    private String geometryId;

    public AbstractSolidError() {
    }

    public AbstractSolidError(String geometryId) {
        setGeometryId(geometryId);
    }

    public String getGeometryId() {
        return geometryId;
    }

    public void setGeometryId(String geometryId) {
        this.geometryId = geometryId;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        return target instanceof AbstractSolidError ?
                ObjectCopier.copyTo(this, (AbstractSolidError) target, AbstractSolidError.class, copyBuilder) :
                target;
    }
}
