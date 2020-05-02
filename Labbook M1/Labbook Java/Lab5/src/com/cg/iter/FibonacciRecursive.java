package com.cg.iter;

import java.util.Scanner;

public class FibonacciRecursive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n :");
		int n = sc.nextInt();
		System.out.println("Fibonacci Series of "+n+"numbers");
		for (int i = 1; i <= n; i++) {
			System.out.println(fib(i)+" ");

		}

	}

	private static int fib(int n) {
		
			if(n==0) {
				return 0;
			}
			else {
				if(n==1 || n==2) {
					return 1;
				}
			}
			return fib(n-2)+fib(n-1);
	}

}
