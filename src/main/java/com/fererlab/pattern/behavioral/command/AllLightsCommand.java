package com.fererlab.pattern.behavioral.command;

import java.util.List;

/**
 * Concrete Command
 */
public class AllLightsCommand implements Command {

    private final List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights) {
            if(light.isOn()){
                light.toggle();
            }
        }
    }
}
