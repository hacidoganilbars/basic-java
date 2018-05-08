package com.doganilbars.main;

//find pattern/word in the given sentence
//do not use unnecessary whitespace inbetween input string
//case sensitive
public class Example019FindPattern1 {
	public static void main(String[] args) {
		String str = "Hacý Doðan Ýlbars Java Developer Türkiye";
		String key = "Ýlbars";
		boolean flag = false;
		String[] words = str.split("\\s");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(key)) {
				flag = true;
				System.out.println("The word \"" + key + "\" is found in position " + (i + 1));
			}
		}
		if (flag == false) {
			System.out.println("String not found");
		}
	}
}