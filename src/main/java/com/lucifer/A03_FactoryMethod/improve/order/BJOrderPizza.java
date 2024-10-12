package com.lucifer.A03_FactoryMethod.improve.order;

import com.lucifer.A03_FactoryMethod.improve.OrderPizza;
import com.lucifer.A03_FactoryMethod.pizza.BJGreekPizza;
import com.lucifer.A03_FactoryMethod.pizza.BJcheseePizza;
import com.lucifer.A03_FactoryMethod.pizza.pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    protected pizza createPizza(String orderType) {
        pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJcheseePizza();
        }else if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
