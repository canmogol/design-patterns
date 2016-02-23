package com.fererlab.pattern.creational.abstractfactory;

public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD: {
                return new AmexGoldCard();
            }
            case PLATINUM: {
                return new AmexPlatinumCard();
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
                return new AmexGoldValidator();
            }
            case PLATINUM: {
                return new AmexPlatinumValidator();
            }
        }
        return null;
    }
}
