package com.designpattern.abstractfactory.decouple.products;

import com.designpattern.abstractfactory.decouple.abstractproducts.Color;

public class Black implements Color {
    @Override
    public String getColor() {
        return "Black";
    }
}
