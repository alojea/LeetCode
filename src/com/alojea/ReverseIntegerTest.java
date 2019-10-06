package com.alojea;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerTest {

    ReverseInteger reverseIntegerClass;

    @Before
    public void setUp() throws Exception {
    	reverseIntegerClass = new ReverseInteger();
    }

    @Test
    public void example1Test() {
    	Assert.assertEquals(321, reverseIntegerClass.reverse(123));
    }
    
    @Test
    public void example2Test() {
    	Assert.assertEquals(-321, reverseIntegerClass.reverse(-123));
    }
    
    @Test
    public void example3Test() {
    	Assert.assertEquals(21, reverseIntegerClass.reverse(120));
    }
    
    @Test
    public void overflowTest() {
    	Assert.assertEquals(0, reverseIntegerClass.reverse(1534236469));
    }
    


}


