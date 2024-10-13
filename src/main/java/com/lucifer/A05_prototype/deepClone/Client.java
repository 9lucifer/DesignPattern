package com.lucifer.A05_prototype.deepClone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("方式一完成：");
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "lucifer";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("lucifer的子类","lucifer子类的类");
        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.clone();
        System.out.println(deepPrototype1.deepCloneableTarget.hashCode());
        System.out.println(deepPrototype.deepCloneableTarget.hashCode());

        System.out.println("方式二完成：");
        DeepPrototype deepPrototype2 = (DeepPrototype) deepPrototype.deepClone();
        System.out.println(deepPrototype2.deepCloneableTarget.hashCode());

    }
}
