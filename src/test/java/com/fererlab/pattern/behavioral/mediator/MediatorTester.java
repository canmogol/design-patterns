package com.fererlab.pattern.behavioral.mediator;

import com.fererlab.pattern.behavioral.command.Command;
import com.fererlab.pattern.behavioral.command.Light;
import org.junit.Test;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorTester {

    private Toolkit toolkit = Toolkit.getDefaultToolkit();
    private Timer timer;

    /**
     * Concrete Colleague 1
     */
    class ReminderTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("Time is up!");
            toolkit.beep();
        }
    }

    /**
     * Concrete Colleague 2
     */
    class ReminderTaskWithoutBeep extends TimerTask{
        @Override
        public void run() {
            System.out.println("No beep, time is up!");
            timer.cancel();
        }
    }

    public static void main(String[] args) {
        MediatorTester mediatorTester = new MediatorTester();
        mediatorTester.everydayExample();
    }

    public void everydayExample() {
        /**
         * Mediator
         */
        timer = new Timer();
        timer.schedule(new ReminderTask(), 1000);
        timer.schedule(new ReminderTaskWithoutBeep(), 2 * 1000);
    }

    @Test
    public void testMediator(){
        /**
         * Mediator
         */
        Mediator mediator = new Mediator();

        /**
         * Concrete Colleague (Light) implements Colleague (Command)
         */
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        // register colleague to mediator
        mediator.registerLight(bedroomLight);
        // register colleague to mediator
        mediator.registerLight(kitchenLight);

        // Command will call the Mediator interface, it does not know about the Light(s)
        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        // Command will call the Mediator interface, it does not know about the Light(s)
        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();

    }

}
