package com.lucifer.principle.DependecyInversion;

public class improve {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new WeiXin());
        person.receive(new Email());
    }
}



//定义接口

interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

//增加微信
class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}

class Person {
//这里我们是对接口的依赖
    public void receive(IReceiver receiver ) {
        System.out.println(receiver.getInfo());
    }
}