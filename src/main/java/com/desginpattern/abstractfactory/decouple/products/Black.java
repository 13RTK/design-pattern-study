package com.desginpattern.abstractfactory.decouple.products;

import com.desginpattern.abstractfactory.decouple.abstractproducts.Color;

public class Black implements Color {
    @Override
    public String getColor() {
        return "Black";
    }
}
