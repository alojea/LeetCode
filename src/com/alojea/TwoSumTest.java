package com.alojea;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

    TwoSum twoSumClass;

    @Before
    public void setUp() throws Exception {
    	twoSumClass = new TwoSum();
    }

    @Test
    public void exampleTest() {
        int[] arrayInput = {2,7,11,15};
        int[] result = {0,1};
        int target = 9;
        Assert.assertArrayEquals(twoSumClass.twoSum(arrayInput,target),result);

    }
    
    @Test 
    public void equalNumbersTest() {
    	int[] arrayInput = {2,2,2,2};
        int[] result = {0,1};
        int target = 4;
        Assert.assertArrayEquals(twoSumClass.twoSum(arrayInput,target),result);
    }
    
    @Test 
    public void noResults() {
    	int[] arrayInput = {1,4,1,1};
        int[] result = {0,0};
        int target = 8;
        Assert.assertArrayEquals(twoSumClass.twoSum(arrayInput,target),result);
        
    }
    
    @Test
    public void bigArray() {
    	int[] arrayInput = {1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,10,1,1,1,4,1,1,1,4,
    						1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,11,4,1,1,1,4,1,1,4,
    						1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,41,1,1,1,4,1,1,1,4,
    						1,11,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,
    						1,1,4,1,1,1,4,1,11,4,1,1,1,4,111,1,1,4,1,1,1,4,1,
    						1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,11,4,1,1,1,4,1,1,
    						1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,4,1,1,1,4,1,11,4,
    						1,1,1,4,1,1,1,4,1,1,1,4,1,11,4,1,1,1,4,1,1,1,4,1,
    						1,4,1,11,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,
    						4,1,1,1,4,1,1,1,4,1,11,1,1,1,1,4,1,1,1,4,1,1,1,4,
    						1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,11,4,1,1,1,4,1,1,
    						4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,11,4,
    						1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,41,2,
    						4,1,11,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,
    						1,4,1,1,1,4,1,11,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,
    						1,1,4,1,1,1,4,1,1,1,4,1,11,4,1,1,1,4,1,1,1,4,1,1,
    						1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,11,4,1,1,1,4,1,
    						1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,11,
    						1,11,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,4,1,1,1,80,1};
    	
    	 int[] result = {15,453};
         int target = 90;
         Assert.assertArrayEquals(twoSumClass.twoSum(arrayInput,target),result);	
    	
    }
    
}


