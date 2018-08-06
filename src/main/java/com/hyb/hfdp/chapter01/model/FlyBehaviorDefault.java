package com.hyb.hfdp.chapter01.model;

/**
 * 默认方法，不会飞
 *
 * @author HYB
 * @since 2018/8/5 19:31
 **/
public class FlyBehaviorDefault implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
