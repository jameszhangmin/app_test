package com.airwalker.javacore.alitest.coffee;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class JiaoTangCoffee extends Coffee {
    public JiaoTangCoffee(){
        des = "jiaotang";
    }
    @Override
    public Double cost() {
        return 1.00;
    }
}
