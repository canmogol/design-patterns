package com.fererlab.pattern.structural.bridge.composition;

public class SquareComposition extends ShapeComposition {

    public SquareComposition(ColorComposition colorComposition) {
        super(colorComposition);
    }

    @Override
    public void applyColor() {
        colorComposition.applyColor();
    }

}
