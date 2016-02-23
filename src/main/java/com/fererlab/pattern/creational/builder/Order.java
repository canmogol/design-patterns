package com.fererlab.pattern.creational.builder;

/**
 * immutable Order class
 */
public class Order {

    private String bread;
    private String salad;
    private String meat;

    /**
     * Builder for immutable Order class
     */
    public static class Builder {

        private String bread;
        private String salad;
        private String meat;

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder salad(String salad) {
            this.salad = salad;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    /**
     * private constructor to force to use of Builder
     * @param builder Builder instance
     */
    private Order(Builder builder) {
        this.bread = builder.bread;
        this.salad = builder.salad;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getSalad() {
        return salad;
    }

    public String getMeat() {
        return meat;
    }
}
