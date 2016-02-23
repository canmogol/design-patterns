package com.fererlab.pattern.creational.abstractfactory;

public class VisaGoldValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
