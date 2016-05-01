package com.fererlab.pattern.behavioral.chainofresponsibility;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (RequestType.CONFERENCE.equals(request.getRequestType())) {
            System.out.println("DIRECTOR: approve conference with amount: " + request.getAmount());
        } else {
            getSuccessor().handleRequest(request);
        }
    }
}
