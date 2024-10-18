package com.lucifer.A08_Bridge;
//折叠式手机
public class FoldedPhone extends phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }
    @Override
    protected void open() {
        super.open();
        System.out.println("折叠手机打开");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机关机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }
}

