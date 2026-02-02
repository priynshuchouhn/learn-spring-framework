package com.priynshuchouhn.learn_spring_framework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
@Named
class BussinessService{
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter injection");
        this.dataService = dataService;
    }
}

@Named
class DataService {}
@ComponentScan
public class SimpleSpringContextLauncherApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);

    }

}
