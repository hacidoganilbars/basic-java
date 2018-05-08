package com.doganilbars.main;

public class CharacterSearch {

	public static void main(String[] args) {
		String str = "Hacý Doðan Ýlbars";
		char key = 'l';
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == key) {
				System.out.println(key + " found at index " + i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("key not found");
		}
	}
}