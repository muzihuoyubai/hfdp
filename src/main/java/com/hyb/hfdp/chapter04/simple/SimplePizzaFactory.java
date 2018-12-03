package com.hyb.hfdp.chapter04.simple;

import com.hyb.hfdp.chapter04.pizzamodule.CheesePizza;
import com.hyb.hfdp.chapter04.pizzamodule.ClamPizza;
import com.hyb.hfdp.chapter04.pizzamodule.Pizza;

/**
 * 简单工厂
 *
 * @author HYB
 * @since 2018/11/11 16:16
 **/
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();
            case "clam":
                return new ClamPizza();
            default:
                return new Pizza();
        }
    }
}
