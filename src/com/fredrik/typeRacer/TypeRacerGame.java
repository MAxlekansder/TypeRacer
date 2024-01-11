package com.fredrik.typeRacer;

import java.util.Scanner;

public class TypeRacerGame {

    Scanner scanner = new Scanner(System.in);

    public void startGame(String sentence) {
        // TODO: Refine this method

        System.out.println("Type the following sentence as fast as you can:");
        System.out.println(sentence);

        String userInput = scanner.nextLine();

        boolean isCorrect = userInput.equals(sentence);

        System.out.println(isCorrect ? "Correct!" : "Incorrect!");

    }
}
