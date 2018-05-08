package com.doganilbars.main;

public class ReverseString {
	public static void main(String[] args) {

		String str = "Hacý Doðan Ýlbars Java Developer";
		int wordCount = word(str);
		String arr[] = new String[wordCount];
		str = str + " ";
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);
			}
			if (str.charAt(i) == ' ') {
				arr[--wordCount] = temp;
				temp = "";
			}
		}
		String answer = "";
		for (String s : arr) {
			answer = answer + s + " ";
		}
		System.out.println(answer);

	}

	private static int word(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				++count;
			}
		}
		return count + 1;
	}
}
