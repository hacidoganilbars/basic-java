package com.doganilbars.main;

import java.util.StringTokenizer;

public class StrTokenizer5 {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer(" Hacý , Doðan , Ýlbars , Java , Developer .", "aer");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
