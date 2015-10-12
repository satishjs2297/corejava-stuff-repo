package com.alti.practice.string;

/**
 * 
 * @author syandagudita
 * 
 */

public class StringOperations {
	
	public static void main(String... strings) {
		String s1 = new String("A");
		String s2 = "A";
		String s3 = "A";
		System.out.println("s1.hashCode()  :: "+ s1.hashCode());
		System.out.println("s2.hashCode()  :: "+ s2.hashCode());
		System.out.println(">>>>>> equality >>>>> "+(s1.intern() == s2));
		System.out.println(">>>>>> equality >>>>> "+ (s2 == s3));
	}

}
