package com.doganilbars.main;

import java.util.HashSet;

//HashSet in java
//ayný deðerleri yazdýrmaz sadece bir tanesini yazar
public class HashSet001InJava {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(40);
		hs.add(50);
		System.out.println("HashSet doesnt maintain any order and dublicates not allowed: ");
		System.out.println(hs);

	}
}
