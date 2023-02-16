package com.example.problemsolving.lessthanhundred;

import android.util.Log;

public class HundredImpl implements LessThanHundredController{

    @Override
    public boolean lessThanHundred(String a, String b) throws Exception {
            int inputOne = (Integer.parseInt(a));
            int inputTwo = (Integer.parseInt(b));
            boolean result = false;
            int sum = inputOne + inputTwo;
            if (sum < 100) {
                result = true;
            }
            return result;
        }
}
