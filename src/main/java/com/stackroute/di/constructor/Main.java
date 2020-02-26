package com.stackroute.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

      /*  Employee employee = new Employee("Abc",10);
        employee.displayInfo();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = context.getBean("employee", Employee.class);
        employee.displayInfo();

    }

}
