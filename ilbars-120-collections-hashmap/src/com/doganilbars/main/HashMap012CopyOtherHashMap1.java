package com.doganilbars.main;

import java.util.HashMap;

//copy a hashmap to another
public class HashMap012CopyOtherHashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hacý");
		hm.put(45, "Doðan");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "Türkiye");

		@SuppressWarnings("unchecked")
		HashMap<Integer, String> hm1 = (HashMap<Integer, String>) hm.clone();
		System.out.println(hm1);

	}
}
