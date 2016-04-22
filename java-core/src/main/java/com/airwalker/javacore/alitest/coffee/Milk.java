package com.airwalker.javacore.alitest.coffee;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class Milk extends Condiment {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDes() {
        return coffee.getDes() + ",milk";
    }

    public Double cost() {
        return 0.5+coffee.cost();
    }
}
