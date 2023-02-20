package com.example.problemsolving;

import com.example.problemsolving.discount.DiscountImpl;

import junit.framework.TestCase;

public class DiscountImplTest extends TestCase {

    public void testFindDiscount() throws Exception{
        double expectedOutput = 750.0;
        double actualOutput = new DiscountImpl().findDiscount("1500", "50");
        assertEquals(expectedOutput,actualOutput);
    }
}