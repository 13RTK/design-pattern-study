package com.desginpattern.bridge.baeldungdemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Shape {
    protected Color color;

    public abstract String draw();
}
