package com.doganilbars.main;

//split the sentence word by word and store it in another string array(method1)
//do not use unnecessary whitespace inbetween input string
//kelimeleri ay�rma
public class Example016SplitSentence {
	public static void main(String[] args) {
		String str = "Hac� Do�an �lbars Java Developer T�rkiye";
		int wordCount = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				wordCount++;
			}
		}
		String[] words = new String[wordCount];
		System.out.println("Total words: " + wordCount);
		String temp = "";
		int x = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				temp = temp + str.charAt(i);
			} else {
				words[x++] = temp;
				temp = "";
			}
		}
		System.out.println("Now the string array is");
		for (int i = 0; i < words.length - 1; i++) {
			System.out.println(words[i] + " ");
		}

	}
}