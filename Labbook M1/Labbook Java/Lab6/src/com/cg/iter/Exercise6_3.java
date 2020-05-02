package com.cg.iter;

import java.util.Scanner;

public class Exercise6_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		String Image=getImage(str);
		System.out.println(Image);
	}

	private static String getImage(String str) {

		String reverse="";
		StringBuffer sb= new StringBuffer();
		sb.append(str);
		StringBuffer reverseb = sb.reverse();
		reverse =reverseb.toString();
		return(str+"|"+reverse);
		
	}

}
