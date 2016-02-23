package com.fererlab.pattern.creational.prototype;

public class Axe extends Item {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Axe{" +
                "weight=" + weight +
                " item='" + super.toString() + '\'' +
                '}';
    }
}
