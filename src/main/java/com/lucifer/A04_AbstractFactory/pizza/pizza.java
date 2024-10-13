package com.lucifer.A04_AbstractFactory.pizza;

//pizza类是抽象类
public abstract class pizza {
    protected String name;
    //准备原材料，不同的pizza是不同的，所以是做成抽象类
    public abstract void prepare();

    public void bake(){
        System.out.println(name+" baking");
    }

    public void cut(){
        System.out.println(name+" cutting");
    }

    //打包
    public void box(){
        System.out.println(name+" boxing");
    }

    public void setName(String name){
        this.name = name;
    }

}
