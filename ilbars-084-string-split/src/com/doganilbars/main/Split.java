package com.doganilbars.main;

public class Split {
	public static void main(String[] args) {

		String str = "Hac� Do�an �lbars Java Developer";
		String arr[] = str.split("\\s");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
		
	}
}
