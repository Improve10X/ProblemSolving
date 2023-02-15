package com.example.problemsolving.lessthanhundred;

public class HundredImpl implements LessThanHundredController{
    @Override
    public boolean lessThanHundred(String a, String b) {
        try {
            int inputOne = (Integer.parseInt(a));
            int inputTwo = (Integer.parseInt(b));
            boolean result = false;
            int sum = inputOne + inputTwo;
            if (sum < 100) {
                result = true;
            }
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}
