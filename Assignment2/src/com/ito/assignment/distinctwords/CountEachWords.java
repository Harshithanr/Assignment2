package com.ito.assignment.distinctwords;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
public class CountEachWords {
	
	 static void CountWords(String filename, TreeMap<String,Integer> words) throws FileNotFoundException {
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
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();
		CountWords("C:\\Users\\Harshitha Ramashetty\\Documents\\Repository\\new.txt", words);
		System.out.println(words);
	}
}
