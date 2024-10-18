package com.lucifer.A06_Builder.improve;

import com.lucifer.A06_Builder.origin.AbstractHouse;

public class commonHouse extends HouseBuilder {
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    public void buildRoofs() {
        System.out.println("普通房子封顶");
    }
}
