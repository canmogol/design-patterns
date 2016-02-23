package com.fererlab.pattern.creational.factory;

public class Shop extends Website{
    @Override
    public void createWebsite() {
        getPages().add(new CartPage());
        getPages().add(new ItemPage());
        getPages().add(new SearchPage());
    }
}
