package org.mule.demo;

import java.io.Serializable;

public class NameString implements Serializable {

    private static final long serialVersionUID = 7010138636008560022L;

    private String name;
    private String greeting;

    public NameString() {
        this.name = null;
    }

    public NameString(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public boolean isValid() {
        return name != null && name.length() > 0;
    }
}
