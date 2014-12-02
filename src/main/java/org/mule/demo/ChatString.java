package org.mule.demo;

import java.io.Serializable;


public class ChatString implements Serializable {
    private static final long serialVersionUID = -3140370545357738491L;

    private StringBuffer string = new StringBuffer();

    public StringBuffer append(String str) {
        return string.append(str);
    }

    public StringBuffer append(StringBuffer sb) {
        return string.append(sb);
    }

    public StringBuffer insert(int offset, char[] str) {
        return string.insert(offset, str);
    }

    public StringBuffer insert(int index, char[] str, int offset, int len) {
        return string.insert(index, str, offset, len);
    }

    @Override
    public String toString() {
        return string.toString();
    }

    public int getSize() {
        return string.length();
    }

}
