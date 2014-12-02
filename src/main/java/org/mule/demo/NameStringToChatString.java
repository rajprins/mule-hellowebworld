package org.mule.demo;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

public class NameStringToChatString extends AbstractTransformer {

    public NameStringToChatString() {
        super();
        this.registerSourceType(DataTypeFactory.create(NameString.class));
        this.setReturnDataType(DataTypeFactory.create(ChatString.class));
    }

    @Override
    public Object doTransform(Object src, String encoding) throws TransformerException {
        ChatString chatString = new ChatString();
        NameString nameString = (NameString) src;
        chatString.append(nameString.getGreeting());
        chatString.append(nameString.getName());
        return chatString;
    }

}
