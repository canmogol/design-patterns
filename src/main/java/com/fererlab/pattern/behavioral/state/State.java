package com.fererlab.pattern.behavioral.state;


public abstract class State {

    public void handleRequest() {
        System.out.println("Should not be able to get here");
    }

}
