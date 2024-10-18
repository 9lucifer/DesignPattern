package com.lucifer.A07_Adapter.classAdapter;
//适配器
public class voltageAdapter extends voltage220v implements Ivoltage5v{
    public int output5v() {
        int src = output220v();
        int dst = src/44;
        return dst;
    }
}
