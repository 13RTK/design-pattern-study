package com.desginpattern.abstractfactory.decouple;

import com.desginpattern.abstractfactory.decouple.abstractcreator.AbstractFactory;
import com.desginpattern.abstractfactory.decouple.abstractproducts.Animal;
import com.desginpattern.abstractfactory.decouple.abstractproducts.Color;
import org.junit.Test;

public class MainTest {
    @Test
    public void abstractFactoryMethodTest() {
        AbstractFactory<Animal> animalFactory = new AnimalFactory();
        AbstractFactory<Color> colorFactory = new ColorFactory();

        Animal duck = animalFactory.create("Duck");
        Color black = colorFactory.create("Black");

        System.out.println(duck.getType() + " " + black.getColor());
    }
}
