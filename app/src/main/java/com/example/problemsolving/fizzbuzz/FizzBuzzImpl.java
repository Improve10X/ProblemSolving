package com.example.problemsolving.fizzbuzz;

import android.util.Log;

public class FizzBuzzImpl implements FizzBuzzController{
    @Override
    public String findFizzBuzz(String n) {
        try {
            int num = (Integer.parseInt(n));
            String result = " " + n;
            if (num % 15 == 0) {
                result = "FizzBuzz";
            } else if (num % 3 == 0) {
                result = "Fizz";
            } else if (num % 5 == 0) {
                result = "Buzz";
            }
            return result;
        } catch (Exception ex) {
            Log.e("TAG", ex.getMessage(), ex);
            return " " + n;
        }
    }
}
