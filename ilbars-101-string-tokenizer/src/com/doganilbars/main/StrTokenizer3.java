package com.doganilbars.main;

import java.util.StringTokenizer;

public class StrTokenizer3 {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer(" Hac� , Do�an , �lbars , Java , Developer .", ",", true);

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
