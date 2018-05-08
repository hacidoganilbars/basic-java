package com.doganilbars.main;

//initialize and declare integer array
public class Arrays1 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 19;
		arr[3] = 10;
		arr[4] = 31;

		// arr.length=5
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
	}
}
