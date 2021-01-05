package org.acme.rest.json;

public class Fruit {
    // make a change to trigger for helm
    public String name;
    public String description;

    public Fruit() {
    }

    public Fruit(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
