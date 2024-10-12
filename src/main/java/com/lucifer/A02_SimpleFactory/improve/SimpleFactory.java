package com.lucifer.A02_SimpleFactory.improve;

import com.lucifer.A02_SimpleFactory.pizza.GreekPizza;
import com.lucifer.A02_SimpleFactory.pizza.cheseePizza;
import com.lucifer.A02_SimpleFactory.pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFactory {
    //根据orderType返回对应的对象实例
    public pizza createPizza(String orderType){
        pizza pizza = null;
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName(orderType);
            }else if(orderType.equals("chesee")){
                pizza = new cheseePizza();
            }
        return pizza;
    }

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
