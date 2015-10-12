package com.alti.practice.string;

public class ReverseStringWithRecursion {

	public static void reverseString(String str) {

		char[] strChar = str.toCharArray();
		StringBuffer strBuff = new StringBuffer("");
		for (int i = strChar.length - 1; i >= 0; i--) {
			strBuff.append(strChar[i]);
		}
		System.out.println("Reverse String :: " + strBuff.toString());
	}
	
	public static void reverseStringWithRecur(char[] charArry,int length){
		
		if(length == 0)
			return;
		System.out.print(charArry[--length]);
		reverseStringWithRecur(charArry,length);
		
	}

	public static void main(String... strings) {
		System.out.println("Begin...");
		String input = "VigAmma2297";
		System.out.println("input :: "+input);
		//reverseString(input);
		reverseStringWithRecur(input.toCharArray(), input.length());
	}

}
