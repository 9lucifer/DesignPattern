package com.lucifer.A01_singleton;

public class type1 {
    public static void main(String[] args) {
        //test
        Singleton instance0 = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance0);

        //res : true
    }
}


//饿汉式（静态变量）
class Singleton{
    // 1.构造器私有化，外部不可以new
    private Singleton(){}
    // 2.内部创建对象实例
    private final static Singleton instance = new Singleton();
    // 3.对外提供共有的方法
    public static Singleton getInstance(){
        return instance;
    }

}
