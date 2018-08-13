package com.hyb.hfdp.chapter03.startbuzz.coffee;

/**
 * 浓缩咖啡
 *
 * @author HYB
 * @since 2018/8/12 14:33
 **/
public class Espresso extends BaseBeverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
