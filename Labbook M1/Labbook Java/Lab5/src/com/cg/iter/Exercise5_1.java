package com.cg.iter;

import java.util.Scanner;

public class Exercise5_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("Enter traffic light or exit to close :");
			String color=sc.next();
			switch (color) {
			case "red":
				System.out.println("stop");
				break;
			case "yellow":
				System.out.println("ready");
				break;
			case "green":
				System.out.println("go");
				break;
			case "exit":
				System.out.println("Closing traffic lights...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice! Enter again.");
				break;
			}

		}

	}

}
