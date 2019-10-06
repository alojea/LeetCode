package com.alojea;

/**
 * 
 * @author alejandro
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * Input: 123
 * Output: 321
 * Example 2:
 * 
 * Input: -123
 * Output: -321
 * Example 3:
 * 
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: 
 * [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 */

public class ReverseInteger {
	
	public int reverse(int x) {
		
		String xStr =  Integer.toString(x);
		
		char[] reverse = new char[xStr.length()];
		int reverseIndex = 0, limit = 0;
		
		
		//Check if the number is negative
		if(xStr.charAt(0) == '-') {
			reverse[reverseIndex] = '-';
			reverseIndex++;
			limit = 1;
		} 
		
		for(int i=xStr.length()-1;i>=limit;i--) {
			reverse[reverseIndex] = xStr.charAt(i);
			reverseIndex++;
		}
		
		if(Long.valueOf(String.valueOf(reverse)) > Integer.MAX_VALUE || 
				Long.valueOf(String.valueOf(reverse))< Integer.MIN_VALUE) {
			return 0;
		}
		
        return Integer.valueOf(String.valueOf(reverse));
    }

}
