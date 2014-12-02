package org.mule.demo;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

public class StringToNameString extends AbstractTransformer {

    public StringToNameString() {
        super();
        this.registerSourceType(DataTypeFactory.STRING);
        this.setReturnDataType(DataTypeFactory.create(NameString.class));
    }

    @Override
    public Object doTransform(Object src, String encoding) throws TransformerException {
        return new NameString((String) src);
    }

}
