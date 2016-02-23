package com.fererlab.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonTester {

    @Test
    public void testApplicationSingleton() {
        Application applicationFirst = Application.getInstance();
        Application applicationSecond = Application.getInstance();
        assertTrue(applicationFirst == applicationSecond) ;
    }

}
