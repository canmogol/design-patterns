package com.fererlab.pattern.structural.adapter;

public class EmployeeAdapterLDAP implements Employee {
    private EmployeeLDAP instance;

    public EmployeeAdapterLDAP(EmployeeLDAP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getName() {
        return instance.getGivenName() + " " + instance.getSurName();
    }
}
