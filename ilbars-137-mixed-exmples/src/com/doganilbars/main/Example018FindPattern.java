package com.doganilbars.main;

//find pattern/word in the given sentence
//do not use unnecessary whitespace inbetween input string
public class Example018FindPattern {
	public static void main(String[] args) {
		String str = "Hacý Doðan Ýlbars Java Developer Türkiye";
		int worCount = 1;
		String key = "Ýlbars";
		boolean flag = false;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				worCount++;
			}
		}
		String[] words = new String[worCount];
		String temp = "";
		int x = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);
			} else {
				words[x++] = temp;
				temp = "";
				if (words[x - 1].equals(key)) {
					System.out.println("The word \"" + key + "\"is found in position " + x);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("String not found");
		}
	}
}