package com.doganilbars.main;

public class StringBuff {
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Hacý Doðan ilbars");
		int cap = sbf.capacity();
		int len = sbf.length();
		System.out.println("Length: " + len);
		System.out.println("Capacity: " + cap);
	}
}
