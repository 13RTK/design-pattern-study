package com.designpattern.principle.interfacesegregation;

public class CrazyPerson implements BearFeeder{
    @Override
    public void feedTheBear() {
        System.out.println("throw random food");
    }
}
