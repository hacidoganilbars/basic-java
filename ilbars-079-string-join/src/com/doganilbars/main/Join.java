package com.doganilbars.main;

public class Join {
	public static void main(String[] args) {

		String str = "Hac� Do�an �lbars";
		String str1 = "Java";
		String str2 = "Developer";

		String str3 = String.join("-", str, str1, str2);

		System.out.println(str3);

	}

}
