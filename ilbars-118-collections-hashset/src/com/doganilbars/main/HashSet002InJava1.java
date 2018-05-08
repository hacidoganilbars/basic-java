package com.doganilbars.main;

import java.util.HashSet;

//HashSet in java
//aynı değerleri yazdırmaz sadece bir tanesini yazar
public class HashSet002InJava1 {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(20);

		System.out.println(hs);

	}
}
