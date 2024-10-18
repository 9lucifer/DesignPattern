package com.lucifer.A07_Adapter.classAdapter;
//被适配的类
public class voltage220v {
    //输出220v的电压
    public int output220v(){
        int src = 220;
        System.out.println("电压="+src);
        return src;
    }
}
