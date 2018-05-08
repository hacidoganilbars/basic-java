package com.doganilbars.main;

//find average of all elements (ortalama)
public class Average {
	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 9 }, { 3, 8, 7, 0 }, { 9, 2, 7, 1 } };
		System.out.println("Integer array is: ");
		display(arr);
		int sum = 0;
		double average = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				sum = sum + arr[i][j];
			}
		}
		average = (double) sum / (arr.length * arr[0].length);
		System.out.println("Sum is: " + sum);
		System.out.println("Average: " + average);
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
