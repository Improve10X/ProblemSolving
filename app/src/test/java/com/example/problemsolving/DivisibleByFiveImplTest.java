package com.example.problemsolving;

import com.example.problemsolving.divisiblebyfive.DivisibleByFiveImpl;

import junit.framework.TestCase;

public class DivisibleByFiveImplTest extends TestCase {

    public void testFindDivisibleByFive() {
        boolean expectedOutput = true;
        boolean actualOutput = new DivisibleByFiveImpl().findDivisibleByFive("5");
        assertEquals(expectedOutput, actualOutput);
    }
}