package com.doganilbars.main;

public class Replace {
	public static void main(String[] args) {

		String str = "Sana Küsüyorum";
		System.out.println("Before: " + str);
		str = str.replace('ü', 'ý');
		str = str.replace('s', 'z');
		System.out.println("After: " + str);

	}

}
