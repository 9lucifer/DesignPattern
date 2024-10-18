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
