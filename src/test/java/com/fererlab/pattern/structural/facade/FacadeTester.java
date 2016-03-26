package com.fererlab.pattern.structural.facade;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

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
}
