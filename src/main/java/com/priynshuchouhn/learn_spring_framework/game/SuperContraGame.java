package com.priynshuchouhn.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraGameQualifier")
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("up");
    }
    public void down() {
        System.out.println("sit down");
    }
    public void right(){
        System.out.println("shoot the bullet");
    }
    public void left(){
        System.out.println("move left");
    }
}
