package com.fererlab.pattern.creational.abstractfactory;

import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class AbstractFactoryTester {

    @Test
    public void testAbstractFactory() {
        // create an abstract factory
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(500);
        // create a credit card
        CreditCard creditCard1 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println("creditCard 1 = " + creditCard1);
        assertNotNull(creditCard1);
        assertTrue(com.fererlab.pattern.creational.abstractfactory.VisaGoldCard.class.isAssignableFrom(creditCard1.getClass()));

        // create a new abstract factory
        abstractFactory = CreditCardFactory.getCreditCardFactory(1000);
        // create a credit card
        CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println("creditCard 2 = " + creditCard2);
        assertTrue(com.fererlab.pattern.creational.abstractfactory.AmexPlatinumCard.class.isAssignableFrom(creditCard2.getClass()));
    }

    @Test
    public void testInternalAbstractFactory() throws ParserConfigurationException, IOException, SAXException {
        // although the abstract classes and/or interfaces implemented inside the Java APIs
        // abstract factory creational design pattern is mostly implemented by frameworks, like apache.xerces

        // this static method creates a new factory instance.
        // Use the system property first
        // try to read from $java.home/lib/jaxp.properties
        // Try Jar Service Provider Mechanism
        // if cannot find any, throw new FactoryConfigurationError("Provider for " + factoryId + " cannot be found");
        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        System.out.println("abstractFactory = " + abstractFactory);
        assertNotNull(abstractFactory);
        assertTrue(com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl.class.isAssignableFrom(abstractFactory.getClass()));

        // something like new DocumentBuilderImpl(...)
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();
        System.out.println("factory = " + factory);
        assertNotNull(factory);
        assertTrue(com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl.class.isAssignableFrom(factory.getClass()));

        // newDocument() method is abstract, it is implemented by selected factory
        // something like new com.sun.org.apache.xerces.internal.dom.DocumentImpl();
        Document newDocument = factory.newDocument();
        assertNotNull(newDocument);

        // or parse a document, parse method will call the "public abstract Document parse(InputSource is)" method
        // com.sun.org.apache.xerces.internal.parsers.DOMParser might be used
        Document parsedDocument = factory.parse("pom.xml");
        assertEquals(parsedDocument.getDocumentElement().getNodeName(), "project");

    }

}
