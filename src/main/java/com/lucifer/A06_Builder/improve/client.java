package com.lucifer.A06_Builder.improve;

public class client {
    public static void main(String[] args) {
        commonHouse house = new commonHouse();
        HouseDirctor houseDirctor = new HouseDirctor(house);
        House house1 = houseDirctor.constructHouse();
        System.out.println("----------------------------");
        houseDirctor.setHouseBuilder(new HighBuilding());
        houseDirctor.constructHouse();
    }
}
