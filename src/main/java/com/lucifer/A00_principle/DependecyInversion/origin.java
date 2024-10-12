package com.lucifer.A00_principle.DependecyInversion;
public class origin {

public static void main(String[] args) {
    Person1 person = new Person1();
    person.receive(new Email1());
    }
}
class Email1 {
    public String getInfo() {

        return "电子邮件信息: hello,world";
    }
}
//完成 Person 接收消息的功能

//方式 1 分析

//问题： 如果我们获取的对象是 微信，短信等等，则新增类，同时 Perons 也要增加相应的接收方法

// 解决思路：引入一个抽象的接口 IReceiver, 表示接收者, 这样 Person 类与接口 IReceiver 发生依赖

// 因为 Email, WeiXin 等等属于接收的范围，他们各自实现 IReceiver 接口就 ok, 这样我们就符号依赖倒转原则

class Person1 {
    public void receive(Email1 email ) {

        System.out.println(email.getInfo());
    }
}