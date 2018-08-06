package com.hyb.hfdp.chapter01.model;

/**
 * @author HYB
 * @since 2018/8/5 21:52
 **/
public class QuackSqueak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
