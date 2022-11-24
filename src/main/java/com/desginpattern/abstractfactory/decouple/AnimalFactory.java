package com.desginpattern.abstractfactory.decouple;

import com.desginpattern.abstractfactory.decouple.abstractcreator.AbstractFactory;
import com.desginpattern.abstractfactory.decouple.abstractproducts.Animal;
import com.desginpattern.abstractfactory.decouple.products.Dog;
import com.desginpattern.abstractfactory.decouple.products.Duck;

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
