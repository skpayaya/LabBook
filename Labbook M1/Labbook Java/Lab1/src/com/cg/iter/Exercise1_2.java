package com.cg.iter;

import java.util.Scanner;

public class Exercise1_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n");
		int num =scan.nextInt();

		int total=calculateDifference(num);

		System.out.println ("Output : " + total);

	}
	public static int calculateDifference(int n) {

		int sum1=0;
		int sum2=0;
		for (int i = 1; i <= n; i++) 
			sum1 += (i * i); 

		for (int i = 1; i <= n; i++) 
			sum2 += (i); 
		sum2=sum2*sum2;
		
		return ( sum1-sum2);

		

	}

}
