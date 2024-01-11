package com.example.springracer.Controller;
import com.example.springracer.JDBCConnector.DatabaseWriter;
import com.example.springracer.Model.User;
import com.example.springracer.Controller.StringValidation;

import java.util.Scanner;

public class TypeRacerGame
{

    Scanner scanner = new Scanner(System.in);

    public void startGame(String sentence)
    {
        DatabaseWriter databaseWriter = new DatabaseWriter();
        Timer timer = new Timer();
        StringValidation stringValidation = new StringValidation();

        System.out.println("Please enter your name");
        User player = new User(scanner.nextLine());
        databaseWriter.writeUser(player);


        System.out.println("Type the following sentence as fast as you can:");
        timer.countdown();
        System.out.println(sentence);

        long startTimer = System.currentTimeMillis();

        String userInput = scanner.nextLine();

        boolean isCorrect = userInput.equals(sentence);

        System.out.println(isCorrect ? "Correct!" : "Incorrect!");
        String userTime = timer.getTime(startTimer);

        System.out.println(userTime);

        double similarity = stringValidation.calculateJaccardSimilarity(userInput, sentence);
        int percentage = (int) (similarity * 100);

        System.out.println("Percentage Similarity: " + percentage + "%");
        System.out.println("This is what you got wrong: " + stringValidation.compareStrings(sentence, userInput));
        player.setTime(userTime);
        System.exit(0);

    }
}
