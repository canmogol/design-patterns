package com.fererlab.pattern.behavioral.mediator;


import com.fererlab.pattern.behavioral.command.Command;

public class TurnOffAllLightsCommand implements Command {

    private final Mediator mediator;

    public TurnOffAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLights();
    }

}

