package com.desginpattern.abstractfactory.decouple.abstractcreator;

public interface AbstractFactory<T> {
    T create(String input);
}
