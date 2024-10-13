package com.lucifer.A04_AbstractFactory.improve.order;

import com.lucifer.A04_AbstractFactory.pizza.*;

//伦敦工厂子类
public class LDFactory implements AbsFactory{
    public pizza createPizza(String orderType) {
        pizza pizza = null;
        if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }else if(orderType.equals("greek")){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
