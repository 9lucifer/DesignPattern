package com.lucifer.A01_singleton;

public class type2 {
    public static void main(String[] args) {
        //test
        Singleton02 instance0 = Singleton02.getInstance();
        Singleton02 instance1 = Singleton02.getInstance();
        System.out.println(instance1 == instance0);

        //res : true
    }
}


//饿汉式（静态代码块）
class Singleton02{
    // 1.构造器私有化，外部不可以new
    private Singleton02(){}
    // 2.内部创建对象实例
    private  static Singleton02 instance;
    // 3.静态代码块里面创建单例对象
    static {
        instance = new Singleton02();
    }
    // 4.对外提供共有的方法
    public static Singleton02 getInstance(){
        return instance;
    }

}
