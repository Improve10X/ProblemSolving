package com.example.problemsolving;

public class MinutesImpl implements MinutesController{

    @Override
    public int convertMinToSec(String min) {
        int minutes = (Integer.parseInt(min));
        int seconds = 0;
        seconds = minutes * 60;
        return seconds;
    }
}
