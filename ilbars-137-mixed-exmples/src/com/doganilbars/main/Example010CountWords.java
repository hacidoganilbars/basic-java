package com.doganilbars.main;

//count number of words in a sentece, (incosistent but very simple method)
//Kelimelerin say�s�nu bulur(Tutars�z fakat �ok basit bir y�ntem)
public class Example010CountWords {
	public static void main(String[] args) {
		String str = "Hac� Do�an �lbars Java Developer T�rkiye";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}