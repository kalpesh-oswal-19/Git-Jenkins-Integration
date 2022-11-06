package com.coreJava;

public class HashcodeEqualsTest {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Kunal");
		Student s2 = new Student(1,"Kunal");
		Student s3 = s1;
		
		System.out.println("Equality between s1 and s2 = "+ s1.equals(s2));
		System.out.println("Equality between s1 and s3 = "+ s1.equals(s3));
		
		System.out.println("S1 hashcode = "+ s1.hashCode());
		System.out.println("S2 hashcode = "+ s2.hashCode());
		System.out.println("S3 hashcode = "+ s3.hashCode());
		
	}
}
