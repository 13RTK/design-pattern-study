package com.designpattern.abstractfactory.decouple;

import com.designpattern.abstractfactory.decouple.abstractcreator.AbstractFactory;
import com.designpattern.abstractfactory.decouple.abstractproducts.Color;
import com.designpattern.abstractfactory.decouple.products.Black;
import com.designpattern.abstractfactory.decouple.products.White;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String input) {
        if (input.equals("White")) {
            return new White();
        }
        if (input.equals("Black")) {
            return new Black();
        }

        return null;
    }
}
