package com.doganilbars.main;

import java.util.HashMap;

//try to add null values and duplicate keys
public class HashMap004TryToAddNullVallueAndDuplicateKeys {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(35, "Hac�");
		hm.put(45, "Do�an");
		hm.put(25, "ilbars");
		hm.put(10, "Java");
		hm.put(20, "Developer");
		hm.put(55, "T�rkiye");
		hm.put(10, "Android");
		hm.put(null, "C++");
		hm.put(null, null);
		hm.put(80, null);

		System.out.println(hm);

	}
}
