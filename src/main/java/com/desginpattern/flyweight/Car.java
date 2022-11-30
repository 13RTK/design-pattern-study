package com.desginpattern.flyweight;

import com.desginpattern.abstractfactory.decouple.abstractproducts.Color;
import com.desginpattern.principle.liskovsubstitution.Engine;
import lombok.Data;

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
