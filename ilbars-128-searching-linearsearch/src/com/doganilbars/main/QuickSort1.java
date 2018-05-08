package com.doganilbars.main;

//search for all element for a given key in one d array (linear search)
//dizi içerisinde bir elemaný heryerde aramak (doðrusal arama)
public class QuickSort1 {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 7, 6, 3, 5, 7, 8, 7 };
		int key = 7;
		
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println(key + " is found at index " + i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Key not found!!!");
		}

	}
}