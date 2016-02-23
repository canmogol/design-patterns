package com.fererlab.pattern.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG, "great site");
        System.out.println("site = " + site);

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println("site = " + site);
    }

}
