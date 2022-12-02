package com.designpattern.abstractfactory.decouple;

import com.designpattern.abstractfactory.decouple.abstractcreator.AbstractFactory;
import com.designpattern.abstractfactory.decouple.abstractproducts.Animal;
import com.designpattern.abstractfactory.decouple.abstractproducts.Color;
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
