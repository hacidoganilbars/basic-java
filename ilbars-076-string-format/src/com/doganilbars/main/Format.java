package com.doganilbars.main;

public class Format {
	public static void main(String[] args) {

		String str = "Hacý Doðan Ýlbars";
		String str1 = String.format("%s", str);
		String str2 = String.format("%3.2f", 12.3243);
		String str3 = String.format("%f", 12.323423);
		String str4 = String.format("%1.12f", 12.323423);

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
