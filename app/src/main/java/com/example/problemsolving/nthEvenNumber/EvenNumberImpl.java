package com.example.problemsolving.nthEvenNumber;

import android.util.Log;

public class EvenNumberImpl implements EvenNumberController{
    @Override
    public int findEven(String n) {
        try {
            int number = (Integer.parseInt(n));
            int nthEvenNumber = 2 * (number - 1);
            return nthEvenNumber;
        } catch (Exception ex) {
            Log.e("TAG", ex.getMessage(), ex);
            return -1;
        }
    }
}
