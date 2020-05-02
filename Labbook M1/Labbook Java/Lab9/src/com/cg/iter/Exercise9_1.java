
package com.cg.iter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise9_1 {

	public static void main(String[] args) {
		
		FileReader fr;
		FileWriter fw;
		
		try {
			fr = new FileReader("source.txt");
			fw = new FileWriter("target.txt");
			Runnable mr1=new CopyDataThread(fr, fw);
			ExecutorService es=Executors.newFixedThreadPool(1);
			es.submit(mr1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
