package com.lucifer.A02_SimpleFactory.pizza;

public class GreekPizza extends pizza{
    @Override
    public void prepare() {
        System.out.println("希腊pizza准备原材料");
    }
}
