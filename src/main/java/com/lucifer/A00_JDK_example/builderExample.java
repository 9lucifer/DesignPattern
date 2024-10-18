package com.lucifer.A00_JDK_example;

public class builderExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("hello world");
        //内部的append相关的方法佐证用了建造者模式
        System.out.println(stringBuilder);
    }
}
