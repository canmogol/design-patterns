package com.fererlab.pattern.behavioral.chainofresponsibility;


public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO: approves " + request.getRequestType().name() + " request with amount: " + request.getAmount());
    }

}
