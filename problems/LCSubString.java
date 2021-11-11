package com.mustdo.problems;

public class LCSubString {
	
	public void LCS(String s1, String s2) {
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		int[][] dp = new int[s1.length()+1] [s2.length()+1];
		int result = 0;
		
		for(int i=0; i<str1.length; i++) {
			
			for(int j=0; j<str2.length; j++) {
				
				if(i == 0 || j == 0)
					dp[i][j] = 0;
				else if(str1[i-1] == str2[j-1]) {
					dp[i][j] = 1+ dp[i-1][j-1];
					result = Math.max(dp[i][j], result);
				} else
					dp[i][j] = 0;
				
			}
		}
		
	}

}
