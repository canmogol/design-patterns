package com.fererlab.pattern.behavioral.iterator;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTester {

    @Test
    public void everydayExample() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Wick");
        names.add("Baba Yaga");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println("name = " + name);
        }

        for (String name : names) {
            System.out.println("name = " + name);
        }

        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println("next = " + next);
            if (listIterator.hasPrevious()) {
                String previous = listIterator.previous();
                System.out.println("previous = " + previous);
                if (listIterator.hasPrevious()) {
                    previous = listIterator.previous();
                    System.out.println("previous again = " + previous);
                    next = listIterator.next();
                    System.out.println("next again moved = " + next);
                }
                next = listIterator.next();
                System.out.println("next again = " + next);
            }
        }

        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            String name = nameIterator.next();
            System.out.println("name = " + name);
            nameIterator.remove();
        }

        System.out.println("names.size() = " + names.size());
    }

    @Test
    public void testIterator() {
        BikeRepository repository = new BikeRepository();
        repository.addBike("Suzuki Hayabusa");
        repository.addBike("Ducati 1098s");
        repository.addBike("Agusta F4");

        Iterator<String> bikeIterator = repository.iterator();
        while (bikeIterator.hasNext()) {
            System.out.println("bikeIterator.next() = " + bikeIterator.next());
        }
    }

}
