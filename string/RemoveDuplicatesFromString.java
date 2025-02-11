package com.string;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String s = "aabbabac";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<s.length() ; i++) {
			char  ch = s.charAt(i);
			set.add(ch);
		}
		System.out.println(set);
	}
}
