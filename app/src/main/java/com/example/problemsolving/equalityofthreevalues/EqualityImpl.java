package com.example.problemsolving.equalityofthreevalues;

public class EqualityImpl implements EqualityController{
    @Override
    public int equality(String a, String b, String c) {
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
    }
}
