package com.doganilbars.main;

import java.util.StringTokenizer;

public class StrTokenizer1 {
	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Hac� Do�an �lbars Java Developer .");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
