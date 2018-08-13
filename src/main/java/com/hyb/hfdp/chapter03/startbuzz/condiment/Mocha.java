package com.hyb.hfdp.chapter03.startbuzz.condiment;

import com.hyb.hfdp.chapter03.startbuzz.coffee.BaseBeverage;

/**
 * 摩卡调料装饰者
 *
 * @author HYB
 * @since 2018/8/12 14:39
 **/
public class Mocha extends BaseCondiment {

    private BaseBeverage baseBeverage;

    private String description = "Unknown BaseBeverage";

    public Mocha(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
        this.description = "Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + baseBeverage.cost();
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", Mocha";
    }

//    @Override
//    public String toString() {
//        return getDescription();
//    }


}
