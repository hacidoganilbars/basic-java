package com.doganilbars.main;

//count number of words in a sentece, (incosistent but very simple method)
//Kelimelerin sayýsýnu bulur(Tutarsýz fakat çok basit bir yöntem)
public class Example011PalindromeCheck {
	public static void main(String[] args) {
		String str = "madam";
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}