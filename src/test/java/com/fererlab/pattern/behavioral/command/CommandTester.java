
package com.fererlab.pattern.behavioral.command;


import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CommandTester {

    /**
     * ConcreteCommand
     */
    class Task implements Runnable/*Command Interface*/ {

        // number one and two are the request
        private final int numberOne;
        private final int numberTwo;

        /**
         * Task ConcreteCommand encapsulates the request
         *
         * @param numberOne request parameter one
         * @param numberTwo request parameter two
         */
        public Task(int numberOne, int numberTwo) {
            this.numberOne = numberOne;
            this.numberTwo = numberTwo;
        }

        @Override
        public void run() {
            PrintStream Receiver = System.out;
            /**
             * Receiver#action()
             */
            Receiver.println(numberOne * numberTwo);
        }
    }

    @Test
    public void everydayExample() {

        // Commands
        Task task1 = new Task(11, 22);
        Task task2 = new Task(33, 44);

        /**
         * Invoker
         */
        Thread thread1 = new Thread(task1);
        thread1.start();

        /**
         * Invoker
         */
        Thread thread2 = new Thread(task2);
        thread2.start();

    }

    /**
     * Client
     */
    @Test
    public void testCommand() {
        // Receiver, this object may do the action if called
        Light light = new Light();

        // Concrete Command, will call Receiver to do action
        Command command = new ToggleCommand(light);

        // Invoker,
        // may have a one or more Command types with aggregation
        // and invoker will call execute() on command(s)
        Switch lightSwitch = new Switch();
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
    }

    /**
     * Client
     */
    @Test
    public void testMultipleCommands() {
        // Receivers
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        // Concrete Command, will call Receiver to do action
        Command allLightsCommand = new AllLightsCommand(lights);

        // Concrete Command, will call Receiver to do action
        Command toggleCommand = new ToggleCommand(bedroomLight);

        // Invoker,
        // may have a one or more Command types with aggregation
        // and invoker will call execute() on command(s)
        Switch lightSwitch = new Switch();
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
