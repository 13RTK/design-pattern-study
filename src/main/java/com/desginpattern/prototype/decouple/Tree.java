package com.desginpattern.prototype.decouple;

import lombok.Data;

@Data
public abstract class Tree {
    private final double mass;
    private double height;
    private Position position;

    public abstract Tree copy();

    public Tree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }
}
