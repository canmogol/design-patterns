package com.fererlab.pattern.behavioral.chainofresponsibility;


public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (RequestType.PURCHASE.equals(request.getRequestType())
                && 1000 > request.getAmount()) {
            System.out.println("VP: approve purchase with amount: " + request.getAmount());
        } else {
            getSuccessor().handleRequest(request);
        }
    }

}
