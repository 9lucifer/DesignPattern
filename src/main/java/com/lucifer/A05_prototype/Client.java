package com.lucifer.A05_prototype;

//传统的方法就是直接复制，代码量过大
public class Client {


    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("tom",12,"白色");
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep2);

    }

}
