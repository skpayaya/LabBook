package com.cg.iter;

import java.io.File;
import java.util.Scanner;

public class Exercise6_7 {

	public static void main(String[] args)

	{

		Scanner input=new Scanner(System.in);
		System.out.println("Enter filename ");
		String s=input.nextLine();

		File f1=new File(s);

		System.out.println("File Name:"+f1.getName());
		System.out.println("This file is:"+(f1.exists()?"Exists":"Does not exists"));
		if(f1.exists()) {
			System.out.println("Is file:"+f1.isFile());
			System.out.println("Is Readable:"+f1.canRead());
			System.out.println("IS Writable:"+f1.canWrite());
			System.out.println("File Size:"+f1.length()+"bytes");
			System.out.println("Is Hidden:"+f1.isHidden());
		}
	}

}


