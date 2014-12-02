package org.mule.demo;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

public class StdinToNameString extends AbstractTransformer {
    public StdinToNameString() {
        super();
        this.registerSourceType(DataTypeFactory.STRING);
        this.setReturnDataType(DataTypeFactory.create(NameString.class));
    }

    @Override
    public Object doTransform(Object src, String encoding) throws TransformerException {
        NameString nameString = new NameString();
        String name = (String) src;
        nameString.setName(name.replaceAll("\r", "").replaceAll("\n", "").trim());
        return nameString;
    }
}
