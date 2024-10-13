package com.lucifer.A04_AbstractFactory.improve.order;

import com.lucifer.A04_AbstractFactory.pizza.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class orderPizza {

    public orderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }

    AbsFactory factory;

    private void setFactory (AbsFactory absFactory){
        pizza pizza  = null;
        String orderType = "";
        this.factory = absFactory;

        do {
            orderType = getType();
            //这边可能是北京的，也可能是伦敦的
            pizza = factory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
        }while (true);
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
