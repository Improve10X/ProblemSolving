package com.example.problemsolving;

import com.example.problemsolving.nthEvenNumber.EvenNumberImpl;

import junit.framework.TestCase;

public class EvenNumberImplTest extends TestCase {

    public void testFindEven() {
        int expectedOutput = 198;
        int actualOutput = new EvenNumberImpl().findEven("100");
        assertEquals(expectedOutput, actualOutput);
    }
}