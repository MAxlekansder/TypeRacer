package com.example.springracer;

import com.example.springracer.Controller.TypeRacerGame;
import com.example.springracer.Service.SentenceGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRacerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRacerApplication.class, args);

        SentenceGenerator sentenceGenerator = new SentenceGenerator();

        TypeRacerGame typeRacerGame = new TypeRacerGame();

        // This is where the game starts
        typeRacerGame.startGame(sentenceGenerator.getRandomSentence());

    }
}

