package org.mule.demo;

public class ChitChatter {
    private String chitchat = "";

    public ChitChatter() {
        chitchat = LocaleMessage.getGreetingPart2();
    }

    public void chat(ChatString string) {
        string.append(chitchat);
    }

}
