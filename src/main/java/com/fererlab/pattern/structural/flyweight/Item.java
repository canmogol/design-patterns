package com.fererlab.pattern.structural.flyweight;

/**
 * Immutable Item
 * Instances of Item will be the flyweights
 */
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
