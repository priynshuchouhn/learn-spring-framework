package com.priynshuchouhn.learn_spring_framework;

import com.priynshuchouhn.learn_spring_framework.game.GameRunner;
import com.priynshuchouhn.learn_spring_framework.game.MarioGame;
import com.priynshuchouhn.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        /* var was introduced in java 10,
         improves readability,
         compiler infers the type of variable */
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
