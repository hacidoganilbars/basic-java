package com.doganilbars.main;

import java.util.HashSet;
import java.util.Iterator;

//Traverse hash set using iterator

public class HashSet004TraverseIterator {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);

		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
