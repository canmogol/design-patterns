package com.fererlab.pattern.creational.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrototypeTester {

    private Registry registry;

    @Before
    public void prepare() {
        registry = new Registry();
    }

    @Test
    public void testAxePrototype() {
        Axe firstAxe = (Axe) registry.createItem(Axe.class.getName());
        System.out.println("firstAxe: " + firstAxe);
        firstAxe.setWeight(10);
        firstAxe.setQuantity(1);
        firstAxe.setPrice(22);
        System.out.println("firstAxe: " + firstAxe);

        Axe secondAxe = (Axe) registry.createItem(Axe.class.getName());
        System.out.println("secondAxe: " + secondAxe);
        secondAxe.setWeight(10);
        secondAxe.setQuantity(1);
        secondAxe.setPrice(22);
        System.out.println("secondAxe: " + secondAxe);

        // assert TRUE
        assertTrue(firstAxe.getId().equals(secondAxe.getId()));

        // assert FALSE
        assertFalse(firstAxe.equals(secondAxe));
        assertFalse(firstAxe == secondAxe);
    }

    @Test
    public void testSwordPrototype() {
        Sword firstSword = (Sword) registry.createItem(Sword.class.getName());
        System.out.println("firstSword:  " + firstSword);
        firstSword.setType("claymore");
        firstSword.setPrice(99);
        firstSword.setQuantity(7);
        System.out.println("firstSword:  " + firstSword);

        Sword secondSword = (Sword) registry.createItem(Sword.class.getName());
        System.out.println("secondSword: " + secondSword);
        secondSword.setType("claymore");
        secondSword.setPrice(99);
        secondSword.setQuantity(7);
        System.out.println("secondSword: " + secondSword);

        // assert TRUE, since they both have the same ID
        assertTrue(firstSword.getId().equals(secondSword.getId()));

        // assert FALSE
        assertFalse(firstSword.equals(secondSword));
        assertFalse(firstSword == secondSword);
    }

}
