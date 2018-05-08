package com.doganilbars.main;

//print all partitions of a number
//bir sayýnýn tüm bölümlerini yazdýr
public class Example029PrintPartition {
	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 5 };
		int size = 5;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(num[k]);
					if (k == j) {
						System.out.println();
					}

				}
			}
		}
	}
}