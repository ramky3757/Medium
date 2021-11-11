package com.mustdo.problems;

public class LongestCommonSubSequence {
	
	private int LCS(String s1, String s2, int m, int n) {
		
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<n; j++) {
				
				if(i == 0 || j == 0) {
					
					dp[i][j] = 0;
				} else if(str1[i-1] == str2[j-1]) {
					dp[i][j] = 1+ dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max((dp[i-1][ j]), (dp[i][j-1]));
				}
				
			}
		}
		return dp[m][n];
	}

}
