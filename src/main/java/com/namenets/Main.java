package com.namenets;
import org.springframework.context.ApplicationContext;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import org.springframework.context.support.ClassPathXmlApplicationContext;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj=(Dev) context.getBean("dev");
        System.out.println(obj.getAge());
//        obj.build();
    }
}