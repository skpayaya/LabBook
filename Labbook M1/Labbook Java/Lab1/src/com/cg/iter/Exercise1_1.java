package com.cg.iter;
import java.util.Scanner;

public class Exercise1_1 {

	public static void main (String[]args)
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");
		int num =scan.nextInt();

		int total=calculateSum(num);

		System.out.println ("Sum : " + total);
	}
	public static int calculateSum (int n)
	{
		int i = 1, total = 0;
		while (i <= n)
		{
			if (i % 3 == 0 || i % 5 == 0)
				total = total + i;
			i++;
		}
		return total;
	}
}
