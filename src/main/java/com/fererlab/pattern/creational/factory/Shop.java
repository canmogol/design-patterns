package com.fererlab.pattern.creational.factory;

public class Shop extends Website {

    public Shop(String title) {
        super(title);
    }

    @Override
    public void createWebsite() {
        getPages().add(new CartPage());
        getPages().add(new ItemPage());
        getPages().add(new SearchPage());
    }

    @Override
    public String toString() {
        return "Shop{title: '" + getTitle() + "', pages: " + getPages() + "}";
    }
}
