package com.example.springracer.Controller;

import java.util.Random;

public class Randomizer {

    public int generateNumber() {
        Random random = new Random();
        return random.nextInt(1,159);
    }

}
