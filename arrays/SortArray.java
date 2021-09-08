package com.arrays;

import java.util.Arrays;

//Input: [ 1 2 0 1 1 0 2 0 ]
//n = 8:Output: [ 0 0 0 1 1 1 2 2 ]


public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,0,1,1,0,2,0};
		sortColors(arr, arr.length);
	}

	private static void sortColors(int[] arr, int length) {
		
		int cnt0 =0, cnt1 =0, cnt2=0;
		
		for(int i=0; i< length; i++) {
			switch(arr[i]) {
			
			case 0:
				cnt0++;
				break;
				
			case 1:
				cnt1++;
				break;
			
			case 2:
				cnt2++;
				break;
			}
		}
		
		int i = 0;
		while(cnt0>0) {
			arr[i++] = 0;
			cnt0--;
		}
		
		while(cnt1>0) {
			arr[i++] = 1;
			cnt1--;
		}
		
		while(cnt2>0) {
			arr[i++] = 2;
			cnt2--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	

}
