package com.fererlab.pattern.creational.abstractfactory;

public class VisaPlatinumValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
