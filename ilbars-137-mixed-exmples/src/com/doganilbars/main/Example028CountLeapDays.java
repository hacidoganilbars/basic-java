package com.doganilbars.main;

//COUNT TOTAL NUMBER OF LEAP DAYS BETWEEN GIVEN DAYS
public class Example028CountLeapDays {
	public static void main(String[] args) {
		int[] from = { 25, 02, 2012 };
		int[] to = { 02, 03, 2036 };
		int totalLeapDays = 0;
		if (from[1] >= 2 && checkLeap(from[2])) {
			totalLeapDays++;
		}
		if (to[1] > 2 && checkLeap(to[2])) {
			totalLeapDays++;
		}
		for (int i = from[2] + 1; i < to[2]; i++) {
			if (checkLeap(i)) {
				totalLeapDays++;
			}
		}
		System.out.println("Total number of leapdays in between given days: " + totalLeapDays);
	}

	private static boolean checkLeap(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;
	}
}