package com.fererlab.pattern.creational.factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType, String siteTitle) {
        switch (siteType) {
            case BLOG: {
                return new Blog(siteTitle);
            }
            case SHOP: {
                return new Shop(siteTitle);
            }
            default: {
                return null;
            }
        }
    }

    public static Website getWebsite(WebsiteType siteType) {
        return getWebsite(siteType, "");
    }

}
