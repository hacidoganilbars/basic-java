package com.doganilbars.main;

import java.util.HashMap;

//find whether a key is present in hashmap or not
public class HashMap009FindWhetherAKey {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hacı");
		hm.put(45, "Doğan");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "Türkiye");

		System.out.println(hm.containsKey(35));// true
		System.out.println(hm.containsKey(31));// false
		System.out.println(hm.containsKey(45));// true
	}
}
