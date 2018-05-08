package com.doganilbars.main;

import java.util.LinkedHashSet;

//LinkedHashSet remove
public class LinkedHashSet002Remove {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(10);
		lhs.add(40);
		lhs.add(50);
		lhs.remove(10);
		lhs.remove(Integer.valueOf(50));
		System.out.println(lhs);

		/*
		 * unlike arralist here we need not to mention Integer. ValueOf(num) to remove
		 * integer element in the hashset or linkedhashset,as remove from specificindex
		 * is not avaliable we can just specify the direct integer values into remove()
		 * function
		 * 
		 * 
		 */

	}
}
