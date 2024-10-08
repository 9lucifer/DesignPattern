package com.lucifer.principle.segregation;

/**
 * 接口隔离原则
 * 介绍：该文件是演示接口不满足单一接口原则的情况，可以看出多实现了两个函数，是不需要的，所以对接口进行了拆分
 */

public class origin {


    public static void main(String[] args) {
        A1 a = new A1();
        C1 c = new C1();

        a.depend1(new B1());
        a.depend2(new B1());
        a.depend3(new B1());

        c.depend1(new D1());
        c.depend2(new D1());
        c.depend3(new D1());
    }





}

//接口1
interface interface0 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}


class B1 implements interface0{

    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");

    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

public void operation4() {
        System.out.println("D 实现了 operation4");

        }

public void operation5() {
        System.out.println("D 实现了 operation5");
        }
}


class D1 implements interface0{

    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");

    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

    public void operation4() {
        System.out.println("D 实现了 operation4");

    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}


class A1{
    public void depend1(interface0 i){
        i.operation1();
    }

    public void depend2(interface0 i){
        i.operation2();
    }

    public void depend3(interface0 i){
        i.operation3();
    }
}



class C1{
    public void depend1(interface0 i){
        i.operation1();
    }

    public void depend2(interface0 i){
        i.operation4();
    }

    public void depend3(interface0 i){
        i.operation5();
    }
}