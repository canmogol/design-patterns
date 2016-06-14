package com.fererlab.pattern.behavioral.observer;

public abstract class Observer {

    /**
     * reference of the subject that we can get state from,
     * this is different from the java.util implementation
     */
    protected Subject subject;

    abstract void update();

}
