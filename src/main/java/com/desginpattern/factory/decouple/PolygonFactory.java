package com.desginpattern.factory.decouple;

public class PolygonFactory {
    public Polygon getPolygon(int outSideNum) {
        if (outSideNum == 3) {
            return new Triangle();
        }
        if (outSideNum == 4) {
            return new Square();
        }
        if (outSideNum == 5) {
            return new Pentagon();
        }

        return null;
    }
}
