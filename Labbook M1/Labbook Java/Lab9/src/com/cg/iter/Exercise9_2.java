package com.cg.iter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Exercise9_2 {

	public static void main(String[] args) {
		Runnable mr1=new Timer();
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.submit(mr1);

	}

}
