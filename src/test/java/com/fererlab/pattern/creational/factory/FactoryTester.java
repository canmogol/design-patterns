package com.fererlab.pattern.creational.factory;

import org.junit.Test;

import java.util.Calendar;
import java.util.Locale;

import static org.junit.Assert.*;

public class FactoryTester {

    @Test
    public void testFactory() {
        Website blog1 = WebsiteFactory.getWebsite(WebsiteType.BLOG, "great site");
        System.out.println("site = " + blog1);
        Website blog2 = WebsiteFactory.getWebsite(WebsiteType.BLOG, "great site");
        System.out.println("site = " + blog2);
        assertNotNull(blog1);
        assertNotNull(blog2);
        assertEquals(blog1.getPages().size(), blog1.getPages().size());
        assertEquals(blog1.getTitle(), blog2.getTitle());
        assertFalse(blog1.equals(blog2));

        Website shop1 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println("site = " + shop1);
        Website shop2 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println("site = " + shop2);
        assertNotNull(shop1);
        assertNotNull(shop2);
        assertEquals(shop1.getPages().size(), shop1.getPages().size());
        assertEquals(shop1.getTitle(), shop2.getTitle());
        assertFalse(shop1.equals(shop2));
    }

    @Test
    public void testCalendarImplementations() {
        // java.util.GregorianCalendar
        Calendar possibleGregorian = Calendar.getInstance();
        System.out.println("possibleGregorian = " + possibleGregorian);
        assertNotNull(possibleGregorian);
        assertTrue(java.util.GregorianCalendar.class.isAssignableFrom(possibleGregorian.getClass()));

        // sun.util.BuddhistCalendar
        Locale locale = new Locale("th", "TH");
        Calendar expectedBuddhist = Calendar.getInstance(locale);
        System.out.println("expectedBuddhist = " + expectedBuddhist);
        assertNotNull(expectedBuddhist);
        assertTrue(sun.util.BuddhistCalendar.class.isAssignableFrom(expectedBuddhist.getClass()));

    }

}
