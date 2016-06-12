package com.fererlab.pattern.behavioral.mediator;

import com.fererlab.pattern.behavioral.command.Light;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator (might be an interface/abstract class with a ConcreteMediator class)
 */
public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light){
        lights.add(light);
    }

    public void turnOnAllLights(){
        for(Light light : lights){
            if(!light.isOn()){
                light.toggle();
            }
        }
    }

    public void turnOffAllLights(){
        for(Light light : lights){
            if(light.isOn()){
                light.toggle();
            }
        }
    }

}
