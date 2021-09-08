package com.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		int [] arr =  {1,2,3,4,5};
		
		System.out.println(Arrays.toString(productExceptSelf(arr)));
		
	}
	
	private static int[] productExceptSelf(int[] arr) {
		
		//check if array has more than one '0' - then whole array will be 0's
		int zeroCounter = 0;
		
		for(int i: arr) {
			if(i == 0) {
				zeroCounter++;
			}
		}
		
		if(zeroCounter<=1) {
			int product=1;
			for(int i:arr) {
				// Find the product of the array
				product*=i;
			}
			
			for(int i=0; i<arr.length; i++) {
				//Ignore if curr element is 0, to avoid DivideByZeroException
				if(arr[i] != 0) {
					arr[i] = product / arr[i];
				}
			}
		}
		
		return arr;
	}

}
