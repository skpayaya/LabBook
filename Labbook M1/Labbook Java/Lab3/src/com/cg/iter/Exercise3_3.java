package com.cg.iter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise3_3
{
	
	public static void main(String[] args)
	{
	

		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		int n=sc.nextInt();
		Integer intArray[]=new Integer[n]; 
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			intArray[i]=sc.nextInt();
		}

		String str ;

		for (int i = 0; i < n; i++)
			{
			str = String.valueOf(intArray[i]);
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			str=sb.toString();
			intArray[i]=Integer.parseInt(str);
			
			}
	//	System.out.println("The array: "+Arrays.toString(strArray));
		
		
		System.out.println("Sorted Array: "+getSorted(intArray));
	}

	private static List<Integer> getSorted(Integer[] intArray) {
		List<Integer> list = Arrays.asList(intArray);
		Collections.sort(list);
		return list;
	}
}