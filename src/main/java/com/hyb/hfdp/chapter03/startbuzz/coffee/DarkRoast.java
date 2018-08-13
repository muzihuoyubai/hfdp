package com.hyb.hfdp.chapter03.startbuzz.coffee;

/**
 * 深焙咖啡
 *
 * @author HYB
 * @since 2018/8/12 14:37
 **/
public class DarkRoast extends BaseBeverage {

    public DarkRoast() {
        setDescription("DarkRoast");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
