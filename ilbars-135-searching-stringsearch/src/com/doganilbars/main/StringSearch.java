package com.doganilbars.main;

public class StringSearch {

	public static void main(String[] args) {
		String str = "Hac� Do�an �lbars java Developer";
		String key = "�lbars";
		boolean flag = false;

		int keyLength = key.length();

		for (int i = 0; i < str.length() - keyLength; i++) {
			String temp = str.substring(i, i + keyLength);
			if (temp.equals(key)) {
				System.out.println("Key found");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Key not found");
		}
	}
}