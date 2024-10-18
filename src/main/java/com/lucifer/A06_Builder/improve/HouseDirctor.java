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
