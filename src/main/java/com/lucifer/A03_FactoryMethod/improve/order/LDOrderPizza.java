package com.lucifer.A03_FactoryMethod.improve.order;

import com.lucifer.A03_FactoryMethod.improve.OrderPizza;
import com.lucifer.A03_FactoryMethod.pizza.BJcheseePizza;
import com.lucifer.A03_FactoryMethod.pizza.LDGreekPizza;
import com.lucifer.A03_FactoryMethod.pizza.LDPepperPizza;
import com.lucifer.A03_FactoryMethod.pizza.pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    protected pizza createPizza(String orderType) {
        pizza pizza = null;
        if(orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
