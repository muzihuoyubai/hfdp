package com.hyb.hfdp.chapter01.model;

/**
 * 默认叫的方法
 *
 * @author HYB
 * @since 2018/8/5 19:31
 **/
public class QuackBehaviorDefault implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("can't quack");
    }
}
