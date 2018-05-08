package com.doganilbars.main;

//remove the palindrome word
//do not use unnecessary whitespace inbetween input string
//case sensitive
public class Example021RemovePalindrome {
	public static void main(String[] args) {
		String str = "Hacý Doðan Ýlbars Java Developer 90809 Türkiye";
		String[] words = str.split("\\s");
		String temp = "";
		for (int i = 0; i < words.length; i++) {
			if (!checkPalindrome(words[i])) {
				temp = temp + words[i] + " ";
			}
		}
		System.out.println(temp);
	}

	private static boolean checkPalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}