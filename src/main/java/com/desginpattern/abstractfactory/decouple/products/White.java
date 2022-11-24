package com.desginpattern.abstractfactory.decouple.products;

import com.desginpattern.abstractfactory.decouple.abstractproducts.Color;

public class White implements Color {
    @Override
    public String getColor() {
        return "White";
    }
}
