package com.lucifer.A01_singleton;

public class type5 {
    public static void main(String[] args) {
        System.out.println("懒汉式3：有考虑到线程安全，是对第四种类型的改进，但是没能改进，反而线程可能还是不安全的");
        singleton05 instance0 = singleton05.getInstance();
        singleton05 instance1 = singleton05.getInstance();
        System.out.println(instance1 == instance0);
    }
}

class singleton05{
    private static singleton05 instance;

    private singleton05(){}

    //提供静态的共有方法，只有在使用这个方法的时候才去创建
    //加入了同步处理的代码
    public static  singleton05 getInstance(){
        if(instance == null){
            //这边还是会进入if，导致线程的不安全
            synchronized(singleton05.class){
                instance = new singleton05();
            }
        }
        return instance;
    }
}
