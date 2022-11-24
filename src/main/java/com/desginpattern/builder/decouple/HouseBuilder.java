package com.desginpattern.builder.decouple;

import com.desginpattern.builder.couple.House;

public class HouseBuilder {
    private House house = new House();

    public HouseBuilder buildWalls(int num) {
        this.house.setWallNum(num);

        return this;
    }

    public HouseBuilder buildDoors(int num) {
        this.house.setDoorNum(num);

        return this;
    }

    public HouseBuilder buildWindows(int num) {
        this.house.setWindowNum(num);

        return this;
    }

    public HouseBuilder buildGarage(boolean set) {
        this.house.setHasGarage(set);

        return this;
    }

    public House getResult() {
        return this.house;
    }
}
