package com.hyb.hfdp.chapter05.impl;

import com.hyb.hfdp.chapter05.SingletonInstance;

/**
 * 饿汉的非线程安全的单例模式
 *
 * @author HYB
 * @since 2018/12/3 22:49
 **/
public class HungaryUnsafe extends SingletonInstance {

    private static SingletonInstance singletonInstance;

    private HungaryUnsafe() {
    }

    public static SingletonInstance getInstance() {

        if (singletonInstance == null) {
            singletonInstance = new HungaryUnsafe();
        }
        return singletonInstance;
    }
}
