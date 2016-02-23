package com.fererlab.pattern.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    private final String title;
    protected List<Page> pages = new ArrayList<>();

    public Website(String title) {
        this.title = title;
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public abstract void createWebsite();


}
