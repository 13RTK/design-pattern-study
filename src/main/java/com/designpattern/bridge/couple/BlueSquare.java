package com.designpattern.bridge.couple;

public class BlueSquare extends Square {
    @Override
    public String getShape() {
        return this.getClass().getName();
    }
}
