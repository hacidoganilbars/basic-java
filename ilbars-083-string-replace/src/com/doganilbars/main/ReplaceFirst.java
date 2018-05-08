package com.doganilbars.main;

public class ReplaceFirst {
	public static void main(String[] args) {
		String str = "This is a sample string,This variabled str";
		System.out.println("Before: " + str);
		str = str.replaceFirst("This", "run");
		System.out.println("After: " + str);
	}

}
