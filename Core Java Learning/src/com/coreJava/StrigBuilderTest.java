package com.coreJava;

/*
 * Java StringBuilder class is used to create mutable (modifiable) String. 
 * The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized and hence faster than StringBuffer
 * 
*/

public class StrigBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello SB");
		
		StringBuilder sb1 = new StringBuilder("Hello SB1");
		
		StringBuilder sb2 = new StringBuilder(30);
		sb2.append("Hello SB2");
		
		System.out.println("SB: "+sb);
		System.out.println("SB1: "+sb1);
		System.out.println("SB2: "+sb2);
		
		System.out.println("SB Capacity: "+sb.capacity());
		System.out.println("SB1 Capacity: "+sb1.capacity());
		System.out.println("SB2 Capacity: "+sb2.capacity());
		
		sb.insert(5, " Updated");
		System.out.println("String Builder insert: "+sb);
		
		char[] charArr = {' ','n','e','w',' ','s','t','r','i','n','g'};
		sb.append(charArr);
		System.out.println("SB with appened array: "+sb);
		
		//String replace ------------------------------------------------------------------------------
		sb.replace(6, 13, "replace");
		System.out.println("SB new string after replace: "+sb);
		
		//string reverse ---------------------------------------------------------------------------------
		System.out.println("SB reverse: "+sb.reverse());
		System.out.println("SB reverse: "+sb.reverse());
	}

}
