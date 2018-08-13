package com.hyb.hfdp.chapter03.startbuzz.condiment;

import com.hyb.hfdp.chapter03.startbuzz.coffee.BaseBeverage;

/**
 * 奶泡调料装饰者
 *
 * @author HYB
 * @since 2018/8/12 14:39
 **/
public class Whip extends BaseCondiment {

    private BaseBeverage baseBeverage;

    public Whip(BaseBeverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public double cost() {
        return 0.10 + baseBeverage.cost();
    }

    @Override
    public String getDescription() {
        return baseBeverage.getDescription() + ", Whip";
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
