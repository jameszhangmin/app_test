package com.airwalker.javacore.alitest.com.designpattern.decorator;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public abstract class Beverage {
    /**
     * 饮料的名称，用来代表是哪种饮料
     */
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 每个子类都有自己的实现方法
     * @return
     */
    public abstract double cost();
}
