package com.doganilbars.main;

//another way to remove a character
//bir karateri kaldýrmak için baþka bir yol
public class Example014RemoveLetter2 {
	public static void main(String[] args) {
		String str = "Gayret";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 3) {
				continue;
			}
			temp = temp + str.charAt(i);
		}
		System.out.println(temp);
	}
}