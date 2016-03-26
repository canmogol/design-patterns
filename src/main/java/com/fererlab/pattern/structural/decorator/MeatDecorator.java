package com.fererlab.pattern.structural.decorator;

/**
 *  ConcreteDecorator
 */
public class MeatDecorator extends SandwichDecorator {

    /**
     * extending via composition
     * @param customSandwich Sandwich
     */
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + beef";
    }

}
