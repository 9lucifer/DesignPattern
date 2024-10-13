package com.lucifer.A04_AbstractFactory.pizza;

public class LDGreekPizza extends pizza {

    @Override
    public void prepare() {
        setName("伦敦的希腊pizza");
        System.out.println("伦敦希腊pizza准备原材料");
    }
}
