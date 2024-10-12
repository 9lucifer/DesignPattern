package com.lucifer.A00_principle.liskov;

public class liskov {
        public static void main(String[] args) {
            A a = new A();
            System.out.println("11-3=" + a.func1(11, 3));
            System.out.println("1-8=" + a.func1(1, 8));
            System.out.println("-----------------------");
            B b = new B();
            System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出 11-3
            System.out.println("1-8=" + b.func1(1, 8));// 1-8
            System.out.println("11+3+9=" + b.func2(11, 3));
        }
}


class A{
    public int func1(int num1,int num2){
        return - num1 + num2;
    }
}

//B类继承了A，但是重写了A内部的方法
class B extends A{
    public int func1(int num1,int num2){
        return num1 + num2;
    }

    public int func2(int num1,int num2){
        return func1(2,3)+9;
    }

}

