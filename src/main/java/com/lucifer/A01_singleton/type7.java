package com.lucifer.A01_singleton;

public class type7 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类实现单例模式");
        singleton07 instance0 = singleton07.getInstance();
        singleton07 instance1 = singleton07.getInstance();
        System.out.println(instance1 == instance0);
    }
}
//使用静态内部类去完成
class singleton07{
    //
    private static volatile singleton06 instance;

    private singleton07(){}

    //写一个静态内部类，在这个类里面有静态的属性
    private static class SingletonInstance{
        private static final singleton07 INSTANCE = new singleton07();
    }

    //提供一个静态的公有方法，直接返回该实例
    public static synchronized singleton07 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
