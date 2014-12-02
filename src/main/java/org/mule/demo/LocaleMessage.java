package org.mule.demo;

import org.mule.config.i18n.MessageFactory;


public class LocaleMessage extends MessageFactory {
    private static final LocaleMessage factory = new LocaleMessage();

    private static final String BUNDLE_PATH = "messages.hello-example-messages";

    public static String getGreetingPart2() {
        return factory.getString(BUNDLE_PATH, 1);
    }

    public static String getGreetingPart1() {
        return factory.getString(BUNDLE_PATH, 2);
    }

    public static String getPrompt() {
        return factory.getString(BUNDLE_PATH, 3);
    }

    public static String getInvalidUserNameError() {
        return factory.getString(BUNDLE_PATH, 4);
    }
}
