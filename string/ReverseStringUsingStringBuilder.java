package com.string;

public class ReverseStringUsingStringBuilder {
	public static void main(String[] args) {
		String str = "sara";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string: " + reversed);
	}
}
