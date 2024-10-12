package com.lucifer.A01_singleton;

public class type6 {
    public static void main(String[] args) {
        System.out.println("双重检查方式");
        singleton06 instance0 = singleton06.getInstance();
        singleton06 instance1 = singleton06.getInstance();
        System.out.println(instance1 == instance0);
    }
}

class singleton06{
    //
    private static volatile singleton06 instance;

    private singleton06(){}

    //提供静态的共有方法，加入双重检查机制，同时解决懒加载的问题
    //保证了效率的问题，在开发中是推荐使用6

    public static synchronized singleton06 getInstance(){
        if(instance == null){
           synchronized (singleton06.class){
               if(instance == null){
                   instance = new singleton06();
               }
           }
        }
        return instance;
    }
}
