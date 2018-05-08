package com.doganilbars.main;

public class CountOccurrances {

	public static void main(String[] args) {
		String str = "Hacý Doðan Ýlbars";
		char key = 'a';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == key) {
				count++;
			}
		}
		System.out.println(key + " is found " + count + " times");
	}
}