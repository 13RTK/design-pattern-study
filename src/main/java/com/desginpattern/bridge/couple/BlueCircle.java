package com.desginpattern.bridge.couple;

public class BlueCircle extends Circle {
    @Override
    public String getShape() {
        return this.getClass().getName();
    }
}
