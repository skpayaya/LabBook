package com.cg.iter;

import java.util.Scanner;

public class Exercise6_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		String altered=alterString(str);
		System.out.println(altered);
	}

	private static String alterString(String str) {
		String altered="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'
					||ch=='u'||ch=='A'||ch=='E'||ch=='I'
					||ch=='O'||ch=='U'))
			{
				ch=(char) (ch+1);
			}
			altered=altered+ch;
			
			
		}
		return altered;
	}


}
