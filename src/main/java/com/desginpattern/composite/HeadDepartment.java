package com.desginpattern.composite;

import java.util.LinkedList;
import java.util.List;

public class HeadDepartment implements Department {
    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new LinkedList<>();
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        this.childDepartments.forEach(Department::printDepartmentName);
    }
}
