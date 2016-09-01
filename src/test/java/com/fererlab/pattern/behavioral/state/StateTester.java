package com.fererlab.pattern.behavioral.state;


import org.junit.Test;

public class StateTester {


    private class EverydayFan {

        private final static int OFF = 0;
        private final static int LOW = 1;
        private final static int MID = 2;
        private int state = OFF;

        private void pullChain() {
            if (state == OFF) {
                System.out.println("Turning Fan on to low");
                state = LOW;
            } else if (state == LOW) {
                System.out.println("Turning Fan on to medium");
                state = MID;
            } else if (state == MID) {
                System.out.println("Turning Fan off");
                state = OFF;
            }
        }

        @Override
        public String toString() {
            if (state == LOW) {
                return "Fan is on low";
            } else if (state == OFF) {
                return "Fan is off";
            } else if (state == MID) {
                return "Fan is on medium";
            } else {
                return "Invalid state";
            }
        }
    }

    @Test
    public void everydayExample() {
        EverydayFan fan = new EverydayFan();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
    }

    @Test
    public void testState() {
        Fan fan = new Fan();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
        fan.pullChain();
        System.out.println(fan);
    }

}
