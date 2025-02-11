package com.string;

public class InitialUppercase {
	public static void main(String[] args) {
		String  s= "My name is priyanka";
		String[] str = s.split(" ");
		for(int i=0; i<str.length; i++) {
			String word = str[i];
			System.out.print(Character.toUpperCase(word.charAt(0))+word.substring(1)+ " ");		
		}
	}
}
