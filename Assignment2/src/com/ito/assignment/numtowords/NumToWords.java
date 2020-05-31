package com.ito.assignment.numtowords;


 
public class NumToWords {
 
   public static void main(String[] args) {
	int number = 10500;	  
	   
		   System.out.print("Number in words: " + convert(number));
	   
   }
 
   public static String convert(int number) {
        // variable to hold string representation of number 
        String words = "";
        String unitsArray[] = { "", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" };
	String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
 
	if (number == 0) {
	    return "zero";
	}
	
        // check if number is divisible by 1 million
        if ((number / 1000000) > 0) {
	   words += convert(number / 1000000) + " million ";
	   number %= 1000000;
	}
	// check if number is divisible by 1 thousand
	if ((number / 1000) > 0) {
	    words += convert(number / 1000) + " thousand ";
	    number %= 1000;
	}
	// check if number is divisible by 1 hundred
	if ((number / 100) > 0) {
	     words += convert(number / 100) + " hundred ";
	     number %= 100;
	}
 
	if (number > 0) {
	   
	     if (number < 20) { 
                    words += unitsArray[number];
             } else { 
                
                words += tensArray[number / 10]; 
                if ((number % 10) > 0) {
		    words += "-" + unitsArray[number % 10];
                }  
	     }
          }
	  return words;
   }
}
