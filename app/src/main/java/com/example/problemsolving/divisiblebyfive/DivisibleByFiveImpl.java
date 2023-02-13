package com.example.problemsolving.divisiblebyfive;

public class DivisibleByFiveImpl implements DivisibilityController{

    @Override
    public boolean findDivisibleByFive(String n) {
        int num = (Integer.parseInt(n));
        boolean result = false;
        if (num % 5 == 0) {
            result = true;
        }
        return result;
    }
}
