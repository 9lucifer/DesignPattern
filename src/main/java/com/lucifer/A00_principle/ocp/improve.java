package com.lucifer.A00_principle.ocp;
public class improve {
    public static void main(String[] args) {
//使用看看存在的问题：新增图形时需要做很多修改，不满足开闭原则

        GraphicEditor1 graphicEditor = new GraphicEditor1();
        graphicEditor.drawShape(new Rectangle1());
        graphicEditor.drawShape(new Circle1());
        graphicEditor.drawShape(new Triangle1());
        graphicEditor.drawShape(new other());
    }
}
//这是一个用于绘图的类 [使用方]
class GraphicEditor1 {
//接收 Shape 对象，然后根据 type，来绘制不同的图形

    public void drawShape(Shape1 s) {
        s.draw();
    }

}
//Shape 类，基类

abstract class Shape1 {
    public abstract void draw();

}


class Rectangle1 extends Shape1 {
    Rectangle1() {
    }

    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}
class Circle1 extends Shape1 {
    Circle1() {
    }
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class Triangle1 extends Shape1 {
    Triangle1() {
    }
    public void draw() {
        System.out.println("绘制三角形");    }
}

class other extends Shape1 {
    other() {
    }
    public void draw() {
        System.out.println(" 其他图形");    }
}