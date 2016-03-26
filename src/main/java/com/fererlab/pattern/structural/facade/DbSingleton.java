package com.fererlab.pattern.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            String dbUrl = "jdbc:derby:memory:testJava/testdb;create=true";
            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
