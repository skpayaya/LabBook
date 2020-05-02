package com.cg.iter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exercise6_2 {

	public static void main(String[] args) {
		File file =new File("Exercise6_2Text.txt");
		FileReader fr=null;
		BufferedReader br=null;

		int i=1;
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);

			String line;
			
			while((line = br.readLine()) != null)
			{
				System.out.println(i+":"+line);
				i++;
			}

		}catch(FileNotFoundException e){
			e.printStackTrace();

		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();} catch (IOException e) {}
		}
	}

}