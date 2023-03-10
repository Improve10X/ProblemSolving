package com.example.problemsolving.equalityofthreevalues;

import android.util.Log;

public class EqualityImpl implements EqualityController{
    @Override
    public int equality(String a, String b, String c) {
        try {
            int one = (Integer.parseInt(a));
            int two = (Integer.parseInt(b));
            int three = (Integer.parseInt(c));
            int result = 0;
            if (one == two && two == three) {
                result = 3;
            } else if (one == two || two == three || three == one) {
                result = 2;
            } else {
                result = 0;
            }
            return result;
        } catch (Exception ex) {
            Log.e("TAG", ex.getMessage(), ex);
            return -1;
        }
    }
}
