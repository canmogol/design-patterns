package com.fererlab.pattern.structural.decorator;

import org.junit.Test;

import java.io.*;
import java.util.Random;

public class DecoratorTester {

    @Test
    public void everydayExample() throws IOException {
        File file = new File("./output.txt");
        if (file.createNewFile()) {
            // OutputStream is the Base Decorator
            // FileOutputStream is one of the ConcreteDecorator
            OutputStream outputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeChars("" + new Random().nextLong());
            dataOutputStream.close();
            outputStream.close();
        }
    }

    @Test
    public void decoratorTest(){
        // this is not to be confused as a creational pattern,
        // we add functionality to the simple sandwich that did not exists
        Sandwich sandwich = new GrillDecorator(new DressingDecorator(new MeatDecorator(new SimpleSandwich())));
        System.out.println("sandwich = " + sandwich.make());

        // multi liner with Component(interface, abstract class) type
        Sandwich simpleSandwich1 = new SimpleSandwich();
        Sandwich meatDecorator1 = new MeatDecorator(simpleSandwich1);
        Sandwich dressingDecorator1 = new DressingDecorator(meatDecorator1);
        Sandwich grillDecorator1 = new GrillDecorator(dressingDecorator1);
        System.out.println("sandwich = " + grillDecorator1.make());

        // multi liner with Decorator abstract class type
        Sandwich simpleSandwich2 = new SimpleSandwich();
        SandwichDecorator meatDecorator2 = new MeatDecorator(simpleSandwich2);
        SandwichDecorator dressingDecorator2 = new DressingDecorator(meatDecorator2);
        SandwichDecorator grillDecorator2 = new GrillDecorator(dressingDecorator2);
        System.out.println("sandwich = " + grillDecorator2.make());


    }

}
