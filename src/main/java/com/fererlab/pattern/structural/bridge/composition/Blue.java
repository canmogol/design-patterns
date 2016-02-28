package com.fererlab.pattern.structural.bridge.composition;

public class Blue implements ColorComposition {
    @Override
    public void applyColor() {
        System.out.println("applying blue color");
    }
}
