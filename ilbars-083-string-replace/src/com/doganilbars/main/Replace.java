package com.doganilbars.main;

public class Replace {
	public static void main(String[] args) {

		String str = "Sana K�s�yorum";
		System.out.println("Before: " + str);
		str = str.replace('�', '�');
		str = str.replace('s', 'z');
		System.out.println("After: " + str);

	}

}
