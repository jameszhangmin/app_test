package com.airwalker.javacore.alitest.com.designpattern.decorator;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class Mocha extends CondimentDecorator{
    /**
     * 保留一个被装饰者的引用
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
