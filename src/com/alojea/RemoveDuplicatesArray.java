package com.alojea;

import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicatesArray {
	
	 public int removeDuplicates(int[] nums) {
		 SortedSet<Integer> set = new TreeSet<Integer>();

		 for(int num:nums) {
			 set.add(num);		 
		 }
		 		 
		 int index=0;
		 
		 for(Integer number:set) {
			 nums[index]=number;
			 index++;
		 }

	     return set.size();
	 }

}
