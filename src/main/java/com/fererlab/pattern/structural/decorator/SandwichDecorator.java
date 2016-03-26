package com.fererlab.pattern.structural.decorator;

/**
 * Decorator
 */
public abstract class SandwichDecorator implements Sandwich {

    /**
     * this instance can be a Sandwich instance or another decorator
     */
    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }

}
