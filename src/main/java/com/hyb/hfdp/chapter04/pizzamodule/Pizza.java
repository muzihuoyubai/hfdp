package com.hyb.hfdp.chapter04.pizzamodule;

/**
 * 披萨类，各种披萨继承这个披萨
 *
 * @author HYB
 * @since 2018/11/11 16:12
 **/
public class Pizza {

    public void prepare() {
        System.out.println("Pizza prepare:" + this.getClass().getSimpleName());
    }

    public void bake() {
        System.out.println("Pizza bake:" + this.getClass().getSimpleName());
    }

    public void cut() {
        System.out.println("Pizza cut:" + this.getClass().getSimpleName());
    }

    public void box() {
        System.out.println("Pizza box:" + this.getClass().getSimpleName());
    }
}
