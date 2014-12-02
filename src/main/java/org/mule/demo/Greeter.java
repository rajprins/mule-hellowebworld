package org.mule.demo;

public class Greeter {
    private String greeting = "";

    public Greeter() {
        greeting = LocaleMessage.getGreetingPart1();
    }

    public Object greet(NameString person) {
        Object payload = person;
        if (person.isValid()) {
            person.setGreeting(greeting);
        } else {
            payload = new Exception(LocaleMessage.getInvalidUserNameError());
        }
        return payload;
    }
}
