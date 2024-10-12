package com.lucifer.A02_SimpleFactory.origin.order;

import com.lucifer.A02_SimpleFactory.pizza.GreekPizza;
import com.lucifer.A02_SimpleFactory.pizza.cheseePizza;
import com.lucifer.A02_SimpleFactory.pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {




    //构造器
    public OrderPizza(){
        pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName(orderType);

                //输出pizza的制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else if(orderType.equals("chesee")){
                pizza = new cheseePizza();
            }else {
                break;
            }
        }while (true);


    }


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
