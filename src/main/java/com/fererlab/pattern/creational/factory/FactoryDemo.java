package com.fererlab.pattern.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println("site = " + (site != null ? site.getPages() : null));

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println("site = " + (site != null ? site.getPages() : null));

    }

}
