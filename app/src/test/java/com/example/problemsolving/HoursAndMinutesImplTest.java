package com.example.problemsolving;

import com.example.problemsolving.hoursminutestoseconds.HoursAndMinutesImpl;

import junit.framework.TestCase;

public class HoursAndMinutesImplTest extends TestCase {

    public void testConvert() {
        int expectedInput = 3780;
        int actualOutput = new HoursAndMinutesImpl().convert("1", "3");
        assertEquals(expectedInput, actualOutput);
    }
}