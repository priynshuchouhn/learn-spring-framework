package com.priynshuchouhn.learn_spring_framework.game;

public class GameRunner {
    //    private final MarioGame game;
    //    private final SuperContraGame game;
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
    this.game = game;
    }

    public void run() {
        System.out.println("Game is running "+ game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
