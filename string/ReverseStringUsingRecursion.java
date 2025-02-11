package com.string;

public class ReverseStringUsingRecursion {
	public static void main(String[] args) {
		String str = "sanas";
		reverse(str);
	}
	
	public static void reverse(String s) {
		System.out.print(s.charAt(s.length()-1));
		if(s.length()>1) {
			reverse(s.substring(0, s.length()-1));
		}
	}
}
