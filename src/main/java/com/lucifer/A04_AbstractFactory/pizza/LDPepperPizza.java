package com.lucifer.A04_AbstractFactory.pizza;

public class LDPepperPizza extends pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦胡椒pizza准备原材料");
    }
}
