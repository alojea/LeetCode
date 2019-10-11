package com.alojea;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToIntegerTest {

    RomanToInteger romanToIntegerClass;

    @Before
    public void setUp() throws Exception {
    	romanToIntegerClass = new RomanToInteger();
    }

    @Test
    public void example1Test() {
    	Assert.assertEquals(3, romanToIntegerClass.romanToInt("III"));
    }
    
    @Test
    public void example2Test() {
    	Assert.assertEquals(4, romanToIntegerClass.romanToInt("IV"));
    }
    
    @Test
    public void example3Test() {
    	Assert.assertEquals(9, romanToIntegerClass.romanToInt("IX"));
    }
    
    @Test
    public void example4Test() {
    	Assert.assertEquals(58, romanToIntegerClass.romanToInt("LVIII"));
    }
    
    @Test
    public void example5Test() {
    	Assert.assertEquals(1994, romanToIntegerClass.romanToInt("MCMXCIV"));
    }
}


