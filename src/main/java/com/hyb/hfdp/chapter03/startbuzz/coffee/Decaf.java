package com.hyb.hfdp.chapter03.startbuzz.coffee;

/**
 * 低咖啡因
 *
 * @author HYB
 * @since 2018/8/12 14:37
 **/
public class Decaf extends BaseBeverage {

    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
