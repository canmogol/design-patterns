package com.fererlab.pattern.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

public class FlyweightTester {

    @Test
    public void everydayExample() {
        // Strings are immutable in java and they come out of String literal pool
        // the literal pool is sort of a cache that all Strings in JVM are stored in and retrieved from
        // this is a great example of flyweight in action
        // but also there are others such as Integers make use of flyweight pattern as well
        Integer firstInt = Integer.valueOf(5); // do not mind the unnecessary boxing notification of the IDE
        Integer secondInt = Integer.valueOf(5);
        Integer thirdInt = Integer.valueOf(10);

        int firstHashCode = System.identityHashCode(firstInt);
        int secondHashCode = System.identityHashCode(secondInt);
        int thirdHashCode = System.identityHashCode(thirdInt);

        Assert.assertEquals(firstHashCode, secondHashCode);
        Assert.assertNotEquals(firstHashCode, thirdHashCode);
    }


    @Test
    public void flyweightTest() {
        // create inventory system
        InventorySystem inventorySystem = new InventorySystem();

        // take orders
        inventorySystem.takeOrder("Interstellar", 201);
        inventorySystem.takeOrder("Gillette Dash Button", 499);
        inventorySystem.takeOrder("Star Wars: The Force Awakens", 171);
        inventorySystem.takeOrder("Nikon Coolpix L340 Digital Camera", 12);
        inventorySystem.takeOrder("Ausdom M06 Lightweight Stereo Wired Wireless Bluetooth", 12);

        inventorySystem.takeOrder("Interstellar", 1234);
        inventorySystem.takeOrder("Gillette Dash Button", 1501);
        inventorySystem.takeOrder("Star Wars: The Force Awakens", 234);
        inventorySystem.takeOrder("Nikon Coolpix L340 Digital Camera", 855);
        inventorySystem.takeOrder("Ausdom M06 Lightweight Stereo Wired Wireless Bluetooth", 14296);

        inventorySystem.takeOrder("Interstellar", 3401);
        inventorySystem.takeOrder("Gillette Dash Button", 23);
        inventorySystem.takeOrder("Star Wars: The Force Awakens", 454);
        inventorySystem.takeOrder("Nikon Coolpix L340 Digital Camera", 442);
        inventorySystem.takeOrder("Ausdom M06 Lightweight Stereo Wired Wireless Bluetooth", 9321);

        // process orders
        inventorySystem.process();

        // print report
        System.out.println(inventorySystem.report());

        Assert.assertEquals(inventorySystem.report(), "Total item objects made: " + 5);
    }

}
