package com.fererlab.pattern.structural.bridge.composition;


public class Green implements ColorComposition {
    @Override
    public void applyColor() {
        System.out.println("applying green color");
    }
}
