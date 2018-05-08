package com.doganilbars.main;

import java.util.HashSet;
//try to remove element at given index but it wont remove

public class HashSet006RemoveGivenElementWontRemove {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);

		System.out.println(hs);
		hs.remove(3);
		System.out.println(hs);
	}
}
