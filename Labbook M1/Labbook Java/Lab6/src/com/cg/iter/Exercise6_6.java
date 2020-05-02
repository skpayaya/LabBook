package com.cg.iter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise6_6 {

	public static void main(String[] args)
    { 
        File file = new File("Exercise6_6Text.txt"); 
        FileInputStream fileStream;
		try {
			fileStream = new FileInputStream(file);
		
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
       
        int countWord = 0; 
        int characterCount = 0; 
        int lineCount=0;
          
        while((line = reader.readLine()) != null) 
        { 
               
			lineCount++;
                characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split(" "); 
                 for (int i = 0; i < wordList.length; i++) {
					if(wordList[i].length()>0) {
						countWord++;
					}
				}
                  
        
            
        } 
          
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of lines = " + lineCount); 
        System.out.println("Total number of characters = " + characterCount); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
		}
    } 
} 