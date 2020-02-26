package com.stackroute.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    /*    Employee employee = new Employee();
        employee.setName("ABCD");
        employee.setId(1);
        employee.displayInfo();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = context.getBean("employee", Employee.class);
        employee.displayInfo();
    }

}
