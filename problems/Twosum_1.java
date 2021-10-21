package com.mustdo.problems;


import java.util.HashMap;
import java.util.Map;

public class Twosum_1 {
	
	public static void main(String[] args) {
		
		Twosum_1 ts = new Twosum_1();
		
		int[] input = {2,7,11,15}; int target = 9;
		ts.twoSum(input, target);
		
	}
	
	
	public int[] twoSum(int[] input, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
		
		for(int i=0; i< input.length; i++) {
			
			int diff = target - input[i];
			
			if(!map.containsKey(diff)) {
				map.put(input[i], i);
				
			} else {
				System.out.println(map.get(diff) +" "+ i);
			}
		}
		return input;
		
		
	}

}
