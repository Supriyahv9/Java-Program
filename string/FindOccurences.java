package com.string;

import java.util.LinkedHashMap;

public class FindOccurences {
	public static void main(String[] args) {
		String s = "aabbabac";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
