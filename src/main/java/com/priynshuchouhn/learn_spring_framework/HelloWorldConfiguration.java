package com.priynshuchouhn.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age, Address address) {};

record Address(String firstLine, String cityName) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Priyanshu";
    }
    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Person person(){
        return new Person(name(), age(), new Address("Pali","Pali"));
    }
    @Bean
    public Person personParameters(String name, int age, Address address){
        return new Person(name,age,address);
    }

    @Bean
    public Address address(){
        return new Address("Jodhpur", "Jdp");
    }

    @Bean(name = "Address_JAI")
    public Address address2(){
        return new Address("Jaipur", "JAI");
    }


}
