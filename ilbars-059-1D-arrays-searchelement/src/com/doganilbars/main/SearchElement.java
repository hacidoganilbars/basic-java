package com.doganilbars.main;

public class SearchElement {
	public static void main(String[] args) {
		int arr[] = { 16, 42, 13, 64, 53, 26, 17, 48, 39 };
		int key = 42;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				flag = true;
				System.out.println("Key found at index " + i);
			}
		}
		if (flag == false) {
			System.out.println("Key not found");
		}
	}
}
