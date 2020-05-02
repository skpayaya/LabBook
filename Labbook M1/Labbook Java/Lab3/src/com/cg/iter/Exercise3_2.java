package com.cg.iter;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3_2{
	public static String[] Sorting(String[] a, int total)
	{  
		String c[]=new String[total];
		for (int i = 0; i < total-1; i++) 
        {
            for (int j = i ; j < total-i-1; j++) 
            { 
                if (a[j].compareTo(a[j+1]) > 0) 
                {
                   String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		int y=total/2;
		if(total%2==0)
		{
			
		for (int i = 0; i < y; i++)
		{
			c[i]=a[i].toUpperCase();
		}
		for (int i = y; i <total; i++) 
		{
			c[i]=a[i].toLowerCase();
		}
		}
		else {
			for (int i = 0; i < (y)+1; i++)
			{
				c[i]=a[i].toUpperCase();
			}
			for (int i = (y)+1; i <total; i++) 
			{
				c[i]=a[i].toLowerCase();
			}
		}
		return c;  
	}  
	

	public static void main(String args[])
	{   
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		int n=sc.nextInt();
		String b[]=new String[n]; 
		System.out.println("enter string");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.next();
		}
		System.out.println(Arrays.toString(Sorting(b,n)));  
	}
}