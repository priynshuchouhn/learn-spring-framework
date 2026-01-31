package com.priynshuchouhn.learn_spring_framework.game;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Jump");
    }
    public void down() {
        System.out.println("Go in to hole");
    }
    public void right(){
        System.out.println("Right");
    }
    public void left(){
        System.out.println("Left");
    }
}
