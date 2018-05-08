package com.doganilbars.main;

//string array 2D
public class StringArray {
	public static void main(String[] args) {

		String arr[][] = { { "Hacý", "Doðan", "Ýlbars" }, { "Java", "and", "Android" },
				{ "Developer", "From", "Türkiye" } };
		System.out.println("String array is: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%20s", arr[i][j]);
			}
			System.out.println();
		}
	}
}
