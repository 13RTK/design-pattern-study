package com.designpattern.bridge.decouple;

public class Square extends Shape {
    @Override
    public String getName() {
        return super.color.getColor() + Square.class.getSimpleName();
    }
}
