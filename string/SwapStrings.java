package com.string;

public class SwapStrings {
	public static void main(String[] args) {
		String  s= "My name is priyanka";
		String[] str = s.split(" ");
		
		String temp = str[0];
		str[0] = str[str.length-1];
		str[str.length-1] = temp;
		//System.out.println(Arrays.toString(str));
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]+ " ");		
		}
	}
}
