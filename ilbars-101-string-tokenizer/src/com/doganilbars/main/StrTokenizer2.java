package com.doganilbars.main;

import java.util.StringTokenizer;

public class StrTokenizer2 {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Hacý Doðan Ýlbars Java Developer .", "a");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
