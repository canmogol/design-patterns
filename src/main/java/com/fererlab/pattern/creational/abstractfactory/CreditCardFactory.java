package com.fererlab.pattern.creational.abstractfactory;

/**
 * Abstract Factory Example
 */
public abstract class CreditCardFactory {

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

}
