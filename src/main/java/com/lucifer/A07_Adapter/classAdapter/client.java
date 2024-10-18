package com.lucifer.A07_Adapter.classAdapter;

public class client {
    public static void main(String[] args) {
        System.out.println("---类适配器模式---");
        phone phone = new phone();
        phone.charging(new voltageAdapter());
    }
}
