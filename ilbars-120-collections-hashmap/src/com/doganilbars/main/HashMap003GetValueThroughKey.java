package com.doganilbars.main;

import java.util.HashMap;

//Get value through key
public class HashMap003GetValueThroughKey {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hac�");
		hm.put(45, "Do�an");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "T�rkiye");

		System.out.println(hm.get(25));
		System.out.println(hm.get(55));
		System.out.println(hm.get(100)); // null

	}
}
