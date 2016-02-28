package com.fererlab.pattern.structural.adapter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class AdapterTester {

    @Test
    public void everydayExampleTest() {
        Integer[] arrayOfIntegers = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> integerList = Arrays.asList(arrayOfIntegers);
        System.out.println("integerList = " + integerList);
        System.out.println("arrayOfIntegers = " + arrayOfIntegers.length);
    }

    @Test
    public void testGetEmployees() {
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employeeList = employeeClient.getEmployeeList();
        assertEquals(employeeList.size(), 3);
    }

}
