package com.cg.iter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise6_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date in format of YYYY/MM/DD");
		String date=sc.next();
		String[] arrSplit = date.split("/");
		LocalDate pdate=LocalDate.of(Integer.parseInt(arrSplit[0]), Integer.parseInt(arrSplit[1]), Integer.parseInt(arrSplit[2]));
		LocalDate now=LocalDate.now();
		Period diff=Period.between(pdate, now);
		System.out.println("Difference : "+diff.getYears()+" years "+diff.getMonths()+" months "
				+diff.getDays()+" days");
		

	}

}
