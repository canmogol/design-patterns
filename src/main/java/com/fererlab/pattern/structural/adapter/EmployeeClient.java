package com.fererlab.pattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public EmployeeClient() {
    }

    public List<Employee> getEmployeeList() {

        // add DB employee
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "john wick");
        employees.add(employeeFromDB);

        // add LDAP employee
        EmployeeLDAP employeeLDAP = new EmployeeLDAP("4321", "wick", "john");
        // adapt LDAP employee
        employees.add(new EmployeeAdapterLDAP(employeeLDAP));

        // add CV employee
        EmployeeCV employeeCV = new EmployeeCV(1111, "wick, john");
        // adapt CV employee
        employees.add(new EmployeeAdapterCV(employeeCV));

        return employees;
    }

}
