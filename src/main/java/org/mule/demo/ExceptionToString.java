package org.mule.demo;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;


public class ExceptionToString extends AbstractTransformer {

    public ExceptionToString() {
        super();
        this.registerSourceType(DataTypeFactory.create(Exception.class));
        this.setReturnDataType(DataTypeFactory.STRING);
    }

    @Override
    public Object doTransform(Object src, String outputEncoding) throws TransformerException {
        return ((Exception) src).getMessage();
    }

}
