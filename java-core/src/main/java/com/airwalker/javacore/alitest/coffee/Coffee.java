package com.airwalker.javacore.alitest.coffee;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public abstract class Coffee {
    protected String des = "UNKNOWN";
    public String getDes(){
        return des;
    }
    public abstract Double cost();

}
