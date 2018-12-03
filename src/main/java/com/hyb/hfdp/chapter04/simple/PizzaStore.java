package com.hyb.hfdp.chapter04.simple;

import com.hyb.hfdp.chapter04.pizzamodule.Pizza;

/**
 * TODO
 *
 * @author HYB
 * @since 2018/11/11 16:16
 **/
public class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza =  pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
