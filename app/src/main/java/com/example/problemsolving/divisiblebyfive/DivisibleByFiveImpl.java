package com.example.problemsolving.divisiblebyfive;

public class DivisibleByFiveImpl implements DivisibilityController{

    @Override
    public boolean findDivisibleByFive(String n) {
        try {
            int num = (Integer.parseInt(n));
            boolean result = false;
            if (num % 5 == 0) {
                result = true;
            }
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}
