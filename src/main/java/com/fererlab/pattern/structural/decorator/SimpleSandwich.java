package com.fererlab.pattern.structural.decorator;

/**
 * ConcreteComponent
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
