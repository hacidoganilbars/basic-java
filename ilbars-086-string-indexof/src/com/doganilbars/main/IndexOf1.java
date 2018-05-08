package com.doganilbars.main;

public class IndexOf1 {
	public static void main(String[] args) {

		String str = new String("Examination world");
		for (int i = 65; i <= 90; i++) {
			if (str.indexOf((char) i) != -1) {
				System.out.println("Index of: " + (char) i + ": " + str.indexOf((char) i));
			}
		}
		for (int i = 97; i <= 122; i++) {
			if (str.indexOf((char) i) != -1) {
				System.out.println("Index of: " + (char) i + ": " + str.indexOf((char) i));
			}
		}
	}
}
