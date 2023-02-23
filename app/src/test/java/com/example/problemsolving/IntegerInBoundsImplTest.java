package com.example.problemsolving;

import com.example.problemsolving.integerInBounds.IntegerInBoundsImpl;

import junit.framework.TestCase;

public class IntegerInBoundsImplTest extends TestCase {

    public void testWithInBounds() throws Exception{
        boolean expectedOutput = false;
        boolean actualOutput = new IntegerInBoundsImpl().withInBounds("6", "1", "6");
        assertEquals(expectedOutput, actualOutput);
    }
}