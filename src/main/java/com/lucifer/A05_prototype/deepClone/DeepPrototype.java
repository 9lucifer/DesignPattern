package com.lucifer.A05_prototype.deepClone;

import java.io.*;

public class DeepPrototype implements Serializable ,Cloneable{
    public String name;
    public DeepCloneableTarget deepCloneableTarget;//殷勇类型
    public DeepPrototype(){
        super();
    }

    //方式一完成深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成基本属性的克隆
        deep = super.clone();
        //对引用类型单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deep;
    }


    //方式二完成(推荐)
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype CopyObject = (DeepPrototype) ois.readObject();
            return CopyObject;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            try{
                //关闭流
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }

}
