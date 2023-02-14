package com.example.problemsolving;

import com.example.problemsolving.twomakesten.TwoMakesTenImpl;

import junit.framework.TestCase;

public class TwoMakesTenImplTest extends TestCase {

    public void testFindTen() {
        boolean expectedOutput = true;
        boolean actualOutput = new TwoMakesTenImpl().findTen("5", "5");
        assertEquals(expectedOutput, actualOutput);
    }
}