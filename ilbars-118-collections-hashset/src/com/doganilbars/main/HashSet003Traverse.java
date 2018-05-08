package com.doganilbars.main;

import java.util.HashSet;

//Traverse hash set

public class HashSet003Traverse {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);

		for (int i : hs) {
			System.out.println(i);
		}

	}
}
