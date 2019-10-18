package com.alojea;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImplementstrStrTest {

    ImplementstrStr implementstrStrClass;
    
    @Before
    public void setUp() throws Exception {
    	implementstrStrClass = new ImplementstrStr();
    }

    @Test
    public void example1Test() {
    	String haystack = "hello";
    	String needle = "ll";
    	Assert.assertEquals(2, implementstrStrClass.strStr(haystack, needle));
    }
    
    @Test
    public void example2Test() {
    	String haystack = "aaaaa";
    	String needle = "bba";
    	Assert.assertEquals(-1, implementstrStrClass.strStr(haystack, needle));
    }
    
    @Test
    public void needleNullTest() {
    	String haystack = "aaaaa";
    	Assert.assertEquals(0, implementstrStrClass.strStr(haystack, null));
    }
    
    @Test
    public void example3Test() {
    	String haystack = "aaaaa";
    	String needle = "aaab";
    	Assert.assertEquals(-1, implementstrStrClass.strStr(haystack, needle));
    }
    
    @Test
    public void equalsTest() {
    	String haystack = "aaaaa";
    	String needle = "aaaaa";
    	Assert.assertEquals(0, implementstrStrClass.strStr(haystack, needle));
    }
    
    @Test
    public void equals2Test() {
    	String haystack = "mississippi";
    	String needle = "mississippi";
    	Assert.assertEquals(0, implementstrStrClass.strStr(haystack, needle));
    }

    @Test
    public void sameLengthButDifferentTest() {
    	String haystack = "aaaaa";
    	String needle = "aaaab";
    	Assert.assertEquals(-1, implementstrStrClass.strStr(haystack, needle));
    }
    
    @Test
    public void isNotInTheFirstPositionTest() {
    	String haystack = "mississippi";
    	String needle = "issi";
    	Assert.assertEquals(1, implementstrStrClass.strStr(haystack, needle));
    }
    
    @Test
    public void equalsDifferentSizeTest() {
    	String haystack = "aaa";
    	String needle = "aa";
    	Assert.assertEquals(0, implementstrStrClass.strStr(haystack, needle));
    }
    
    @Test
    public void example4Test() {
    	String haystack = "mississippi";
    	String needle = "issip";
    	Assert.assertEquals(4, implementstrStrClass.strStr(haystack, needle));
    }

}

