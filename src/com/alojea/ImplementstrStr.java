package com.alojea;


/**
 * 
 * @author alejandro
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 */

public class ImplementstrStr {
	
	 public int strStr(String haystack, String needle) {
		int firstFound = -1;
		int index = 0;
	    
		if(needle == null || needle.isEmpty()) {
			return 0;
		}
		
		
		if(haystack.contains(needle)) {
			if(haystack.length()==needle.length()) {
				return 0;
			}else {
				for(int i=0;i<haystack.length();i++) {
					for(int j=0;j<needle.length();j++) {
						if(haystack.charAt(i)==needle.charAt(j)) {
							if(haystack.substring(i, needle.length()+i).contains(needle)) {
								return i;
							} else {
								break;
							}
						}
					}
				}
			}
				
		} else {
			return -1;
		}
		return firstFound;
		 
	 }

}
