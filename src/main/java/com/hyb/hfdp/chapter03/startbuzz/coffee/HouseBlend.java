package com.hyb.hfdp.chapter03.startbuzz.coffee;

/**
 * 综合咖啡
 *
 * @author HYB
 * @since 2018/8/12 14:34
 **/
public class HouseBlend extends BaseBeverage {
    public HouseBlend() {
        setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
