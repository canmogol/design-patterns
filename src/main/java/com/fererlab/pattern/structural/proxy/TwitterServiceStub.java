package com.fererlab.pattern.structural.proxy;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "Great Timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("screenName = [" + screenName + "], message = [" + message + "]");
    }

}
