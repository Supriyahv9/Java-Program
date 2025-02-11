package com.string;

public class ReverseStringWithoutExtraVariable {
	public static void main(String[] args) {
		String str = "poha";
		
		for (int i= str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
