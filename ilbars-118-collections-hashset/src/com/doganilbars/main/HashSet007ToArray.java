package com.doganilbars.main;

import java.util.HashSet;
//hash set to array

public class HashSet007ToArray {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);

		Object[] arr = hs.toArray();
		for (Object obj : arr) {
			System.out.println(obj);
		}
	}
}
