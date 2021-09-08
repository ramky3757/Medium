package com.arrays;

public class MergeArraysWithConstantSpace {
	
	
	/*
	 * Input: A = [3 4 5 7 9] B = [1 6 8]
	 * 
	 * Output: A = [1 3 4 5 6] B = [7 8 9]
	 */
	
	
	// 3 4 5 7 9
	// 1 6 8
	
	// 1 3 4 5 7
	// 9 6 8
	
	
	public void mergeArrays(int[] first, int[] second) {
	
		int rptr =0;
		
		for(int i=0; i<first.length; i++) {
			
			if(first[i] >second[rptr]) {
				swap(i, rptr, first, second);
			}
			
			int fElement = second[rptr];
			
			int j;
			
			for (j = 1; j < second.length && second[j] < fElement; j++)
			{
				second[j - 1] = second[j]; // left shift jth element
			}
			
			second[j - 1] = fElement;
		}
	}

	private void swap(int i, int j, int[] first, int[] second) {
		
		int temp = first[i];
		first[i] = second[j];
		second[j] = temp;
		
	}
	

}
