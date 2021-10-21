package com.mustdo.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum_5 {
	
	
	public List<List<Integer>> threeSum(int[] input){
		
		List<List<Integer>> result = new LinkedList ();
		Arrays.sort(input);
		
		for(int i=0; i< input.length-2; i++) {
			
			int left = i+1;
			int right = input.length;
			int sum = 0 - input[i];
			
			while(left < right) {
				
				if(input[left] + input[right] == sum) {
					result.add(Arrays.asList(input[i], input[left], input[right])); // found the triplet
					
					while(left <right && input[left] == input[left+1]) left++; // to ignore the duplicates
					while(left < right && input[right] ==  input[right-1]) right ++; // to ignore the duplicates
					left++; right --;
				} else if(input[left] + input[right] > sum) {
					right --;
				} else {
					left ++;
				}
				
			}
		}
		
		return result;
	}

}
