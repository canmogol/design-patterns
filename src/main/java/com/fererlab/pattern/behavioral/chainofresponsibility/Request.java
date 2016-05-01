package com.fererlab.pattern.behavioral.chainofresponsibility;


public class Request {
    private final RequestType requestType;
    private final int amount;

    public Request(RequestType requestType, int amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public int getAmount() {
        return amount;
    }
}
