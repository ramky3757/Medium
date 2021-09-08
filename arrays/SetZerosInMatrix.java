package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetZerosInMatrix {

	public static void main(String[] args) {
		int[][]  arr = {{1,1,1,1}, {1,0,1,1}, {0,1,1,0}};
		
		//SetZerosInMatrix.setZeros(arr);
		SetZerosInMatrix.setZerosNoExtraSpace(arr);
		
		for(int i=0;i<3; i++) {
			
			for(int j=0; j<4; j++) {
				System.out.println(arr[i][j]);
				
			}
		}
	}
	
	public static void setZeros(int[][] arr) {
		
		Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();

		
		List<Integer> rowList = new ArrayList<Integer> ();
		List<Integer> colList = new ArrayList<Integer> ();
		
		for(int i=0;i<3; i++) {
			
			for(int j=0; j<4; j++) {
				
				if(arr[i][j] == 0) {
					rowList.add(i);
					colList.add(j);
				}
			}
		}
		
		map.put('r', rowList);
		map.put('c', colList);
		
		for(int i=0; i<3; i++) {
			
			if(map.get('r').contains(i)) {
				
				for(int j=0; j<4; j++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int j=0; j< 4; j++) {
			
			if(map.get('c').contains(j)) {
				
				for(int i=0; i<3; i++) {
					
					arr[i][j] = 0;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void setZerosNoExtraSpace(int[][] arr) {
		
		int row = arr.length;
		int col = arr[0].length;
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<col; j++) {
				if(arr[i][j] == 0) {
					//set start row & col for this pos to 0
					
					arr[i][0] = 0;
					arr[0][j] = 0;
				}
			}
		}
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(arr[i][0] == 0 || arr[0][j] == 0) {
					arr[i][j] = 0;
				}
			}
		}
		
	}

}
