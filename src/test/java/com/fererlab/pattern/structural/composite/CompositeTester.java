package com.fererlab.pattern.structural.composite;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CompositeTester {

    @Test
    public void everydayExample(){
        Map<String, String> personAttributes = new HashMap<>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String, String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role", "claims");

        Map<String, String> securityAttribues = new HashMap<>();
        securityAttribues.putAll(personAttributes);
        securityAttribues.putAll(groupAttributes);

        System.out.println("securityAttribues = " + securityAttribues);
    }

    @Test
    public void compositeMenuTest(){
        // - "Main >>"
        Menu mainMenu = new Menu("Main", "/main");
        // - - "Safety"
        Item safetyMenuItem = new Item("Safety", "/safety");
        mainMenu.add(safetyMenuItem);
        // - - "Claims >>"
        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);
        // - - - "Personal Claims"
        Item personelClaims = new Item("Personal Claims", "/personalClaims");
        claimsSubMenu.add(personelClaims);

        // - "Main >>"
        // - - "Safety"
        // - - "Claims >>"
        // - - - "Personal Claims"
        System.out.println("mainMenu = " + mainMenu);
    }

}
