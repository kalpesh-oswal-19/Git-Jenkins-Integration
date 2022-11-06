package com.coreJava;

public class FirstStringProgram {

	public static void main(String[] args) {
		
		String s1 = "Hello World";
		String s2 = new String("Hello Java");
		String s4 = new String("Hello World");
		String s5 = "Hello World";
		
		//Printing length of string ---------------------------------------------------
		System.out.println("Length of s1: "+s1.length());
		System.out.println("Length of s2: "+s2.length());
		 
		 //String to upper case ----------------------------------------------------
		 System.out.println("S1 Uppercase: "+s1.toUpperCase());
		 //String to lower case ----------------------------------------------------
		 System.out.println("S2 Lowercase: "+s2.toLowerCase());
		 
		 //Get char from a specified index ------------------------------------------------
		 System.out.println("S1 - Char at 6: "+s1.charAt(6));  
		 System.out.println("S2 - Char at 5: "+s2.charAt(5));  
		 
		 //Remove trailing and leading white spaces-------------------------------------
		 String s3 = "     Hello All     ";
		 //System.out.println("Strip S3: "+s3.str);
		 System.out.println("Strip S3: "+s3.trim());
		 
		 System.out.println("Different ways to compare String-------------------------------------------");
		 if(s1.equals(s5))
			 System.out.println("Strings are equal");
		 else
			 System.out.println("String are not equal");
		 
		 if(s1 == s5)
			 System.out.println("Strings are equal");
		 else
			 System.out.println("String are not equal");
		 
		 if(s1.equals(s4))
			 System.out.println("Strings are equal");
		 else
			 System.out.println("String are not equal");
		 
		 if(s1 == s4)
			 System.out.println("Strings are equal");
		 else
			 System.out.println("String are not equal");
		 
		 /* int string.compareTo(String anotherString)
		  The value 0 if the argument string is equal to this string; 		 
		  value less than 0 if this string is lexicographically less than the string argument;
	      value greater than 0 if this string is lexicographically greater than the string argument.
	    */ 	
		 System.out.println(s1.compareTo(s4));
		 
		 
		 String s6 = "Immutable";
		 System.out.println(s6.hashCode());
		 s6 = "Immutable String";
		 System.out.println(s6.hashCode());
		 
		 System.out.println("------------------------------------------------------------------");
		 
		 String str1 = "oawal";
		 String str2 = "oslpesh";
		 
		 System.out.println(str1.compareTo(str2));

	}

}
