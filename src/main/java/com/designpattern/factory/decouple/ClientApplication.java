package com.designpattern.factory.decouple;

import java.util.LinkedList;
import java.util.List;

public class ClientApplication {
    public static void main(String[] args) {
        PolygonFactory polygonFactory = new PolygonFactory();
        List<String> resList = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            Polygon polygon = polygonFactory.getPolygon(i + 3);

            resList.add(polygon.getType());
        }

        System.out.println(resList);
    }
}
