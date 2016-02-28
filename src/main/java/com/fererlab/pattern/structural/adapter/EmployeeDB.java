package com.fererlab.pattern.structural.adapter;

public class EmployeeDB implements Employee {
    private String id;
    private String name;

    public EmployeeDB(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
