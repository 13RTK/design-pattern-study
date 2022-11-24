package com.desginpattern.bridge.decouple;

public class Circle extends Shape{
    @Override
    public String getName() {
        return super.color.getColor() + Circle.class.getSimpleName();
    }
}
