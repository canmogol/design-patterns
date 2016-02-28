package com.fererlab.pattern.structural.bridge;

import com.fererlab.pattern.structural.bridge.composition.*;
import com.fererlab.pattern.structural.bridge.entertainment.*;
import com.fererlab.pattern.structural.bridge.inheritance.*;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class BridgeTester {

    //@Test
    public void everydayExampleTest() throws Exception {
        // values to test
        Integer id = 1;
        String name = "john";
        // register driver
        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        String dbUrl = "jdbc:derby:memory:testJava/testdb;create=true";
        // connect to DB with jdbc url with registered driver
        Connection connection = DriverManager.getConnection(dbUrl);
        // create a statment to create table
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE TEST_USER( TEST_ID INTEGER not NULL, TEST_NAME VARCHAR(25), PRIMARY KEY ( TEST_ID ))");
        // prepare and insert user
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO TEST_USER(TEST_ID, TEST_NAME) VALUES (?, ?)");
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.executeUpdate();
        // select the users
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT TEST_ID, TEST_NAME FROM TEST_USER");
        if (resultSet.getFetchSize() == 1 && resultSet.next()) {
            Integer idDB = resultSet.getInt("TEST_ID");
            String nameDB = resultSet.getString("TEST_NAME");
            assertEquals(id, idDB);
            assertEquals(name, nameDB);
        } else {
            throw new Exception("no user found");
        }
    }

    @Test
    public void bridgeInheritanceTest() {
        CircleInheritance circleInheritance = new BlueCircleInheritance();
        SquareInheritance squareInheritance = new RedSquareInheritance();
        SquareInheritance squareInheritanceGreen = new GreenSquareInheritance();
        circleInheritance.applyColor();
        squareInheritance.applyColor();
        squareInheritanceGreen.applyColor();
    }


    @Test
    public void bridgeCompositionTest() {
        // All shapes and colors can change and can be added independent from other side

        ColorComposition blue = new Blue();
        ShapeComposition square = new SquareComposition(blue);

        ColorComposition red = new Red();
        ShapeComposition circle = new CircleComposition(red);

        ColorComposition green = new Green();
        ShapeComposition circleGreen = new CircleComposition(green);
        ShapeComposition squareGreen = new SquareComposition(green);

        square.applyColor();
        circle.applyColor();
        circleGreen.applyColor();
        squareGreen.applyColor();

    }

    @Test
    public void bridgeEntertainmentTest() {
        // Printer(s) and Formatter(s) can change independent from each others

        // movie object for examples
        Movie movie = new Movie();
        movie.setClassification("SciFi");
        movie.setRuntime("2:30");
        movie.setTitle("Balthazar");
        movie.setYear("1972");

        // create a movie printer and a christmas printer
        Printer moviePrinter = new MoviePrinter(movie);
        Printer christmasPrinter = new ChristmasPrinter(movie);

        // create printer formatter
        Formatter printFormatter = new PrintFormatter();
        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println("printedMaterial:\n" + printedMaterial);

        // create html formatter
        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println("htmlMaterial = " + htmlMaterial);

        // create json formatter
        Formatter jsonFormatter = new JsonFormatter();
        String jsonMaterial = moviePrinter.print(jsonFormatter);
        System.out.println("movie jsonMaterial = " + jsonMaterial);
        // christmas json
        jsonMaterial = christmasPrinter.print(jsonFormatter);
        System.out.println("christmas jsonMaterial = " + jsonMaterial);

    }

}
