package com.hyb.hfdp.chapter03;

import com.hyb.hfdp.chapter03.startbuzz.coffee.BaseBeverage;
import com.hyb.hfdp.chapter03.startbuzz.coffee.DarkRoast;
import com.hyb.hfdp.chapter03.startbuzz.coffee.Espresso;
import com.hyb.hfdp.chapter03.startbuzz.condiment.Mocha;
import com.hyb.hfdp.chapter03.startbuzz.condiment.Whip;
import org.junit.Test;

/**
 * 装饰者模式
 * 设计原则
 * 开闭原则，类对扩展开放，对修改关闭
 *
 * @author HYB
 * @since 2018/8/12 0:07
 **/
public class DecoratorPattern {


    @Test
    public void orderOneCoffee() {
        BaseBeverage baseBeverage = new Espresso();
        System.out.println(baseBeverage);

        BaseBeverage mixBeverage = new DarkRoast();
        mixBeverage = new Mocha(mixBeverage);
//        mixBeverage = new Mocha(mixBeverage);
//        mixBeverage = new Whip(mixBeverage);
        System.out.println(mixBeverage);
    }
}
