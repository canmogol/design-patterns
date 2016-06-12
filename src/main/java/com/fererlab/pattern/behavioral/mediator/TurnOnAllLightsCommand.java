package com.fererlab.pattern.behavioral.mediator;


import com.fererlab.pattern.behavioral.command.Command;
import com.fererlab.pattern.behavioral.command.Light;

import java.util.List;

public class TurnOnAllLightsCommand implements Command {

    private final Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }

}

