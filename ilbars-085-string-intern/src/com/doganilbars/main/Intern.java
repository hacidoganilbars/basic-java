package com.doganilbars.main;

public class Intern {
	public static void main(String[] args) {

		String str1 = new String("Hacý Doðan Ýlbars Java Developer");
		String str2 = "Hacý Doðan Ýlbars Java Developer";
		String str3 = str1.intern();// returns string from pool,now it will be same as str2
		System.out.println(str1 == str2);// false because reference is different
		System.out.println(str2 == str3);// true because reference is same

	}
}
