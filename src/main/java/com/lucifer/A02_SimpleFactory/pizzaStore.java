package com.lucifer.A02_SimpleFactory;

import com.lucifer.A02_SimpleFactory.improve.OrderPizza02;
import com.lucifer.A02_SimpleFactory.improve.SimpleFactory;

public class pizzaStore {
    public static void main(String[] args) {
        new OrderPizza02(new SimpleFactory());
        System.out.println("退出程序");
    }
}
