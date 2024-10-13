package com.lucifer.A04_AbstractFactory;


import com.lucifer.A04_AbstractFactory.improve.order.BJFactory;
import com.lucifer.A04_AbstractFactory.improve.order.orderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        //第一次出现了空指针，经过检查发现是一个变量写错了·
        new orderPizza( new BJFactory());
    }
}
