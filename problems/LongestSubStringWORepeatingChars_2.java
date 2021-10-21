package com.mustdo.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWORepeatingChars_2 {
	
	public static void main(String[] args) {
		
		LongestSubStringWORepeatingChars_2 lp = new LongestSubStringWORepeatingChars_2();
		System.out.println(lp.lengthOfLongestSubString("abcabcbb"));
		
		
	}
	
	public int lengthOfLongestSubString(String str) {
		
		if(str.length()<1 || str == null)
			return 0;
		
		Set<Character> set = new HashSet<Character> ();
		
		int first =0, second =0, max = 0;
		
		while(second < str.length()) {
			
			if(!set.contains(str.charAt(second))) {
				
				set.add(str.charAt(second++));
				max = Math.max(max, set.size());
				
			} else {
				set.remove(str.charAt(first++));
			}
			
		}
		
		return max;
		
	}

}
