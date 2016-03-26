package com.fererlab.pattern.structural.facade;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class FacadeTester {

    @Test
    public void everydayExample() throws IOException {
        // URL is the everyday Facade Pattern in standard JAVA API
        URL url = new URL("http", "www.fererlab.com", 80, "/belgeler");
        // wrapping the input stream with a reader is an example of decorator
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        url.openStream()
                )
        );
        // will read content line by line
        String input = "";
        while ((input = in.readLine()) != null) {
            System.out.println("input = " + input);
        }
    }

    /**
     * use this method to run the jdbc and facade versions
     * @throws IOException
     */
    @Test
    public void runTest() throws IOException {
        jdbcExample();
        //jdbcFacadeExample();
    }

    /**
     * See #jdbcFacadeExample to understand what does facade do
     *
     * @throws IOException
     */
    public void jdbcExample() throws IOException {
        DbSingleton dbSingleton = DbSingleton.getInstance();
        try {
            Connection connection = dbSingleton.getConnection();
            Statement statement = connection.createStatement();
            // executeUpdate returns
            // either (1) the row count for SQL Data Manipulation Language (DML) statements
            // or (2) 0 for SQL statements that return nothing

            // create table
            int count = statement.executeUpdate("CREATE TABLE ADDRESS (ID INTEGER, STREET_NAME VARCHAR(20), CITY VARCHAR(20) )");
            System.out.println("table created");
            statement.close();

            // insert a row
            statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO ADDRESS(ID, STREET_NAME, CITY) VALUES(1, '52.street', 'Ankara')");
            System.out.println(count + " rows inserted");

            // select all from table
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ADDRESS");

            // print all rows
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + ", " + resultSet.getString(2) + ", " + resultSet.getString(3));
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Here client gets a better and easier interface
     *
     * @throws IOException
     */
    public void jdbcFacadeExample() throws IOException {
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
