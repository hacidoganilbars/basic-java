package com.doganilbars.main;

//split the sentence word by word and store it in another string array(method2)
//do not use unnecessary whitespace inbetween input string
//kelimeleri ay�rma
public class Example017SplitSentence1 {
	public static void main(String[] args) {
		String str = "Hac� Do�an �lbars Java Developer T�rkiye";

		String[] words = str.split("\\s");
		System.out.println("The String array is");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}