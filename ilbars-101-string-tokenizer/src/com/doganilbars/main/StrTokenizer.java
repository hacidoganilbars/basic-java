package com.doganilbars.main;

import java.util.StringTokenizer;

public class StrTokenizer {
	public static void main(String[] args) {

		String str = "Hacý Doðan Ýlbars Java Developer .";

		StringTokenizer st = new StringTokenizer(str);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
