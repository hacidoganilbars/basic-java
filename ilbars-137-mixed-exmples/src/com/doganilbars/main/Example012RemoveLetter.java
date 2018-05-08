package com.doganilbars.main;

//remove a letter from a string
//kelimeden bir harf çýkartmak
public class Example012RemoveLetter {
	public static void main(String[] args) {
		String str = "Gayret";
		char[] chArr = str.toCharArray();

		// to remve 4th character
		for (int i = 3; i < chArr.length - 1; i++) {
			chArr[i] = chArr[i + 1];
		}
		str = new String(chArr);
		str = new String(str.substring(0, str.length() - 1));
		System.out.println("After rmoving 4th character " + str);

	}
}