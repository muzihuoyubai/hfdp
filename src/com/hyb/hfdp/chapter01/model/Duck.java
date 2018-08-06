package com.hyb.hfdp.chapter01.model;

import com.hyb.hfdp.chapter01.model.AbstractDuck;

/**
 * @author HYB
 * @since 2018/8/5 21:55
 **/
public class Duck extends AbstractDuck {
    public Duck() {
        super();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName());
    }
}
