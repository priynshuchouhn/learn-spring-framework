package com.priynshuchouhn.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
class SomeClass {
    private final SomeDependency dependency;

    public SomeClass(SomeDependency dependency) {
        this.dependency = dependency;
        System.out.println("All Dependencies initialized");
    }

    @PostConstruct
    public void init() {
        dependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("cleanUp");
    }
}

@Component
class SomeDependency{

    public void getReady(){
        System.out.println("Db connection started");
    }
}
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class);
        context.close();
    }

}
