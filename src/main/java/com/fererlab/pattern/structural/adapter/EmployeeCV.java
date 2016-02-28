package com.fererlab.pattern.structural.adapter;

public class EmployeeCV {

    private int id;
    private String surnameAndName;

    public EmployeeCV(int id, String surnameAndName) {
        this.id = id;
        this.surnameAndName = surnameAndName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurnameAndName() {
        return surnameAndName;
    }

    public void setSurnameAndName(String surnameAndName) {
        this.surnameAndName = surnameAndName;
    }

}
