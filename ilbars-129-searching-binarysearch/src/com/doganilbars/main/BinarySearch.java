package com.doganilbars.main;

//binary search in 1D array
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 8, 10, 15, 21, 29 };
		int key = 10;
		int beg = 0;
		int end = arr.length - 1;
		while (beg <= end) {
			int mid = (beg + end) / 2;
			if (arr[mid] == key) {
				System.out.println("Key found at index " + mid);
				return;
			}
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				beg = mid + 1;
			}
		}
		System.out.println("Key not found");
	}
}