package com.lucifer.A03_FactoryMethod.improve;

import com.lucifer.A03_FactoryMethod.pizza.BJGreekPizza;
import com.lucifer.A03_FactoryMethod.pizza.BJcheseePizza;
import com.lucifer.A03_FactoryMethod.pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFactory {
    //根据orderType返回对应的对象实例
    public pizza createPizza(String orderType){
        pizza pizza = null;
            if(orderType.equals("greek")){
                pizza = new BJGreekPizza();
                pizza.setName(orderType);
            }else if(orderType.equals("chesee")){
                pizza = new BJcheseePizza();
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
