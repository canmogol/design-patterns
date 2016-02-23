package com.fererlab.pattern.creational.builder;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BuilderTester {

    @Test
    public void testOrderBuilder() {
        String bread = "barley";
        String salad = "iceberg";
        String meat = "fish";
        Order order = new Order.Builder().bread(bread).salad(salad).meat(meat).build();
        assertEquals(order.getBread(), bread);
        assertEquals(order.getSalad(), salad);
        assertEquals(order.getMeat(), meat);
    }

}
