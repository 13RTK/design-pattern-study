package com.desginpattern.bridge.couple;

public class Circle extends Shape{
    @Override
    public String getShape() {
        return this.getClass().getName();
    }
}
