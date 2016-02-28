package com.fererlab.pattern.structural.bridge.composition;

public class CircleComposition extends ShapeComposition {

    public CircleComposition(ColorComposition colorComposition) {
        super(colorComposition);
    }

    @Override
    public void applyColor() {
        colorComposition.applyColor();
    }

}
