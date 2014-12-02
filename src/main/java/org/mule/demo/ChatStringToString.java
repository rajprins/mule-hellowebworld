package org.mule.demo;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

public class ChatStringToString extends AbstractTransformer {
    public ChatStringToString() {
        super();
        this.registerSourceType(DataTypeFactory.create(ChatString.class));
        this.setReturnDataType(DataTypeFactory.STRING);
    }

    @Override
    public Object doTransform(Object src, String encoding) throws TransformerException {
        ChatString chatString = (ChatString) src;
        return chatString.toString();
    }
}
