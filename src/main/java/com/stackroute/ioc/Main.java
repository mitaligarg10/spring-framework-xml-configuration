package com.stackroute.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        /*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Student student = (Student) factory.getBean("student");
        System.out.println("From Bean Factory Student name is : " + student.getStudentName());*/
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student1 = context.getBean("student", Student.class);
        System.out.println("From Application Context Student name is : " + student1.getStudentName());
    }
}
