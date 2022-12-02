package com.designpattern.abstractfactory.decouple;

import com.designpattern.abstractfactory.decouple.abstractcreator.AbstractFactory;
import com.designpattern.abstractfactory.decouple.abstractproducts.Animal;
import com.designpattern.abstractfactory.decouple.products.Dog;
import com.designpattern.abstractfactory.decouple.products.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String input) {
        if (input.equals("Duck")) {
            return new Duck();
        }

        if (input.equals("Dog")) {
            return new Dog();
        }

        return null;
    }
}
