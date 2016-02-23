package com.fererlab.pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        Sword sword = new Sword();
        sword.setId(UUID.randomUUID().toString());
        sword.setType("catana");
        sword.setPrice(12.5);
        sword.setQuantity(2);
        this.items.put(Sword.class.getName(), sword);

        Axe axe = new Axe();
        axe.setId(UUID.randomUUID().toString());
        axe.setWeight(120);
        axe.setQuantity(1);
        axe.setPrice(20);
        this.items.put(Axe.class.getName(), axe);
    }

    public Item createItem(String itemType) {
        Item item = null;
        try{
            item = (Item) this.items.get(itemType).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }


}
