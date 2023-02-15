package com.example.problemsolving.nthEvenNumber;

public class EvenNumberImpl implements EvenNumberController{
    @Override
    public int findEven(String n) {
        try {
            int number = (Integer.parseInt(n));
            int nthEvenNumber = 2 * (number - 1);
            return nthEvenNumber;
        } catch (Exception ex) {
            return -1;
        }
    }
}
