package com.example.problemsolving;

import com.example.problemsolving.equalityofthreevalues.EqualityImpl;

import junit.framework.TestCase;

public class EqualityImplTest extends TestCase {

    public void testEquality() {
        int expectedOutput = 3;
        int actualOutput = new EqualityImpl().equality("1", "1", "1");
        assertEquals(expectedOutput, actualOutput);
    }
}