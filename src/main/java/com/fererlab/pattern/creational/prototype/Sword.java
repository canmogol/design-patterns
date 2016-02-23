package com.fererlab.pattern.creational.prototype;

public class Sword extends Item {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "type='" + type + '\'' +
                " item='" + super.toString() + '\'' +
                '}';
    }
}
