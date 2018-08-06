package com.hyb.hfdp.chapter01.model;

/**
 * @author HYB
 * @since 2018/8/5 21:51
 **/
public class QuackQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack");
    }
}
