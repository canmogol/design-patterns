package com.fererlab.pattern.behavioral.state;

public class FanLowState extends State {

    private final Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan on to medium");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is on low";
    }
}
