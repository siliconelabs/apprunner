package org.scope;

import org.springframework.stereotype.Component;


public class Person {
    private String name;

    public Person() {
        System.out.println("person olustu");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// standard constructor, getters and setters
}
