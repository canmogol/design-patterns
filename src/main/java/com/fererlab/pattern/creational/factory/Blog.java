package com.fererlab.pattern.creational.factory;

public class Blog extends Website{

    @Override
    public void createWebsite() {
        getPages().add(new PostPage());
        getPages().add(new AboutPage());
        getPages().add(new CommentPage());
        getPages().add(new ContactPage());
    }

}
