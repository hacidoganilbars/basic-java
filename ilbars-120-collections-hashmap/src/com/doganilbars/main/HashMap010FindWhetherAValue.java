package com.doganilbars.main;

import java.util.HashMap;

//find whether a value is present in hashmap or not
public class HashMap010FindWhetherAValue {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hac�");
		hm.put(45, "Do�an");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "T�rkiye");

		System.out.println(hm.containsValue("ilbars"));// true
		System.out.println(hm.containsValue("�lbars"));// false
		System.out.println(hm.containsValue("Emine"));// false
	}
}
