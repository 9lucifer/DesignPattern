package com.lucifer.A03_FactoryMethod;


import com.lucifer.A03_FactoryMethod.improve.order.BJOrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        //创建北京口味的各种pizza
        new BJOrderPizza();
    }
}
