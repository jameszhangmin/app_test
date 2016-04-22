package com.airwalker.javacore.alitest.coffee;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class Mocha extends Condiment {
    Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDes() {
        return coffee.getDes() + ",mocha";
    }

    public Double cost() {
        return 0.2 + coffee.cost();
    }
}
