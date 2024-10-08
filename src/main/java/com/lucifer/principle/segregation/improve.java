package com.lucifer.principle.segregation;

public class improve {


    public static void main(String[] args) {
        A a = new A();
        C c = new C();

        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());
    }





}

//接口1
interface interface1 {
    void operation1();
}

//接口2
interface interface2 {
    void operation2();
    void operation3();
}

//接口3
interface interface3 {
    void operation4();
    void operation5();
}

class B implements interface1,interface2{

    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B 实现了 operation2");

    }

    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}


class D implements interface1,interface3{

    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    public void operation4() {
        System.out.println("D 实现了 operation4");

    }

    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}


class A{
    public void depend1(interface1 i){
        i.operation1();
    }

    public void depend2(interface2 i){
        i.operation2();
    }

    public void depend3(interface2 i){
        i.operation3();
    }
}



class C{
    public void depend1(interface1 i){
        i.operation1();
    }

    public void depend2(interface3 i){
        i.operation4();
    }

    public void depend3(interface3 i){
        i.operation5();
    }
}