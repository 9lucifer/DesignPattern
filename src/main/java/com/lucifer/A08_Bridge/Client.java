package com.lucifer.A08_Bridge;

public class Client {
    public static void main(String[] args) {
        //获取折叠式手机
        FoldedPhone foldedPhone = new FoldedPhone(new vivo());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        //获取直立手机
        UpRightPhone upRightPhone = new UpRightPhone(new xiaomi());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();
    }
}
