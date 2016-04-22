package com.airwalker.javacore.alitest.com.designpattern.decorator;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return .99;
    }
}
