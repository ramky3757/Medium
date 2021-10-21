package com.mustdo.problems;

public class ContainsMostWater_4 {
	
	
	public int mostWater(int[] height) {
		
		int left = 0, right = height.length-1;
		int curArea =0, maxArea = 0;
		
		while(left<right) {
			
			if(height[left] < height[right]) {
				
				curArea = (right-left) * Math.min(height[left], height[right]);
				
				left ++;
			} else {
				curArea = (right-left) * Math.min(height[left], height[right]);
				right --;
			}
			
			maxArea = Math.max(curArea, maxArea);
			
		} 
		
		
		return maxArea;
	}

}
