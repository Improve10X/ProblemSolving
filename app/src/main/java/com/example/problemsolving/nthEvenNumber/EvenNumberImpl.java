package com.example.problemsolving.nthEvenNumber;

public class EvenNumberImpl implements EvenNumberController{
    @Override
    public int findEven(String n) {
        int number = (Integer.parseInt(n));
        int nthEvenNumber = 2*(number-1);
        return nthEvenNumber;
    }
}
