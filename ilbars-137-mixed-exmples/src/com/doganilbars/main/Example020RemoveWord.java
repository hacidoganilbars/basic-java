package com.doganilbars.main;

//remove the given word
//do not use unnecessary whitespace inbetween input string
//case sensitive
public class Example020RemoveWord {
	public static void main(String[] args) {
		String str = "Hacý Doðan Ýlbars Java Developer java Türkiye";
		String key = "java";

		String[] words = str.split("\\s");
		String temp = "";
		for (int i = 0; i < words.length - 1; i++) {
			if (!words[i].equals(key)) {
				temp = temp + words[i] + " ";
			}
		}
		System.out.println("After removing word \"" + key + "\": " + temp);
	}
}