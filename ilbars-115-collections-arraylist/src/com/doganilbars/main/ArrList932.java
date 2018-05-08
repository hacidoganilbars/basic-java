package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Arrays;

//Get the index of last occurrence of the element in the ArrayList
public class ArrList932 {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(4, 2, 3, 4, 5, 6, 7, 8, 4, 10));
		System.out.println(al.lastIndexOf(4));
		System.out.println(al.lastIndexOf(25));

	}
}
