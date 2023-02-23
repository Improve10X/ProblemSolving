package com.example.problemsolving.integerInBounds;

public class IntegerInBoundsImpl implements IntegerInBoundsController{

    @Override
    public boolean withInBounds(String n, String lowerBounds, String upperBounds) {
        int number = (Integer.parseInt(n));
        int lower = (Integer.parseInt(lowerBounds));
        int upper = (Integer.parseInt(upperBounds));
        boolean result = false;
        if (number >= lower && number < upper) {
            result = true;
        }
        return result;
    }
}
