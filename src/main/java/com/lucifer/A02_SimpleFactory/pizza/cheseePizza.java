package com.lucifer.A02_SimpleFactory.pizza;

public class cheseePizza extends pizza{
    @Override
    public void prepare() {
        System.out.println("奶酪pizza准备原材料");
    }
}
