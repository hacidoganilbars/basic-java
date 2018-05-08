package com.doganilbars.main;

public class StringBuff8 {
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Hacý       ilbars");
		sbf.replace(5, 10, "Doðan");
		System.out.println(sbf);
	}
}
