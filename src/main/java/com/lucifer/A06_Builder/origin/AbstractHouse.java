package com.lucifer.A06_Builder.origin;

public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void buildRoofs();

    public void build(){
        buildBasic();
        buildWalls();
        buildRoofs();
    }

}
