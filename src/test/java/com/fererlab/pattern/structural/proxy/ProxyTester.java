package com.fererlab.pattern.structural.proxy;

import org.junit.Test;

public class ProxyTester {

    @Test
    public void proxyStubTest() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        System.out.println("stub service = " + service.getTimeline("test-data"));
    }

    @Test
    public void proxyImplTest() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println("real service = " + service.getTimeline("canmogol"));
    }

    @Test(expected = RuntimeException.class)
    public void proxyPostToTimelineTest() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        service.postToTimeline("canmogol", "Some message that should not go through");
    }

}
