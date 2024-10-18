package com.lucifer.A07_Adapter.objectAdapter;

//适配器
public class voltageAdapter implements Ivoltage5v {
    private voltage220v voltage220v;

    //通过构造器传入--聚合关系
    public voltageAdapter(com.lucifer.A07_Adapter.objectAdapter.voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    public int output5v() {
        int dst = 0;
        if(null!=voltage220v){
            int src = voltage220v.output220v();
            System.out.println("使用对象适配器进行转化");
            dst = src/44;
            System.out.println("适配完成");
            return dst;
        }else {
            return 0;
        }
    }
}
