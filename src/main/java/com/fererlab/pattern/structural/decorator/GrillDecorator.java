package com.fererlab.pattern.structural.decorator;

public class GrillDecorator extends SandwichDecorator {

    /**
     * extending via composition
     *
     * @param customSandwich Sandwich
     */
    public GrillDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addHeat();
    }

    private String addHeat() {
        return " + heated";
    }

}
