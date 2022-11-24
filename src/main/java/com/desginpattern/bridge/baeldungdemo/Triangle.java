package com.desginpattern.bridge.baeldungdemo;

public class Triangle extends Shape {
    @Override
    public String draw() {
        return "Triangle drawn. " + color.fill();
    }

    public Triangle(Color color) {
        super(color);
    }
}
