package com.desginpattern.bridge.decouple;

public class Red implements Color {

    @Override
    public String getColor() {
        return Red.class.getSimpleName();
    }
}
