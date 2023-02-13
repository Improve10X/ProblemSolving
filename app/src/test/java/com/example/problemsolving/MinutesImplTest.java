package com.example.problemsolving;

import junit.framework.TestCase;

public class MinutesImplTest extends TestCase {

    public void testConvertMinToSec() {
        int expectedOutput = 60;
        int actualOutput = new MinutesImpl().convertMinToSec("1");
        assertEquals(expectedOutput,actualOutput);
    }
}