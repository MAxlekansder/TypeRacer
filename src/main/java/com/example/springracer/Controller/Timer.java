package com.example.springracer.Controller;

import java.util.Scanner;

public class Timer
{
    public String getTime(long startTime){

        long totalTime = System.currentTimeMillis()- startTime;

        return convertSecondsToHMmSs(totalTime);
    }

    public static String convertSecondsToHMmSs(long milliseconds) {

        long seconds = milliseconds / 1000;

        long ms = milliseconds % 1000;

        long s = seconds % 60;

        long m = (seconds / 60) % 60;

        return String.format("%d:%02d:%02d", m, s,ms);
    }

    public void countdown(){
        sleep();
        for (int i = 3; i > 0; i--){
            System.out.println(i);
            sleep();
        }
        System.out.println("GO!");
    }

    public void sleep(){
        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Could not sleep");
        }
    }
}
