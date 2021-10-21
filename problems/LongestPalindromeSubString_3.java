package com.mustdo.problems;

public class LongestPalindromeSubString_3 {
	
	
	public static void main(String[] args) {
		
		LongestPalindromeSubString_3 lps = new LongestPalindromeSubString_3();
		System.out.println(lps.LPS("babad"));;
		
	}
	
	private String LPS(String str) {
		
		if(str.length()<0 || str == null)
			return "";
		
		 String max_str = "", cur_str;
		
		for(int i=0; i< str.length(); i++) {
			
			// we need to find the middle pointer so based on length we traverse to find palindrome
			
			if(str.length()%2==0) {
				cur_str = expandFromMiddle (str, i, i+1);
			} else {
			
			 cur_str = expandFromMiddle(str, i, i);
			}
			
			if(cur_str.length() > max_str.length()) {
				max_str = cur_str;
			}
		}
		
		return max_str;
		
	}

	private String expandFromMiddle(String str, int left, int right) {
		
		while(left>=0 && right < str.length() && str.charAt(left) ==  str.charAt(right)) {
			left --;
			right ++;
			
		}
		return str.substring(left+1, right);
	}
	
	
	

}
