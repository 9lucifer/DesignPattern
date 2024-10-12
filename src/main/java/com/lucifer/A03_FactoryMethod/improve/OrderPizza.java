package com.lucifer.A03_FactoryMethod.improve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.lucifer.A03_FactoryMethod.pizza.pizza;

public abstract class OrderPizza {


    public OrderPizza(){
        pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            //输出pizza的信息
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.bake();


        }while (true);

    }


    //定义一个抽象方法，让各个工厂子类自己去实现
    protected abstract pizza createPizza(String orderType);



    //写一个可以动态获取pizza种类的方法
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
