package com.cg.iter;

import java.util.Scanner;

public class Exercise6_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		
		boolean pos=positiveCheck(str);
		if(pos)
		System.out.println("String is positive");
		else 
			System.out.println("String is not positive");
		

	}

	private static boolean positiveCheck(String str) {
		for (int i = 0; i < str.length()-1; i++) {
			char ch=str.charAt(i);
			if(str.charAt(i)>str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

}
