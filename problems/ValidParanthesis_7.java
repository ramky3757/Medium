package com.mustdo.problems;

import java.util.Stack;

public class ValidParanthesis_7 {
	
	
	public boolean isValid(String str) {
		
		if(str.length()<1 || str == null) {
			return false;
		}
		
		char firstChar = str.charAt(0); char lastChar = str.charAt(str.length()-1);
		
		if(firstChar == '}' || firstChar == ']' || firstChar == ')') {
			return false;
		}
		
		if(lastChar == '(' || lastChar == '{' || lastChar == '[') {
			return false;
		}
		
		Stack<Character> stack = new Stack<Character> ();
		//{}
		//}
		
		for(char c: str.toCharArray()) {
			
			if(c == '{') {
				stack.push('}');
				
			} else if(c == '[') {
				stack.push(']');
				
			} else if(c == '(') {
				stack.push(')');
				
			} else {
				if(c!=stack.pop()) {
					return false;
				}
			}
			
			return false;
		}
		
		return stack.isEmpty();
		
	}

}
