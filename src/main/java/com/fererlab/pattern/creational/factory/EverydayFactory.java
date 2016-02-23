package com.fererlab.pattern.creational.factory;

import java.util.Calendar;
import java.util.Locale;

public class EverydayFactory {

    public static void main(String[] args) {
        // java.util.GregorianCalendar
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        // sun.util.BuddhistCalendar
        Locale locale = new Locale("th", "TH");
        Calendar calendar2 = Calendar.getInstance(locale);
        System.out.println("calendar2 = " + calendar2);
    }

}
