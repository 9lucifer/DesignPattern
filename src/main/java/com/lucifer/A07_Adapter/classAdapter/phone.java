package com.lucifer.A07_Adapter.classAdapter;

public class phone {
    //充电方法
    public void charging(Ivoltage5v ivoltage5v){
        if(ivoltage5v.output5v() == 5){
            System.out.println("可以充电了");
        }else{
            System.out.println("不合适于充电");
        }
    }
}
