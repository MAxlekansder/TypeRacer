package com.example.springracer.Controller;

import com.example.springracer.Model.User;

import java.util.Scanner;

public class TypeRacerGame
{

    Scanner scanner = new Scanner(System.in);

    public void startGame(String sentence)
    {
        // TODO: Refine this method
        Timer timer = new Timer();

        System.out.println("Please enter your name");
        User player = new User(scanner.nextLine());



        System.out.println("Type the following sentence as fast as you can:");
        System.out.println(sentence);

        long startTimer = System.currentTimeMillis();

        String userInput = scanner.nextLine();

        boolean isCorrect = userInput.equals(sentence);

        System.out.println(isCorrect ? "Correct!" : "Incorrect!");
        System.out.println(timer.getTime(startTimer));
    }


}