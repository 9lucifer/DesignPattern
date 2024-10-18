package com.lucifer.A08_Bridge;

public abstract class phone {
    private Brand brand;
    public phone(Brand brand){
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
