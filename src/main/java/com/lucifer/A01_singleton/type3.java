package com.lucifer.A01_singleton;

public class type3 {
    public static void main(String[] args) {
        System.out.println("懒汉式1：线程不安全，实际的开发是不适用的");
        singleton03 instance0 = singleton03.getInstance();
        singleton03 instance1 = singleton03.getInstance();
        System.out.println(instance1 == instance0);
    }
}

class singleton03{
    private static singleton03 instance;

    private singleton03(){}

    //提供静态的共有方法，只有在使用这个方法的时候才去创建
    public static singleton03 getInstance(){
        if(instance == null){
            instance = new singleton03();
        }
        return instance;
    }
}
