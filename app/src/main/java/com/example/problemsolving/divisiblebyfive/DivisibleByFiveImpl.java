package com.example.problemsolving.divisiblebyfive;

import android.util.Log;

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
            Log.e("TAG", ex.getMessage(), ex);
            return false;
        }
    }
}
