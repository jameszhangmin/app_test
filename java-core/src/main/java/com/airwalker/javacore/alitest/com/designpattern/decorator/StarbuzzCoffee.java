package com.airwalker.javacore.alitest.com.designpattern.decorator;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        System.out
                .println(beverage2.getDescription() + " $" + beverage2.cost());

//        Beverage beverage3 = new HouseBlend();
//        beverage3 = new Soy(beverage2);
//        beverage3 = new Mocha(beverage2);
//        beverage3 = new Whip(beverage2);
//        System.out
//                .println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}