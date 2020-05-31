package com.ito.assignment.distinctwords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
public class CountEachWords {
	
	static void CountWords(String filename, HashMap<String, Integer> words) throws FileNotFoundException {
		Scanner file = new Scanner(new File(filename));
		while(file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);
			if(count != null) {
				count++;
			}
			else
			{
				count = 1;
			}
			words.put(word,count);
		
			
			
		}
		file.close();
	}
	public static void main(String args[]) throws FileNotFoundException {
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		CountWords("C:\\WordDoc.txt", words);
		System.out.println(words);
	}
}
