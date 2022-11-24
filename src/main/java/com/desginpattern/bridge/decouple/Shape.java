package com.desginpattern.bridge.decouple;

public abstract class Shape {
    protected Color color;
    String getName() {
        return color.getColor() + Shape.class.getSimpleName();
    }
}
