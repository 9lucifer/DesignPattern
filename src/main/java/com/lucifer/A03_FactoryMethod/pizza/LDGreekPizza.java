package com.lucifer.A03_FactoryMethod.pizza;

public class LDGreekPizza extends pizza {

    @Override
    public void prepare() {
        setName("伦敦的希腊pizza");
        System.out.println("伦敦希腊pizza准备原材料");
    }
}
