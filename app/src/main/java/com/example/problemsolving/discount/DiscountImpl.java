package com.example.problemsolving.discount;

public class DiscountImpl implements DiscountController{

    @Override
    public double findDiscount(String originalPrice, String discount) {
        int inputOne = Integer.parseInt(originalPrice);
        int inputTwo = Integer.parseInt(discount);
        double result = 0;
        result = inputOne - ((double)inputOne * (double) inputTwo/100);
        return result;
    }
}
