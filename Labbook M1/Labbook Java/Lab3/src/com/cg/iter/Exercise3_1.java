package com.cg.iter;

import java.util.Scanner;

public class Exercise3_1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		sumOfCubesOfDigits(n);
	}

	private static void sumOfCubesOfDigits(int n) {
		int d,s=0;
		while(n>0) {
			d=n%10;
			s=s+(d*d*d);
			n=n/10;
		}
		System.out.println("");
		
	}
	

}
