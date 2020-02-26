package com.stackroute.di.constructor;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Employee name is : " + name + " and Id is : " + id);
    }
}
