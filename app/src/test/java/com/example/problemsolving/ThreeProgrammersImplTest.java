package com.example.problemsolving;

import junit.framework.TestCase;

public class ThreeProgrammersImplTest extends TestCase {

    public void testGetMaxAndMin() {
        int expectedOutput = 2;
        int actualOutput = new ThreeProgrammersImpl().getMaxAndMin("5", "6", "4");
        assertEquals(expectedOutput, actualOutput);
    }
}