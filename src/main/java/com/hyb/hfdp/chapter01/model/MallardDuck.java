package com.hyb.hfdp.chapter01.model;

/**
 * @author HYB
 * @since 2018/8/5 21:53
 **/
public class MallardDuck extends Duck {
    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new QuackSqueak());
    }
}
