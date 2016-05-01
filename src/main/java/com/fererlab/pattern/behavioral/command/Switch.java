package com.fererlab.pattern.behavioral.command;

/**
 * Invoker
 */
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
