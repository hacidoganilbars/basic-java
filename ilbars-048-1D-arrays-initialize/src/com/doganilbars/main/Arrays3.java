package com.doganilbars.main;

public class Arrays3 {

	public static void main(String[] args) {
		String arr[] = new String[5];
		arr[0] = "Hac�";
		arr[1] = "Do�an";
		arr[2] = "�lbars";
		arr[3] = "Java";
		arr[4] = "Developer";

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}

	}

}
