package com.example.problemsolving.twomakesten;

import android.nfc.Tag;
import android.util.Log;

public class TwoMakesTenImpl implements TwoMakesTenController{

    @Override
    public boolean findTen(String a, String b) {
        try {
            int inputOne = Integer.parseInt(a);
            int inputTwo = Integer.parseInt(b);
            boolean result = false;
            if (inputOne == 10 || inputTwo == 10 || inputOne + inputTwo == 10) {
                result = true;
            }
            return result;
        } catch (Exception ex) {
            Log.e("TAG", ex.getMessage(), ex);
            return false;
        }
    }
}
