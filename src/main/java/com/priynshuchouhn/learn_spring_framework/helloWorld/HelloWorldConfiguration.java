package com.priynshuchouhn.learn_spring_framework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


;

;

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
    public Person person2Parameters(String name, int age, @Qualifier("Jai_Address") Address address){
        return new Person(name,age,address);
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("Jodhpur", "Jdp");
    }

    @Bean(name = "Address_JAI")
    @Qualifier("Jai_Address")
    public Address address2(){
        return new Address("Jaipur", "JAI");
    }


}
