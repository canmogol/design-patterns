package com.fererlab.pattern.behavioral.observer;

/**
 * ConcreteObserver
 */
public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

    @Override
    void update() {
        System.out.println("Phone stream: " + subject.getState());
    }
}
