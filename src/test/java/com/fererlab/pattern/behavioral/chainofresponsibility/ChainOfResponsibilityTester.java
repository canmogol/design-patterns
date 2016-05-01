package com.fererlab.pattern.behavioral.chainofresponsibility;

import org.junit.Test;

import java.util.logging.*;

public class ChainOfResponsibilityTester {

    @Test
    public void everydayExample() {
        // java.util.logging.Logger sample Chain Of Responsibility Pattern implementation in java API
        Logger logger = Logger.getLogger(getClass().getName());
        // set level to FINER, there will be two console logger with this level
        logger.setLevel(Level.FINER);

        // first console handler
        ConsoleHandler consoleHandlerOne = new ConsoleHandler();
        consoleHandlerOne.setFormatter(new SimpleFormatter() {
            @Override
            public synchronized String format(LogRecord record) {
                return "CONSOLE ONE: " + super.format(record);
            }
        });
        consoleHandlerOne.setLevel(Level.FINER);
        logger.addHandler(consoleHandlerOne);

        // second console handler
        ConsoleHandler consoleHandlerTwo = new ConsoleHandler();
        consoleHandlerTwo.setLevel(Level.FINER);
        consoleHandlerTwo.setFormatter(new SimpleFormatter() {
            @Override
            public synchronized String format(LogRecord record) {
                return "CONSOLE TWO: " + super.format(record);
            }
        });
        logger.addHandler(consoleHandlerTwo);

        // log lines
        logger.finest("this line should not print");
        logger.finer("Finer log line");
        logger.fine("another log");
    }

    @Test
    public void testHandlers(){
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 999);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);

    }

}
