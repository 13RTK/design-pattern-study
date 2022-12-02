package com.designpattern.abstractfactory.decouple.products;

import com.designpattern.abstractfactory.decouple.abstractproducts.Animal;

public class Dog implements Animal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
