package com.desginpattern.bridge.couple;

public class RedCircle extends Circle{
    @Override
    public String getShape() {
        return this.getClass().getName();
    }
}
