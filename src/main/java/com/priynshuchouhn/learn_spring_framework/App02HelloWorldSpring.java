package com.priynshuchouhn.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch the spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want to spring to manage - @Configuration
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        // Accessing the bean
        System.out.println(context.getBean("name"));

    }
}
