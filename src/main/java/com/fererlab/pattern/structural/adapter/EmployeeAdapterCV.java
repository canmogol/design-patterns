package com.fererlab.pattern.structural.adapter;

public class EmployeeAdapterCV implements Employee {

    private EmployeeCV instance;

    public EmployeeAdapterCV(EmployeeCV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return String.valueOf(instance.getId());
    }

    @Override
    public String getName() {
        if (instance.getSurnameAndName().contains(",")) {
            String[] surnameAndName = instance.getSurnameAndName().split(",");
            if (surnameAndName.length == 2) {
                return surnameAndName[1] + " " + surnameAndName[0];
            }
        }
        return instance.getSurnameAndName();
    }
}
