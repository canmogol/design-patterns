package com.fererlab.pattern.creational.factory;

public class Blog extends Website {

    public Blog(String title) {
        super(title);
    }

    @Override
    public void createWebsite() {
        getPages().add(new PostPage());
        getPages().add(new AboutPage());
        getPages().add(new CommentPage());
        getPages().add(new ContactPage());
    }

    @Override
    public String toString() {
        return "Blog{title: '" + getTitle() + "', pages: " + getPages() + "}";
    }
}