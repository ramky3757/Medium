package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MIssingAndRepeatingElement {
	
	public static void main(String[] args) {
		
		int[] arr = {2,1,3,3,5};
		
		MIssingAndRepeatingElement.missingAndRepeatingElement(arr);
		
	}
	
	
	private static void missingAndRepeatingElement(int[] arr) {
		
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer> ();
		
		for(int i: arr) {
			intMap.put(i, intMap.getOrDefault(i, 0)+1);
		}
		
		for(int i=1; i<= arr.length;i++) {
			
			if(intMap.containsKey(i) && intMap.get(i) >1) {
				System.out.println("Repeating element is  "+i);
			} else if(!intMap.containsKey(i)) {
				System.out.println("Missing element is "+i);
			}
			
		}
		
		
	}

}
