package com.desginpattern.composite;

public class SalesDepartment implements Department {
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
