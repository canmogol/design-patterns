package com.fererlab.pattern.structural.bridge.composition;

public abstract class ShapeComposition {

    protected ColorComposition colorComposition;

    public ShapeComposition(ColorComposition colorComposition) {
        this.colorComposition = colorComposition;
    }

    /**
     * this method may seem to be redundant as {@link ColorComposition#applyColor()}
     * exists but we will use composition
     */
    public abstract void applyColor();

}
