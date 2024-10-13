package com.lucifer.A04_AbstractFactory.improve.order;

import com.lucifer.A04_AbstractFactory.pizza.BJGreekPizza;
import com.lucifer.A04_AbstractFactory.pizza.BJcheseePizza;
import com.lucifer.A04_AbstractFactory.pizza.pizza;
//北京工厂子类
public class BJFactory implements AbsFactory{
    public pizza createPizza(String orderType) {
        pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJcheseePizza();
        }else if(orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
