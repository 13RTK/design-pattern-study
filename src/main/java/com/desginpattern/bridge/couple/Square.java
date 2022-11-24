package com.desginpattern.bridge.couple;

public class Square extends Shape{
    @Override
    public String getShape() {
        return this.getClass().getName();
    }
}
