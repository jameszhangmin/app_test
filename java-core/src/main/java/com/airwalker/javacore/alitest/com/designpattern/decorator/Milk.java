package com.airwalker.javacore.alitest.com.designpattern.decorator;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class Milk extends CondimentDecorator{
    /**
     * 保留一个被装饰者的引用
     */
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .50 + beverage.cost();
    }
}
