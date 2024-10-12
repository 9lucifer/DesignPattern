package com.lucifer.A00_principle.liskov;
//子类尽量不要重写父类的方法
//解决方法是二者同时继承一个更加基础的子类，原来的子类和父类之间进行聚合
public class improve {
        public static void main(String[] args) {
            A1 a = new A1();
            System.out.println("11-3=" + a.func1(11, 3));
            System.out.println("1-8=" + a.func1(1, 8));
            System.out.println("-----------------------");
            B1 b = new B1();
            System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出 11-3
            System.out.println("1-8=" + b.func2(1, 8));// 1-8
            System.out.println("11-3+9=" + b.func3(11, 3));
        }
}

class base{
    //base类里面放最基础的方法

}

class A1 extends base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

//B类继承了A，但是重写了A内部的方法
class B1 extends base{
    //如果B1里面需要用到A1里面的方法，可以使用聚合的方式
    private A1 a1 = new A1();

    public int func1(int num1,int num2){
        return num1 + num2;
    }

    public int func2(int num1,int num2){
        return func1(2,3);
    }

    //如果要任然使用A1种的方法
    public int func3(int a,int b){
        return this.a1.func1(a,b)+9;
    }
}

