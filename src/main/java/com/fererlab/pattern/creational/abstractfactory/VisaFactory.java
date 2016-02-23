package com.fererlab.pattern.creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD: {
                return new VisaGoldCard();
            }
            case PLATINUM: {
                return new VisaPlatinumCard();
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case GOLD: {
                return new VisaGoldValidator();
            }
            case PLATINUM: {
                return new VisaPlatinumValidator();
            }
        }
        return null;
    }

}
