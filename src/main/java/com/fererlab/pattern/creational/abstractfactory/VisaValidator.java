package com.fererlab.pattern.creational.abstractfactory;

public class VisaValidator extends Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }

}
