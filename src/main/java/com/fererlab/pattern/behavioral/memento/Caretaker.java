package com.fererlab.pattern.behavioral.memento;

import java.util.Stack;

/**
 * Caretaker
 */
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee){
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee){
        employee.revert(employeeHistory.pop());
    }

}
