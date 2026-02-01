package com.priynshuchouhn.learn_spring_framework;

import com.priynshuchouhn.learn_spring_framework.game.GameRunner;
import com.priynshuchouhn.learn_spring_framework.game.GamingConsole;
import com.priynshuchouhn.learn_spring_framework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App03GamingSpringBeans {

    @Bean
    public GamingConsole game(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);
        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();

    }

}
