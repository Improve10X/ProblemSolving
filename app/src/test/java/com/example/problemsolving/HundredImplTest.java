package com.example.problemsolving;

import com.example.problemsolving.lessthanhundred.HundredImpl;

import junit.framework.TestCase;

public class HundredImplTest extends TestCase {

    public void testLessThanHundred() throws Exception{
        boolean expectedOutput = true;
        boolean actualOutput = new HundredImpl().lessThanHundred("3", "77");
        assertEquals(expectedOutput, actualOutput);
    }
}