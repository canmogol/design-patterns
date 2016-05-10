package com.fererlab.pattern.behavioral.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private static final int allocateSize = 10;
    private String[] bikes;
    private int index = 0;

    public BikeRepository() {
        this(allocateSize);
    }

    public BikeRepository(int initialSize) {
        bikes = new String[initialSize];
    }

    public void addBike(String bike) {
        // if initial array is filled, increase it with allocation size
        if (index == bikes.length) {
            int currentSize = bikes.length + allocateSize;
            String[] bikesTemp = new String[currentSize];
            // copy the
            System.arraycopy(bikes, 0, bikesTemp, 0, bikes.length);
            bikes = bikesTemp;
            bikesTemp = null;
        }
        bikes[index] = bike;
        index++;
    }


    private class BikeIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < bikes.length && bikes[index] != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            String bike = bikes[index];
            index = index + 1;
            return bike;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new BikeIterator();
    }
}
