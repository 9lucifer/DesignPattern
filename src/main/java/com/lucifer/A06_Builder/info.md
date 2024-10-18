## 建造者模式
<hr>

### 一、基础知识介绍
##### 1. 问题引出
![image-20241013164322347](https://imgtu.oss-cn-beijing.aliyuncs.com/blog_img/image-20241013164322347.png)
> 上图面存在的**问题**：产品和产品创建的过程是封装在一起的。耦合性太强

**解决方法**: 将二者解耦和


##### 2.建造者模式介绍

将复杂对象的构造过程抽象出来，用户不用知晓里面的构建细节

##### 3.四个角色

建造者模式的四个角色
1) Product(产品角色):一个具体的产品对象。
2) Builder(抽象建造者):创建一个 Product 对象的各个部件指定的接口/抽象
3) ConcreteBuilder(具体建造者):实现接口，构建和装配各个部件。
4) Director(指挥者):构建一个使用 Builder 接口的对象。它主要是用于创建一个复杂的对象。


##### 4.类图
![image-20241013165353348](https://imgtu.oss-cn-beijing.aliyuncs.com/blog_img/image-20241013165353348.png)


### 二、实际案例设计
##### 1.类图
![image-20241013195947773](https://imgtu.oss-cn-beijing.aliyuncs.com/blog_img/image-20241013195947773.png)

##### 2.具体代码(最主要的俩)
**HouseBuilder**
```java
package com.lucifer.A06_Builder.improve;
//抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void buildRoofs();
    //建造完后，把产品返回
    public House buildHouse(){
        return  house;
    }
}
```

**HouseDirctor**
```java
package com.lucifer.A06_Builder.improve;
//制作流程由这个类去实现
public class HouseDirctor {
    HouseBuilder houseBuilder = null;
    //构造器传入
    public HouseDirctor(HouseBuilder houseBuilder){
        super();
        this.houseBuilder = houseBuilder;
    }
    //setter传入
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //建造房子的过程，由指挥者去指挥
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofs();
        return houseBuilder.buildHouse();
    }
}
```

##### 3.结果
![image-20241013200410474](https://imgtu.oss-cn-beijing.aliyuncs.com/blog_img/image-20241013200410474.png)

### 三、注意事项
1) 客户端(使用程序)不必知道产品内部组成的细节

2) 每一个具体建造者都相对独立，而与其他的具体建造者无关

3) 可以更加精细地控制产品的创建过程，将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，
   也更方便使用程序来控制创建过程

4) 增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合“开闭
   原则”

5) 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，因
   此在这种情况下，要考虑是否选择建造者模式.