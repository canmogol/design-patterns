package com.fererlab.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Catalog acts as a factory and cache for Item Flyweight objects
 */
public class Catalog {

    /**
     * Item object cache
     */
    private Map<String, Item> items = new HashMap<>();

    /**
     * Factory method
     *
     * @param itemName String name of the item
     * @return {@code Item}
     */
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    /**
     * total number of item objects created
     *
     * @return number of Item objects created
     */
    public int totalItemsMade() {
        return items.size();
    }

}
