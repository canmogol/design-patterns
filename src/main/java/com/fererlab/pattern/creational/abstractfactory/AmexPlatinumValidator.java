package com.fererlab.pattern.creational.abstractfactory;

public class AmexPlatinumValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
