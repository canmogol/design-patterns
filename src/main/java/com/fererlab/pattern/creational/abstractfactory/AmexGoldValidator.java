package com.fererlab.pattern.creational.abstractfactory;

public class AmexGoldValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
