package com.priynshuchouhn.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}
@Component
@Lazy
class ClassB{
     ClassA a;

    public ClassB(ClassA a) {
        System.out.println("Something initialized");
        this.a = a;
    }

    public void doSomething(){
        System.out.println("doSomething");
    }
}
@ComponentScan
public class LazyInitializeContextLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializeContextLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println("All Initialisation completed");
        context.getBean(ClassB.class).doSomething();


    }

}
