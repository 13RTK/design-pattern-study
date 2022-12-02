package com.designpattern.flyweight;

import com.designpattern.abstractfactory.decouple.abstractproducts.Color;
import com.designpattern.principle.liskovsubstitution.Engine;

//@Data
public class Car implements Vehicle {
    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {
        this.engine.on();
    }

    @Override
    public void stop() {
    }

    @Override
    public void getColor() {
        System.out.println(this.color.getColor());
    }
}
