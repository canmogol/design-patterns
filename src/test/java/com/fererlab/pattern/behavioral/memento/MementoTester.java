package com.fererlab.pattern.behavioral.memento;

import org.junit.Test;

import javax.swing.text.Caret;
import java.io.*;

public class MementoTester implements Serializable {

    class SerializableEmployee implements Serializable {
        private String name;
        private String address;
        private String phone;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    @Test
    public void everydayExample() {
        SerializableEmployee serializableEmployee = new SerializableEmployee();
        serializableEmployee.setName("John Wick");
        serializableEmployee.setAddress("Elm Street");
        serializableEmployee.setPhone("555-3454");

        serialize(serializableEmployee);
        SerializableEmployee newSerializableEmployee = deserialize();
        System.out.println("newSerializableEmployee = " + newSerializableEmployee);
    }

    private SerializableEmployee deserialize() {
        SerializableEmployee serializableEmployee = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("/tmp/serializableEmployee");
            ObjectInputStream objectOutputStream = new ObjectInputStream(fileInputStream);
            serializableEmployee = (SerializableEmployee) objectOutputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return serializableEmployee;
    }

    private void serialize(SerializableEmployee serializableEmployee) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/serializableEmployee");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializableEmployee);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMemento(){
        // create care taıer
        Caretaker caretaker = new Caretaker();

        // create an employee
        Employee employee = new Employee();
        employee.setName("John Wick");
        employee.setAddress("Elm Street");
        employee.setPhone("555-3454");

        // current state of employee
        System.out.println("employee before save                           = " + employee);

        // save employee's current state
        caretaker.save(employee);

        // change the phone number of the employee
        employee.setPhone("111-9999");

        // save employee's current state
        caretaker.save(employee);

        System.out.println("employee after phone change and two save calls = " + employee);

        // change the phone number of the employee
        employee.setPhone("000-0000");

        System.out.println("employee after third phone number              = " + employee);

        // expect to revert the phone number
        caretaker.revert(employee);

        System.out.println("employee reverted                              = " + employee);

        // expect to revert the phone number
        caretaker.revert(employee);

        System.out.println("employee reverted, the original state          = " + employee);

    }

}
