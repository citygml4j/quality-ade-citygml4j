package org.citygml4j.ade.quality.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.builder.copy.ObjectCopier;

public class Error extends AbstractDataType {
    private int occurrences;
    private ErrorType name;

    public Error() {
    }

    public Error(int occurrences, ErrorType name) {
        setOccurrences(occurrences);
        setName(name);
    }

    public int getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(int occurrences) {
        this.occurrences = occurrences;
    }

    public ErrorType getName() {
        return name;
    }

    public void setName(ErrorType name) {
        this.name = name;
    }

    @Override
    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        Error copy = target == null ? new Error() : (Error) target;
        return ObjectCopier.copyTo(this, copy, copyBuilder);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new Error(), copyBuilder);
    }
}
