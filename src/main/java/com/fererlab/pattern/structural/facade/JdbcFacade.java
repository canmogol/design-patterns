package com.fererlab.pattern.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    private DbSingleton dbSingleton = null;

    public JdbcFacade() {
        dbSingleton = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection connection = dbSingleton.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE ADDRESS (ID INTEGER, STREET_NAME VARCHAR(20), CITY VARCHAR(20) )");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection connection = dbSingleton.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO ADDRESS(ID, STREET_NAME, CITY) VALUES(1, '52.street', 'Ankara')");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();
        try {
            Connection connection = dbSingleton.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ADDRESS");
            while (resultSet.next()) {
                Address address = new Address();
                address.setId(resultSet.getInt(1));
                address.setStreet(resultSet.getString(2));
                address.setCity(resultSet.getString(3));
                addresses.add(address);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }


}
