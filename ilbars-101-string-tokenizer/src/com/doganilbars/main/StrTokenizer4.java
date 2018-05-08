package com.doganilbars.main;

import java.util.StringTokenizer;

public class StrTokenizer4 {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer(" Hacý , Doðan , Ýlbars , Java , Developer .", ",", false);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
