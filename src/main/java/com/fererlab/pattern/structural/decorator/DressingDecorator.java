package com.fererlab.pattern.structural.decorator;

public class DressingDecorator extends SandwichDecorator {

    /**
     * extending via composition
     * @param customSandwich Sandwich
     */
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + mustard";
    }

}
