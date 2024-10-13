package com.lucifer.A04_AbstractFactory.improve.order;

import com.lucifer.A04_AbstractFactory.pizza.pizza;

//抽象工厂模式的抽象层
public interface AbsFactory  {
    //让下面的工厂子类去具体实现
    public abstract pizza createPizza(String orderType);
}
