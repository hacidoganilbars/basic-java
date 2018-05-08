package com.doganilbars.main;

//search for a number in another number
public class NumberInAnother {

	public static void main(String[] args) {

		int number = 16416491;
		int key = 164;
		int div = findDiv(key);

		int temp = number;
		while (temp > 0) {
			int rem = temp % div;
			if (rem == key) {
				System.out.println("Key found");
				return;
			}
			temp /= 10;
		}
		System.out.println("Key not found");
	}

	private static int findDiv(int number) {
		int len = 0;
		while (number > 0) {
			++len;
			number /= 10;
		}
		int ans = 1;
		for (int i = 0; i < len; i++) {
			ans = ans * 10;
		}
		return ans;
	}
}