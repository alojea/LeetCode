package com.alojea;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesArrayTest {

	RemoveDuplicatesArray removeDuplicatesArrayClass;

    @Before
    public void setUp() throws Exception {
    	removeDuplicatesArrayClass = new RemoveDuplicatesArray();
    }

    @Test
    public void example1Test() {
    	int[] nums = {1,1,2};
    	int[] result = {1,2};
    	int len = removeDuplicatesArrayClass.removeDuplicates(nums);
    	
    	for(int i = 0; i< len; i++) {
    		Assert.assertEquals(result[i],nums[i]);
    	}
    }
    
    @Test
    public void example2Test() {
    	int[] nums = {0,0,1,1,1,2,2,3,3,4};
    	int[] result = {0,1,2,3,4};
    	int len = removeDuplicatesArrayClass.removeDuplicates(nums);
    	
    	for(int i = 0; i< len; i++) {
    		Assert.assertEquals(result[i],nums[i]);
    	}
    }
    
    @Test
    public void exampleWithNegativesTest() {
    	int[] nums = {-3,-1,0,0,0,3,3};
    	int[] result = {-3,-1,0,3};
    	int len = removeDuplicatesArrayClass.removeDuplicates(nums);
    	
    	for(int i = 0; i< len; i++) {
    		Assert.assertEquals(result[i],nums[i]);
    	}
    }
    
    
   
}


