package com.doganilbars.main;

public class StringBuff5 {
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Doðru = ");
		sbf.insert(8, true);
		System.out.println(sbf);
	}
}
