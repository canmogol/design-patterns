package com.fererlab.pattern.behavioral.command;

/**
 * Receiver
 */
public class Light {

    private boolean isOn = false;

    public boolean isOn(){
        return isOn;
    }

    /**
     * action
     */
    public void toggle(){
        if(isOn){
            off();
            isOn = false;
        }else{
            on();
            isOn = true;
        }
    }

    private void on(){
        System.out.println("light switched on");
    }

    private void off(){
        System.out.println("light switched off");
    }


}
