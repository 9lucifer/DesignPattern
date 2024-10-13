package com.lucifer.A04_AbstractFactory.pizza;

public class BJcheseePizza extends pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println("北京奶酪pizza准备原材料");
    }
}
