package com.example.springracer.Controller;

import java.util.HashSet;
import java.util.Set;

public class StringValidation {

    public static double calculateJaccardSimilarity(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        Set<Character> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Character> union = new HashSet<>(set1);
        union.addAll(set2);

        // Jaccard Similarity = |Intersection| / |Union|
        return (double) intersection.size() / union.size();
    }

    public static String findDifferingCharacters(String correctString, String userString) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : correctString.toCharArray()) {
            set1.add(c);
        }

        for (char c : userString.toCharArray()) {
            set2.add(c);
        }

        Set<Character> differingCharacters = new HashSet<>(set1);
        differingCharacters.addAll(set2);

        differingCharacters.removeAll(set1);
        differingCharacters.removeAll(set2);

        StringBuilder differingChars = new StringBuilder();
        for (char c : differingCharacters) {
            differingChars.append(c);
        }
        System.out.println(differingChars);
        return differingChars.toString();
    }

    public String compareStrings(String correctString, String userInput) {
        int minLength = Math.min(correctString.length(), userInput.length());
        StringBuilder feedbackText = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            char correctChar = correctString.charAt(i);
            char userChar = userInput.charAt(i);

            if (correctChar == userChar) {
                feedbackText.append(correctChar);
            } else {
                feedbackText.append("\u001B[31m").append(correctChar).append("\u001B[0m"); // ANSI escape code for red text
            }
        }

        // Append the remaining correct characters without formatting
        feedbackText.append(correctString.substring(minLength));

        return feedbackText.toString();
    }
}
