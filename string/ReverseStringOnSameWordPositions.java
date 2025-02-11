package com.string;

public class ReverseStringOnSameWordPositions {
	public static void main(String[] args) {
		String s = "my name is priyanka";
		String s1 = s.replace(" " , "");
		int index = s1.length()-1;
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i)== ' ') {
				System.out.print(" ");				
			} else {
				System.out.print(s1.charAt(index--));
			}
		}
	}
}
