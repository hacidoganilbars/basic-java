package com.doganilbars.main;

import java.util.HashMap;

//remove all mapping from HashMap
public class HashMap008RemoveAllMapping {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hac�");
		hm.put(45, "Do�an");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "T�rkiye");

		hm.clear();
		System.out.println(hm);

	}
}
