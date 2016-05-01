package com.fererlab.pattern.behavioral.chainofresponsibility;


public abstract class Handler {
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return successor;
    }

    public abstract void handleRequest(Request request);

}
