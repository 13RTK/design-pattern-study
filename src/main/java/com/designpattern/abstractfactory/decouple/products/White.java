package com.designpattern.abstractfactory.decouple.products;

import com.designpattern.abstractfactory.decouple.abstractproducts.Color;

public class White implements Color {
    @Override
    public String getColor() {
        return "White";
    }
}
