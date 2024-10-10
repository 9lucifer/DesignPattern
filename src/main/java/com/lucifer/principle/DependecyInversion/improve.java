package com.lucifer.principle.DependecyInversion;

//有三种实现依赖倒转的方式，个人理解：把接口注入到类里面的三种方式


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


//三种方式如下：
// 方式 1： 通过接口传递实现依赖

// interface IOpenAndClose {
// public void open(ITV tv); //抽象方法,接收接口

// }
//
// interface ITV { //ITV 接口

// public void play();
// }
//
// class ChangHong implements ITV {
//
// @Override
// public void play() {
// System.out.println("长虹电视机，打开");
// }
//
// }
//// 实现接口

// class OpenAndClose implements IOpenAndClose{
// public void open(ITV tv){
// tv.play();
// }
// }
// 方式 2: 通过构造方法依赖传递

// interface IOpenAndClose {

// public void open(); //抽象方法

// }
// interface ITV { //ITV 接口

// public void play();
// }
// class OpenAndClose implements IOpenAndClose{
// public ITV tv; //成员

// public OpenAndClose(ITV tv){ //构造器

// this.tv = tv;
// }
// public void open(){
// this.tv.play();
// }
// }
//// 方式 3 , 通过 setter 方法传递
//
//interface IOpenAndClose {
//    public void open(); // 抽象方法
//
//    public void setTv(ITV tv);
//}
//interface ITV { // ITV 接口
//
//    public void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//    private ITV tv;
//    public void setTv(ITV tv) {
//        this.tv = tv;
//    }
//    public void open() {
//        this.tv.play();
//    }
//}
//class ChangHong implements ITV {
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//}