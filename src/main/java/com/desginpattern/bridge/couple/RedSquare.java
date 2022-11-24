package com.desginpattern.bridge.couple;

public class RedSquare extends Square {
    @Override
    public String getShape() {
        return this.getClass().getName();
    }
}
