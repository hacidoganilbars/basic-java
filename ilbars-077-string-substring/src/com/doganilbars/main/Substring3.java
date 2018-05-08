package com.doganilbars.main;

public class Substring3 {
	public static void main(String[] args) {

		String str = "Hacý Doðan Ýlbars";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
