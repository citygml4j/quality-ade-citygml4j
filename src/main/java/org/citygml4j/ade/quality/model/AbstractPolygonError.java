package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public abstract class AbstractPolygonError extends AbstractGeometryError {
    private String polygonId;

    public AbstractPolygonError() {
    }

    public AbstractPolygonError(String polygonId) {
        setPolygonId(polygonId);
    }

    public String getPolygonId() {
        return polygonId;
    }

    public void setPolygonId(String polygonId) {
        this.polygonId = polygonId;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        return target instanceof AbstractPolygonError ?
                ObjectCopier.copyTo(this, (AbstractPolygonError) target, AbstractPolygonError.class, copyBuilder) :
                target;
    }
}
