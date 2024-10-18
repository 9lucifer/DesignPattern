<h3 style="color: #2E86C1; text-align: center;">适配器模式</h3>
<hr style="border: 0.5px solid #ABB2B9;">

<h4 style="color: #1F618D;">引入</h4>
<p><strong>生活中的例子：</strong>当我们使用手机充电时，充电器起到了转换器的作用，它将家用的220伏特电压转换成适合手机充电的5伏特电压。</p>

<h4 style="color: #1F618D;">适配器模式的三种类型</h4>
<blockquote>
  <p>命名原则：适配器的命名应基于资源如何传递给适配器来进行。</p>
</blockquote>

<ol>
  <li><strong>类适配器模式</strong>：这种方式直接通过类实现。在适配器(Adapter)中，源(src)被当做一个类直接继承。</li>
  <li><strong>对象适配器模式</strong>：这种方式通过持有对象来实现。在适配器(Adapter)中，源(src)作为一个对象被持有。</li>
  <li><strong>接口适配器模式</strong>：这种方式通过实现接口来应用。在适配器(Adapter)中，源(src)作为一个接口被实现。</li>
</ol>


##### 具体代码示例
###### 类适配器模式类图
![image-20241014231958151](https://imgtu.oss-cn-beijing.aliyuncs.com/blog_img/image-20241014231958151.png)

**类适配器模式**
```java
package com.lucifer.A07_Adapter.classAdapter;
//适配器
public class voltageAdapter extends voltage220v implements Ivoltage5v{
    public int output5v() {
        int src = output220v();
        int dst = src/44;
        return dst;
    }
}

```

> 缺点：使用了继承，且适配器中有src，增加使用成本


**对象适配器模式**
```java

package com.lucifer.A07_Adapter.objectAdapter;
//适配器
public class voltageAdapter implements Ivoltage5v {
    private voltage220v voltage220v;
    //通过构造器传入--聚合关系
    public voltageAdapter(com.lucifer.A07_Adapter.objectAdapter.voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }
    public int output5v() {
        int dst = 0;
        if(null!=voltage220v){
            int src = voltage220v.output220v();
            System.out.println("使用对象适配器进行转化");
            dst = src/44;
            System.out.println("适配完成");
            return dst;
        }else {
            return 0;
        }
    }
}
```
> 采用了合成复用原则（泛化->聚合）

**接口适配器模式**
```java
package com.lucifer.A07_Adapter.interfaceAdapter;

public class client_m1 {
    public static void main(String[] args) {
        absAdatpter absAdatpter = new absAdatpter(){
          //只需要关系需要使用的方法
          public void m1(){
              System.out.println("使用了m1的方法");
          }
        };
        absAdatpter.m1();
    }
}
```

##### 在源码里面的使用

1) SpringMvc 中的 HandlerAdapter, 就使用了适配器模式

2) 使用 HandlerAdapter 的原因分析:

可以看到处理器的类型不同，有多重实现方式，那么调用方式就不是确定的，如果需要直接调用 Controller 方
法，需要调用的时候就得不断是使用 if else 来进行判断是哪一种子类然后执行。那么如果后面要扩展 Controller，
就得修改原来的代码，这样违背了 OCP 原则。