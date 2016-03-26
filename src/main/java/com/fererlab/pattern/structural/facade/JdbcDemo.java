package com.fererlab.pattern.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) {
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
