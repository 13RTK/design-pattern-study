package com.designpattern.bridge.decouple;

public class Blue implements Color {

    @Override
    public String getColor() {
        return Blue.class.getSimpleName();
    }
}
