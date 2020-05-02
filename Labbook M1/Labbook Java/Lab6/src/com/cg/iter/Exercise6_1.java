package com.cg.iter;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise6_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integers separated by space");
		String digit=sc.nextLine();
		int dig=0,sum=0;
		StringTokenizer token=new StringTokenizer(digit);
		while(token.hasMoreTokens()) {
			String s=token.nextToken();
			dig=Integer.parseInt(s);
			System.out.println(dig+" ");
			sum=sum+dig;
		}
		System.out.println();
		System.out.println("Sum is : "+sum);

	}

}
