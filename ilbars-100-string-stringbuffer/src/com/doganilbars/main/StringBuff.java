package com.doganilbars.main;

public class StringBuff {
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Hac� Do�an ilbars");
		int cap = sbf.capacity();
		int len = sbf.length();
		System.out.println("Length: " + len);
		System.out.println("Capacity: " + cap);
	}
}
