package com.designpattern.bridge.decouple;

public abstract class Shape {
    protected Color color;
    String getName() {
        return color.getColor() + Shape.class.getSimpleName();
    }
}
