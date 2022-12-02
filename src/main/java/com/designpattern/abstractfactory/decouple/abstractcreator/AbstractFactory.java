package com.designpattern.abstractfactory.decouple.abstractcreator;

public interface AbstractFactory<T> {
    T create(String input);
}
