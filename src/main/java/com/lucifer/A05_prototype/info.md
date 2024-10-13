## 原型模式

### 一、基础介绍

#### 是什么：
> **创建型模式**，允许对象再创建一个可定制的对象，而不需得知实现的细节。

#### 实现方式：
> 发起对象通过原型对象的 `.clone()` 方法来实现。

### 原型图如下
![原型模式图解](https://imgtu.oss-cn-beijing.aliyuncs.com/blog_img/image-20241013134452876.png)

**解释：**
- `prototype`: 原型类，声明一个克隆自己的接口。
- `ConcretePrototype`: 具体的克隆类，实现一个克隆自己的操作。
- `Client`: 让一个原型对象克隆自己，创建一个属性完全一样的对象。

### 二、在 Spring 框架中的运用
![Spring 中的原型模式](https://imgtu.oss-cn-beijing.aliyuncs.com/blog_img/image-20241013140257173.png)

### 三、深拷贝和浅拷贝
#### 浅拷贝
> 对于数据类型直接进行值传递，对于对象类型进行引用传递。

#### 深拷贝
> 为所有引用数据类型申请存储空间，并复制其所有的成员变量。

<hr>

#### 实现方式：

**方式一：** 重写 `clone()` 方法完成深拷贝。


@Override
protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成基本属性的克隆
        deep = super.clone();
        // 对引用类型单独处理
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
```java