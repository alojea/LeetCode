package com.alojea;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {

	LongestCommonPrefix longestCommonPrefixClass;

    @Before
    public void setUp() throws Exception {
    	longestCommonPrefixClass = new LongestCommonPrefix();
    }

    @Test
    public void example1Test() {
    	String[] input = {"flower","flow","flight"};
    	Assert.assertEquals("fl", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void example2Test() {
    	String[] input = {"dog","racecar","car"};
    	Assert.assertEquals("", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void oneLetterTest() {
    	String[] input = {"a"};
    	Assert.assertEquals("a", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void blankStrTest() {
    	String[] input = {"","a"};
    	Assert.assertEquals("", longestCommonPrefixClass.longestCommonPrefix(input));
    }

    @Test
    public void equalStrTest() {
    	String[] input = {"c","c"};
    	Assert.assertEquals("c", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void equalStr2Test() {
    	String[] input = {"cc","cc"};
    	Assert.assertEquals("cc", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void equalStr3Test() {
    	String[] input = {"aaa","aa","aaa"};
    	Assert.assertEquals("aa", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void twoEqualsFromThreeTest() {
    	String[] input = {"b","cb","cab"};
    	Assert.assertEquals("", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void firstLetterEqualTest() {
    	String[] input = {"acc","aaa","aaba"};
    	Assert.assertEquals("a", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    @Test
    public void firstLetterEqual2Test() {
    	String[] input = {"aac","acab","aa","abba","aa"};
    	Assert.assertEquals("a", longestCommonPrefixClass.longestCommonPrefix(input));
    }
    
    
    @Test
    public void nullStrTest() {
    	String[] input = {""};
    	Assert.assertEquals("", longestCommonPrefixClass.longestCommonPrefix(input));
    }
  
    
}


