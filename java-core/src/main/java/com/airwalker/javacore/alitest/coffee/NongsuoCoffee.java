package com.airwalker.javacore.alitest.coffee;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class NongsuoCoffee extends Coffee {
    public NongsuoCoffee(){
        des="nongsuo";
    }
    @Override
    public Double cost() {
        return 1.50;
    }
}
