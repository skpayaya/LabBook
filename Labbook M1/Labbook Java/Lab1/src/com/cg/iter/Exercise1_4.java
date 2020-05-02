
package com.cg.iter;

public class Exercise1_4 {

	static boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String args[]) {
		if (checkNumber(64))
			System.out.println("Power of 2");
		else
			System.out.println("Not a power of 2");

	}
}
