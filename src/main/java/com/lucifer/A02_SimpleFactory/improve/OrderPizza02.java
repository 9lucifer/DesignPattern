package com.lucifer.A02_SimpleFactory.improve;

import com.lucifer.A02_SimpleFactory.pizza.GreekPizza;
import com.lucifer.A02_SimpleFactory.pizza.cheseePizza;
import com.lucifer.A02_SimpleFactory.pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza02 {
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    pizza pizza = null;

    public OrderPizza02(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }
    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";//用户输入的
        this.simpleFactory = simpleFactory;//设置一个工厂
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if(pizza!=null){
                //输出pizza的信息
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.bake();
            }else {
                System.out.println("没有这个pizza哦~");
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
