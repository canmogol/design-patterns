package com.fererlab.pattern.behavioral.observer;

/**
 * ConcreteObserver
 */
public class TabletClient extends Observer {

    public TabletClient(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }

}
