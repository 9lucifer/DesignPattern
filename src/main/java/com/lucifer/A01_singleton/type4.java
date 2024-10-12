package com.lucifer.A01_singleton;

public class type4 {
    public static void main(String[] args) {
        System.out.println("懒汉式2：线程安全.但是效率低，开发时不推荐");
        singleton04 instance0 = singleton04.getInstance();
        singleton04 instance1 = singleton04.getInstance();
        System.out.println(instance1 == instance0);
    }
}

class singleton04{
    private static singleton04 instance;

    private singleton04(){}

    //提供静态的共有方法，只有在使用这个方法的时候才去创建
    //加入了同步处理的代码
    public static synchronized singleton04 getInstance(){
        if(instance == null){
            instance = new singleton04();
        }
        return instance;
    }
}
