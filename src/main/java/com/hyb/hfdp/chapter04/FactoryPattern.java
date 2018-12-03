package com.hyb.hfdp.chapter04;

import com.hyb.hfdp.chapter04.simple.PizzaStore;
import com.hyb.hfdp.chapter04.simple.SimplePizzaFactory;
import org.junit.Test;

/**
 * 工厂模式
 *
 * @author HYB
 * @since 2018/10/23 10:55
 **/
public class FactoryPattern {

    /**
     * 简单工厂模式
     */
    @Test
    public void simpleFactory() {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese");
    }
}
