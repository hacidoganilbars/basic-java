package com.doganilbars.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Get sub List of ArrayList
public class ArrList931 {
	public static void main(String[] args) {

		ArrayList<Integer> obj1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		List<Integer> temp = obj1.subList(3, 7);
		System.out.println(temp);

	}
}
