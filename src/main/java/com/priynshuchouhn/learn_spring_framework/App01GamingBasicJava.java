package com.priynshuchouhn.learn_spring_framework;

import com.priynshuchouhn.learn_spring_framework.game.GameRunner;
import com.priynshuchouhn.learn_spring_framework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        /* var was introduced in java 10,
         improves readability,
         compiler infers the type of variable */
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
