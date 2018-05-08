package com.doganilbars.main;

//search for an element in one d array(linear search)
//dizi içerisinde bir eleman aramak (doðrusal arama)
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 6, 3, 5, 7, 8 };
		int key = 7;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println(key + " is found at index " + i);
				return;
			}
		}
		System.out.println("Key not found!!!");

	}
}