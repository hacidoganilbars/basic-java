package com.doganilbars.main;

public class Concat {
	public static void main(String[] args) {

		String str1 = "Hac� ";
		String str2 = " Do�an";
		String str3 = " �lbars ";
		String str4 = str1.concat(str2).concat(str3);
		String str5 = str4.concat("Java Developer");
		System.out.println(str4);
		System.out.println(str5);

	}

}
