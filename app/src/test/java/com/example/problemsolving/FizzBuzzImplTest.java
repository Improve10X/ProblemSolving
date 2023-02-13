package com.example.problemsolving;

import com.example.problemsolving.fizzbuzz.FizzBuzzImpl;

import junit.framework.TestCase;

public class FizzBuzzImplTest extends TestCase {

    public void testFindFizzBuzz() {
        String expectedOutput ="Buzz";
        String actualOutput = new FizzBuzzImpl().findFizzBuzz("5");
        assertEquals(expectedOutput, actualOutput);
    }
}