package com.desginpattern.bridge.baeldungdemo;

public class Square extends Shape {
    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }

    public Square(Color color) {
        super(color);
    }
}
