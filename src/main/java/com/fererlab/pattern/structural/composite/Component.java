package com.fererlab.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Component
 */
public abstract class Component {

    private final String name;
    private final String path;
    List<Component> components = new ArrayList<>();

    public Component(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public abstract String toString();

}
