package com.airwalker.javacore.alitest.coffee;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class CoffeeTest {
    public static void main(String[] args) {
        Coffee c1 = new JiaoTangCoffee();
        System.out.println(c1.getDes() + " : " + c1.cost());

        Coffee c2 = new NongsuoCoffee();
        c2 = new Milk(c2);
        c2 = new Mocha(c2);
        System.out.println(c2.getDes() + " : " + c2.cost());
    }
}
