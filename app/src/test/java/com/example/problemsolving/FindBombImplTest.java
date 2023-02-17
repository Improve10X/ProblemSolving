package com.example.problemsolving;

import com.example.problemsolving.findbomb.FindBombImpl;

import junit.framework.TestCase;

public class FindBombImplTest extends TestCase {

    public void testFindBomb() throws Exception{
        String expectedOutput = "Duck!";
        String actualOutput = new FindBombImpl().findBomb("There is a Bomb");
        assertEquals(expectedOutput, actualOutput);
    }
}