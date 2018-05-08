package com.doganilbars.main;

//count number of words in a sentece, (incosistent but very simple method)
//Kelimelerin sayýsýnu bulur(Tutarsýz fakat çok basit bir yöntem)
public class Example010CountWords {
	public static void main(String[] args) {
		String str = "Hacý Doðan Ýlbars Java Developer Türkiye";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}