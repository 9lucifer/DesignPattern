package com.lucifer.A07_Adapter.objectAdapter;

public class client {
    public static void main(String[] args) {
        System.out.println("---类适配器模式---");
        phone phone = new phone();
        phone.charging(new voltageAdapter(new voltage220v()));
    }
}
