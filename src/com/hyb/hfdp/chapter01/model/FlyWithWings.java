package com.hyb.hfdp.chapter01.model;

/**
 * @author HYB
 * @since 2018/8/5 21:49
 **/
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("flying");
    }
}
