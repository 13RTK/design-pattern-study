package com.desginpattern.abstractfactory.decouple.products;

import com.desginpattern.abstractfactory.decouple.abstractproducts.Animal;

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
