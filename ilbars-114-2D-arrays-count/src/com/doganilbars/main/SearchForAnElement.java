package com.doganilbars.main;

//search for an element
public class SearchForAnElement {
	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 7 }, { 1, 2, 3, 8, 7 }, { 9, 2, 7, 9, 2 }, { 1, 3, 5, 7, 8 }, { 6, 7, 8, 9, 0 } };
		System.out.println("Integer array is: ");
		display(arr);
		int key = 3;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == key) {
					count++;
				}
			}
		}
		System.out.println(key + " found " + count + " times");
	}

	private static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
