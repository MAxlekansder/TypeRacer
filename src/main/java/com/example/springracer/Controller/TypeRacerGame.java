package com.example.springracer.Controller;
import com.example.springracer.Model.User;
import com.example.springracer.Controller.StringValidation;

import java.util.Scanner;

public class TypeRacerGame
{

    Scanner scanner = new Scanner(System.in);

    public void startGame(String sentence)
    {
        Timer timer = new Timer();
        StringValidation stringValidation = new StringValidation();

        System.out.println("Please enter your name");
        User player = new User(scanner.nextLine());


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
<<<<<<< HEAD
        System.out.println("This is what you got wrong: " + stringValidation.findDifferingCharacters(sentence, userInput));
        System.out.println("Alexander sträng" + stringValidation.StringComparator(sentence, userInput));
=======
        System.out.println("This is what you got wrong: " + stringValidation.compareStrings(sentence, userInput));
        player.setTime(userTime);
        System.exit(0);
>>>>>>> 74809a03860861678aff3c3f80b71b386105e1c2
    }
}
