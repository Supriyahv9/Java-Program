package com.string;

public class ReverseEachWord {
	public static void main(String[] args) {
		String  s= "My name is priyanka";
		String[] str = s.split(" ");
		for(int i=0; i<str.length; i++) {
			String word = str[i];
			StringBuilder sb = new StringBuilder(word).reverse();
			System.out.print(sb + " ");		
		}
	}
}
