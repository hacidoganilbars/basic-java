package com.doganilbars.main;

public class StringBuff8 {
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Hac�       ilbars");
		sbf.replace(5, 10, "Do�an");
		System.out.println(sbf);
	}
}
