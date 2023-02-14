package com.example.problemsolving.twomakesten;

public class TwoMakesTenImpl implements TwoMakesTenController{

    @Override
    public boolean findTen(String a, String b) {
        int inputOne = Integer.parseInt(a);
        int inputTwo = Integer.parseInt(b);
        boolean result = false;
        if (inputOne ==10 ||inputTwo == 10 || inputOne + inputTwo == 10) {
            result = true;
        }
        return result;
    }
}
