package com.lucifer.A07_Adapter.interfaceAdapter;

public class client_m1 {
    public static void main(String[] args) {
        absAdatpter absAdatpter = new absAdatpter(){
          //只需要关系需要使用的方法
          public void m1(){
              System.out.println("使用了m1的方法");
          }
        };
        absAdatpter.m1();

    }
}
