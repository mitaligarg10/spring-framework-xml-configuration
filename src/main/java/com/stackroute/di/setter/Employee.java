package com.stackroute.di.setter;

public class Employee {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Employee name is : " + name + " and Id is : " + id);
    }
}
