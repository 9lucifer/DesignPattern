package com.lucifer.A01_singleton;

public class type8 {
    //为什么可以用枚举来实现单例模式：
    //  1、可以避免多线程
    //  2、防止反序列化重新创建对象
    //      所以推荐使用

    public static void main(String[] args) {
        System.out.println("枚举类实现单例模式");
        singleton08 instance1 = singleton08.INSTANCE;
        singleton08 instance2 = singleton08.INSTANCE;
        System.out.println(instance2 == instance1);
    }
}

enum singleton08{
    INSTANCE; //属性
    public void sayOK(){
        System.out.println("ok~");
    }
}
