package com.doganilbars.main;

public class Concat {
	public static void main(String[] args) {

		String str1 = "Hacý ";
		String str2 = " Doðan";
		String str3 = " Ýlbars ";
		String str4 = str1.concat(str2).concat(str3);
		String str5 = str4.concat("Java Developer");
		System.out.println(str4);
		System.out.println(str5);

	}

}
