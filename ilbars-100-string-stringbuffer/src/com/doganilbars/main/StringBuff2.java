package com.doganilbars.main;

public class StringBuff2 {
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Hacý Doðan ilbars");
		sbf.append(" Java");
		sbf.append(" Developer");
		String str = sbf.toString();
		System.out.println(str);
	}
}
