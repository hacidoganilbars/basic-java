package com.doganilbars.main;

public class ReplaceAll {
	public static void main(String[] args) {
		String str = "The event that he smiled at me gives me hope, But my efforts to win his heart have failed";
		System.out.println("Before: " + str);
		str = str.replaceAll("me", "rrrrr");
		System.out.println("After: " + str);
	}

}
