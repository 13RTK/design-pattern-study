package com.desginpattern.principle.liskovsubstitution;

public class Engine {
    private String state = "off";
    private Integer power;

    public void on() {
        this.state = "on";
    }

    public void powerOn(int upNum) {
        this.power += upNum;
    }
}
