package com.doganilbars.main;

public class StringBuff6 {
	public static void main(String[] args) {

		StringBuffer sbf = new StringBuffer("Hacý Doðan ilbars");
		sbf.delete(0, 5);
		System.out.println(sbf);
	}
}
