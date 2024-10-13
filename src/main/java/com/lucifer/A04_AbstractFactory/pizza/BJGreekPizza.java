package com.lucifer.A04_AbstractFactory.pizza;

public class BJGreekPizza extends pizza {
    @Override
    public void prepare() {
        setName("北京的希腊pizza");
        System.out.println("北京希腊pizza准备原材料");
    }
}
