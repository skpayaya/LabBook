package com.cg.iter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercise3_4
{
	public static void main(String[] args)
	{
	

		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		int n=sc.nextInt();
		char charArray[]=new char[n]; 
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			charArray[i]=sc.next(). charAt(0);
		}

		//List<Scanner> list = Arrays.asList(sc);

		List<Character> distinct = new ArrayList<>();
		for (char s: charArray) {
			distinct.add(s);
		}
		System.out.println(distinct);
		
		Set<Character> distinct1=new HashSet<>(distinct);
		for(char s: distinct1)
		{
			System.out.println(s + ": " + Collections.frequency(distinct,s ));
		}

}
}
