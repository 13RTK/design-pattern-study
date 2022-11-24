package com.desginpattern.abstractfactory.decouple;

import com.desginpattern.abstractfactory.decouple.abstractcreator.AbstractFactory;
import com.desginpattern.abstractfactory.decouple.abstractproducts.Color;
import com.desginpattern.abstractfactory.decouple.products.Black;
import com.desginpattern.abstractfactory.decouple.products.White;

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
