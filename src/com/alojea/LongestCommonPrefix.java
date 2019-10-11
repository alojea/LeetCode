package com.alojea;

/**
 * 
 * @author alejandro
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 *
 */

public class LongestCommonPrefix {
	
	 int limit = 0;
	
	 public String longestCommonPrefix(String[] strs) {
		 
		 String longestPrefix = "";
		 
		 
		 if(strs.length == 1) {
			 return strs[0];
		 }
		 
		 if(strs.length == 0) {
			 return "";
		 }
		 
		 String firstWord = strs[0];
			 
		 if(firstWord.equals("")) {
			 return "";
		 }
			 
		 limit = firstWord.length();

		 for(int j=1;j<strs.length;j++) {
			 String tmpWord = strs[j];
			 if(tmpWord.equals("")) {
				 return "";
			 }
			 longestPrefix = longestPrefixCalculation(firstWord,tmpWord);

			 if(longestPrefix.equals("")) {
				 return "";
			 }

		 }
		 
		 return longestPrefix;
	 }
	 
	 private String longestPrefixCalculation(String strA, String strB) {
		 
	
		 String prefix = "";
		 
		 if(strB.length() < limit) {
		 	 limit = strB.length();
		 } 
		 	 
		 for(int i=0;i<limit;i++) {
			 for(int j=i;j<limit;) {
				 if(strA.charAt(i)==strB.charAt(j)) {
					 prefix = prefix + strA.charAt(i);
					 break;
				 } else {
					 limit = i;
					 return prefix;
				 }
				 
			 }				 
			 
		 }
		 
		 return prefix;
	 }

}
