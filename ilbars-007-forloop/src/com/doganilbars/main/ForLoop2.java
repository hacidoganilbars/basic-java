package com.doganilbars.main;

public class ForLoop2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i = i + 2) {
			System.out.print(i + " ");
		}

		// bir satýr aþaðýya insin diye System.out.println();
		System.out.println();

		for (int i = 0; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
	}

}
