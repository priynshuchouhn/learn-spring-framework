package com.priynshuchouhn.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1: Launch the spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        //2: Configure the things that we want to spring to manage - @Configuration
        //HelloWorldConfiguration - @Configuration
        //name - @Bean

        // Accessing the bean
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("personParameters"));
        System.out.println(context.getBean("person2Parameters"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("Address_JAI"));
        System.out.println(context.getBean(Integer.class));

        System.out.println(context.getBean(Address.class));

        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

    }
}
