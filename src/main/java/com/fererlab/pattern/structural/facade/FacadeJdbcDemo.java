package com.fererlab.pattern.structural.facade;

import java.util.List;

public class FacadeJdbcDemo {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        System.out.println("table created");

        int count = jdbcFacade.insertIntoTable();
        System.out.println(count + " rows inserted");

        List<Address> addressList = jdbcFacade.getAddresses();
        for (Address address : addressList) {
            System.out.println(address.getId() + ", " + address.getStreet() + ", " + address.getCity());
        }

    }

}
