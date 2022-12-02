package com.designpattern.abstractfactory.decouple.products;

import com.designpattern.abstractfactory.decouple.abstractproducts.Animal;

public class Duck implements Animal {
    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "GA";
    }
}
