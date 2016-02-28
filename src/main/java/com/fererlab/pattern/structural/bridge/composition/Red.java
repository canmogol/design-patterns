package com.fererlab.pattern.structural.bridge.composition;

public class Red implements ColorComposition {
    @Override
    public void applyColor() {
        System.out.println("applying red color");
    }
}
